package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Matches;
import com.diplomna2.diplomna2.controller.resources.MatchesResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PlayerMapper.class})
public interface MatchMapper {

    MatchMapper MATCH_MAPPER = Mappers.getMapper(MatchMapper.class);

    @Mapping(target = "awayTeam.name", source = "matchesResource.awayTeam")
    @Mapping(target = "homeTeam.name", source = "matchesResource.homeTeam")
    @Mapping(target = "tournament.name", source = "matchesResource.tournament")
    @Mapping(target = "homeLineUp.name", source = "matchesResource.homeLineUp")
    @Mapping(target = "awayLineUp.name", source = "matchesResource.awayLineUp")
    Matches fromMatchResources(MatchesResource matchesResource);

    @Mapping(target = "awayTeam", source = "matches.awayTeam.name")
    @Mapping(target = "homeTeam", source = "matches.homeTeam.name")
    @Mapping(target = "tournament", source = "matches.tournament.name")
    @Mapping(target = "homeLineUp", source = "matches.homeLineUp.name")
    @Mapping(target = "awayLineUp", source = "matches.awayLineUp.name")
    MatchesResource toMatchResource(Matches matches);
}
