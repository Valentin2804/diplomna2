package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.MatchesResource;
import com.diplomna2.diplomna2.entity.Matches;

import java.util.List;
import java.util.Optional;

public interface MatchesService {

    List<MatchesResource> findAll();

    MatchesResource getById(long matchId);

    MatchesResource save(MatchesResource match);

    MatchesResource update(MatchesResource resource, long id);

    void delete(long matchId);
}
