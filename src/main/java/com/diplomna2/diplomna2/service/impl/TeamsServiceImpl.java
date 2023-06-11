package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.TeamsResource;
import com.diplomna2.diplomna2.entity.Teams;
import com.diplomna2.diplomna2.repository.TeamsRepository;
import com.diplomna2.diplomna2.service.ManagersService;
import com.diplomna2.diplomna2.service.PlayersService;
import com.diplomna2.diplomna2.service.TeamsService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.diplomna2.diplomna2.mapper.TeamMapper.TEAM_MAPPER;

@Service
@RequiredArgsConstructor
public class TeamsServiceImpl implements TeamsService {

    private final TeamsRepository teamsRepository;

    private final ManagersService managersService;
    private final PlayersService playersService;

    @Override
    public List<TeamsResource> findAll() {
        return TEAM_MAPPER.toTeamsResources(teamsRepository.findAll());
    }

    @Override
    public TeamsResource getById(long teamsId) {
        return TEAM_MAPPER.toTeamsResource(teamsRepository.getReferenceById(teamsId));
    }

    @Override
    public TeamsResource save(TeamsResource team) {

        Teams team1 = TEAM_MAPPER.fromTeamsResource(team);

        managersService.getManagerByNameAndBirthday(team1.getManager().getName(), team1.getManager().getBirthDay())
                .ifPresentOrElse(team1::setManager,
                        () -> {
                    throw new EntityNotFoundException("Manager with name " + team1.getManager().getName() +
                            " and birthday " + team1.getManager().getBirthDay() + " not found");
                        });

        playersService

        return TEAM_MAPPER.toTeamsResource(teamsRepository.save(team1));
    }

    @Override
    public TeamsResource update(TeamsResource resource, long id) {
        return null;
    }

    @Override
    public Optional<Teams> getTeamByName(String name) {
        return teamsRepository.getTeamsByName(name);
    }

    @Override
    public void delete(long teamId) {

    }
}
