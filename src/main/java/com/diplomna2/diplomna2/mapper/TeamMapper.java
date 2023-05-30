package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Teams;
import com.diplomna2.diplomna2.controller.resources.TeamsResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {LineUpMapper.class, PlayerMapper.class, TournamentMapper.class, MatchMapper.class, ManagerMapper.class})
public interface TeamMapper {

    TeamMapper TEAM_MAPPER = Mappers.getMapper(TeamMapper.class);

    @Mapping(target = "manager.name", source = "teamsResource.manager")
    Teams fromTeamsResource(TeamsResource teamsResource);

    @Mapping(target = "manager", source = "team.manager.name")
    TeamsResource toTeamsResource(Teams team);
}
