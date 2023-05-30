package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Players;
import com.diplomna2.diplomna2.resources.PlayersResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {LineUpMapper.class, MatchMapper.class})
public interface PlayerMapper {

    PlayerMapper PLAYER_MAPPER = Mappers.getMapper(PlayerMapper.class);

    Players fromPlayerResource(PlayersResource playerResource);

    PlayersResource toPlayerResource(Players player);
}
