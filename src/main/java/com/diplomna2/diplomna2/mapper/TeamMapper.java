package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Teams;
import com.diplomna2.diplomna2.resources.TeamsResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {LineUpMapper.class, PlayerMapper.class, TournamentMapper.class, MatchMapper.class})
public interface TeamMapper {

    TeamMapper TEAM_MAPPER = Mappers.getMapper(TeamMapper.class);

    Teams fromTeamsResource(TeamsResource resource);

    TeamsResource toTeamsResource(Teams team);
}
