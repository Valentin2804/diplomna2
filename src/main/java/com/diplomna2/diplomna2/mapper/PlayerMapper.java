package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Players;
import com.diplomna2.diplomna2.controller.resources.PlayersResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {LineUpMapper.class, MatchMapper.class})
public interface PlayerMapper {

    PlayerMapper PLAYER_MAPPER = Mappers.getMapper(PlayerMapper.class);

    @Mapping(target = "team.name", source = "playerResource.team")
    Players fromPlayerResource(PlayersResource playerResource);


    @Mapping(target = "team", source = "player.team.name")
    PlayersResource toPlayerResource(Players player);

    List<PlayersResource> toPlayerResources(List<Players> players);
}
