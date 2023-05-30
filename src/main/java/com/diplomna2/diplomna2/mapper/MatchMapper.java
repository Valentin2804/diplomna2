package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Matches;
import com.diplomna2.diplomna2.controller.resources.MatchesResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TeamMapper.class, PlayerMapper.class, LineUpMapper.class, TournamentMapper.class})
public interface MatchMapper {

    MatchMapper MATCH_MAPPER = Mappers.getMapper(MatchMapper.class);

    @Mapping(target = "awayTeam.name", source = "matchesResource.awayTeam")
    @Mapping(target = "homeTeam.name", source = "matchesResource.homeTeam")
    @Mapping(target = "tournament.name", source = "tournamentsResource.tournament")
    Matches fromMatchResources(MatchesResource matchResource);

    @Mapping(target = "awayTeam", source = "match.awayTeam.name")
    @Mapping(target = "homeTeam", source = "match.homeTeam.name")
    @Mapping(target = "tournament", source = "match.tournament.name")
    MatchesResource toMatchResource(Matches matches);
}
