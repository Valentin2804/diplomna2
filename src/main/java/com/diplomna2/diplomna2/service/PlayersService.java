package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.PlayersResource;
import com.diplomna2.diplomna2.entity.Players;

import java.util.List;
import java.util.Optional;

public interface PlayersService {

    List<PlayersResource> findAll();

    PlayersResource getById(long id);

    PlayersResource save(PlayersResource players);

    PlayersResource update(PlayersResource resource, long id);

    Optional<Players> getPlayerByNameAndPosition(String name, String position);

    void delete(long playerId);
}
