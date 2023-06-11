package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.PlayersResource;
import com.diplomna2.diplomna2.entity.Players;
import com.diplomna2.diplomna2.repository.PlayersRepository;
import com.diplomna2.diplomna2.service.PlayersService;
import com.diplomna2.diplomna2.service.TeamsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.diplomna2.diplomna2.mapper.PlayerMapper.PLAYER_MAPPER;

@Service
@RequiredArgsConstructor
public class PlayersImpl implements PlayersService {

    private final PlayersRepository playersRepository;
    private final TeamsService teamsService;
    @Override
    public List<PlayersResource> findAll() {
        return PLAYER_MAPPER.toPlayerResources(playersRepository.findAll());
    }

    @Override
    public PlayersResource getById(long id) {
        return PLAYER_MAPPER.toPlayerResource(playersRepository.getReferenceById(id));
    }

    @Override
    public PlayersResource save(PlayersResource players) {

        Players players1 = PLAYER_MAPPER.fromPlayerResource(players);

        return PLAYER_MAPPER.toPlayerResource(playersRepository.save(players1));
    }

    @Override
    public PlayersResource update(PlayersResource resource, long id) {

        Players toUpdate = playersRepository.getReferenceById(id);
        toUpdate.setName(resource.getName());
        toUpdate.setPosition(resource.getPosition());

        teamsService.getTeamByName(resource.getTeam()).ifPresentOrElse(toUpdate ::setTeam,
                ()-> {
                    throw new IllegalArgumentException("Team with name " + resource.getTeam() + "does not exists in our database");
                });

        return PLAYER_MAPPER.toPlayerResource(playersRepository.save(toUpdate));
    }

    @Override
    public void delete(long playerId) {
        playersRepository.deleteById(playerId);
    }
}
