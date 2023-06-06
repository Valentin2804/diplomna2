package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.TournamentsResource;

import java.util.List;

public interface TournamentsService {

    List<TournamentsResource> findAll();

    TournamentsResource getById(long tournamentId);

    TournamentsResource save(TournamentsResource tournamentsResource);

    TournamentsResource update(TournamentsResource resource, long id);

    void delete(long tournamentId);
}
