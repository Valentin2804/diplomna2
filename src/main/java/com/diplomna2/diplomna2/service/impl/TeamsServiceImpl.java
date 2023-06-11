package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.TeamsResource;
import com.diplomna2.diplomna2.entity.Teams;
import com.diplomna2.diplomna2.repository.TeamsRepository;
import com.diplomna2.diplomna2.service.TeamsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.diplomna2.diplomna2.mapper.TeamMapper.TEAM_MAPPER;

@Service
@RequiredArgsConstructor
public class TeamsServiceImpl implements TeamsService {

    private final TeamsRepository teamsRepository;

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
        return null;
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
