package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.TeamsResource;
import com.diplomna2.diplomna2.entity.Managers;
import com.diplomna2.diplomna2.entity.Teams;

import java.util.List;
import java.util.Optional;

public interface TeamsService {

    List<TeamsResource> findAll();

    TeamsResource getById(long teamsId);

    TeamsResource save(TeamsResource team);

    TeamsResource update(TeamsResource resource, long id);

    Optional<Teams> getTeamByName(String name);

    void delete(long teamId);


}
