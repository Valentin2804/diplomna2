package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Tournaments;
import com.diplomna2.diplomna2.controller.resources.TournamentsResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {TeamMapper.class, MatchMapper.class})
public interface TournamentMapper {

    TournamentMapper TOURNAMENT_MAPPER = Mappers.getMapper(TournamentMapper.class);

    Tournaments fromTournamentsResource(TournamentsResource tournamentResource);

    TournamentsResource toTournamentsResource(Tournaments tournament);

    List<TournamentsResource> toTournamentsResources(List<Tournaments> tournaments);
}
