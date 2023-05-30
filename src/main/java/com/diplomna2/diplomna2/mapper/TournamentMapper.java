package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Tournaments;
import com.diplomna2.diplomna2.resources.TournamentsResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TournamentMapper.class, ManagerMapper.class})
public interface TournamentMapper {

    TournamentMapper TOURNAMENT_MAPPER = Mappers.getMapper(TournamentMapper.class);

    Tournaments fromTournamentsResource(TournamentsResource tournamentResource);

    TournamentsResource toTournamentsResource(Tournaments tournament);
}
