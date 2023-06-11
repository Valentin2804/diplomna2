package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.ManagersResource;
import com.diplomna2.diplomna2.entity.Managers;
import com.diplomna2.diplomna2.repository.ManagersRepository;
import com.diplomna2.diplomna2.service.ManagersService;
import com.diplomna2.diplomna2.service.TeamsService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static com.diplomna2.diplomna2.mapper.ManagerMapper.MANAGER_MAPPER;

@Service
@RequiredArgsConstructor
public class ManagersImpl implements ManagersService {

    private final ManagersRepository managersRepository;
    private final TeamsService teamsService;

    @Override
    public List<ManagersResource> findAll() {
        return MANAGER_MAPPER.toManagerResources(managersRepository.findAll());
    }

    @Override
    public ManagersResource getById(long managerId) {
        return MANAGER_MAPPER.toManagerResource(managersRepository.getReferenceById(managerId));
    }

    @Override
    public ManagersResource save(ManagersResource manager) {

        Managers manager1 = MANAGER_MAPPER.fromManagersResource(manager);

        return MANAGER_MAPPER.toManagerResource(managersRepository.save(manager1));
    }

    @Override
    public ManagersResource update(ManagersResource resource, long id) {

        Managers toUpdate = managersRepository.getReferenceById(id);
        toUpdate.setName(resource.getName());

        teamsService.getTeamByName(resource.getTeam().getName()).ifPresentOrElse(toUpdate :: setTeam,
                () -> {
                    throw new EntityNotFoundException("Team with name " + resource.getTeam().getName() + "does not exist in our database");
                });

        return MANAGER_MAPPER.toManagerResource(managersRepository.save(toUpdate));
    }

    @Override
    public Optional<Managers> getManagerByNameAndBirthday(String name, LocalDate birthday) {
        return managersRepository.getManagersByBirthDayAndName(name, birthday);
    }

    @Override
    public void delete(long managerId) {
        managersRepository.deleteById(managerId);
    }
}
