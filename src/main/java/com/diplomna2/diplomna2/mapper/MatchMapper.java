package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Matches;
import com.diplomna2.diplomna2.resources.MatchesResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TeamMapper.class, PlayerMapper.class, LineUpMapper.class, TournamentMapper.class})
public interface MatchMapper {

    MatchMapper MATCH_MAPPER = Mappers.getMapper(MatchMapper.class);

    Matches fromMatchResources(MatchesResource matchResource);

    MatchesResource toMatchResource(Matches matches);
}
