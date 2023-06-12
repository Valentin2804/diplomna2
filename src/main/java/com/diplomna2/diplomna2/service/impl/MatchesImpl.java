package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.MatchesResource;
import com.diplomna2.diplomna2.entity.Matches;
import com.diplomna2.diplomna2.repository.MatchesRepository;
import com.diplomna2.diplomna2.repository.TeamsRepository;
import com.diplomna2.diplomna2.service.MatchesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MatchesImpl implements MatchesService {

    MatchesRepository matchesRepository;
    @Override
    public List<MatchesResource> findAll() {
        return null;
    }

    @Override
    public MatchesResource getById(long matchId) {
        return null;
    }

    @Override
    public MatchesResource save(MatchesResource match) {
        return null;
    }

    @Override
    public MatchesResource update(MatchesResource resource, long id) {
        return null;
    }

    @Override
    public void delete(long matchId) {

    }
}
