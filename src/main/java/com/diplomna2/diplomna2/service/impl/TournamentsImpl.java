package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.TournamentsResource;
import com.diplomna2.diplomna2.entity.Tournaments;
import com.diplomna2.diplomna2.repository.MatchesRepository;
import com.diplomna2.diplomna2.repository.TeamsRepository;
import com.diplomna2.diplomna2.repository.TournamentsRepository;
import com.diplomna2.diplomna2.service.TournamentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.diplomna2.diplomna2.mapper.TournamentMapper.TOURNAMENT_MAPPER;

@Service
@RequiredArgsConstructor
public class TournamentsImpl implements TournamentsService {
    private final TournamentsRepository tournamentsRepository;
    private final MatchesRepository matchesService;
    private final TeamsRepository teamsService;

    @Override
    public List<TournamentsResource> findAll() {
        return TOURNAMENT_MAPPER.toTournamentsResources(tournamentsRepository.findAll());
    }

    @Override
    public TournamentsResource getById(long tournamentId) {
        return TOURNAMENT_MAPPER.toTournamentsResource(tournamentsRepository.getReferenceById(tournamentId));
    }

    @Override
    public TournamentsResource save(TournamentsResource tournamentsResource) {

        Tournaments tournaments = TOURNAMENT_MAPPER.fromTournamentsResource(tournamentsResource);

        return null;
    }

    @Override
    public TournamentsResource update(TournamentsResource resource, long id) {
        return null;
    }

    @Override
    public void delete(long tournamentId) {

    }
}
