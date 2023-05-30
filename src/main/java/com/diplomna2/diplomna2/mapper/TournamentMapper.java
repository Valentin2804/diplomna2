package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Tournaments;
import com.diplomna2.diplomna2.controller.resources.TournamentsResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TournamentMapper.class, ManagerMapper.class})
public interface TournamentMapper {

    TournamentMapper TOURNAMENT_MAPPER = Mappers.getMapper(TournamentMapper.class);

    @Mapping(target = "participants.name", source = "tournamentsResource.participants")
    Tournaments fromTournamentsResource(TournamentsResource tournamentResource);

    @Mapping(target = "participants", source = "tournaments.participants.name")
    TournamentsResource toTournamentsResource(Tournaments tournament);
}
