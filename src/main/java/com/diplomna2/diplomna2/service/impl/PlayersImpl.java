package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.PlayersResource;
import com.diplomna2.diplomna2.repository.PlayersRepository;
import com.diplomna2.diplomna2.service.PlayersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.diplomna2.diplomna2.mapper.PlayerMapper.PLAYER_MAPPER;

@Service
@RequiredArgsConstructor
public class PlayersImpl implements PlayersService {

    private final PlayersRepository playersRepository;
    @Override
    public List<PlayersResource> findAll() {
        return PLAYER_MAPPER.toPlayerResources(playersRepository.findAll());
    }

    @Override
    public PlayersResource getById(long id) {
        return null;
    }

    @Override
    public PlayersResource save(PlayersResource players) {
        return null;
    }

    @Override
    public PlayersResource update(PlayersResource resource, long id) {
        return null;
    }

    @Override
    public void delete(long playerId) {

    }
}
