package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.TeamsResource;

import java.util.List;

public interface TeamsService {

    List<TeamsResource> findAll();

    TeamsResource getById(long teamsId);

    TeamsResource save(TeamsResource team);

    TeamsResource update(TeamsResource resource, long id);

    void delete(long teamId);


}
