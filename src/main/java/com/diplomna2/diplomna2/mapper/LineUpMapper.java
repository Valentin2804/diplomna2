package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.LineUps;
import com.diplomna2.diplomna2.controller.resources.LineUpsResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PlayerMapper.class, MatchMapper.class})
public interface LineUpMapper {

    LineUpMapper LINE_UP_MAPPER = Mappers.getMapper(LineUpMapper.class);

    @Mapping(target = "team.name", source = "lineUpResource.team")
    LineUps fromLineUpResource(LineUpsResource lineUpResource);

    @Mapping(target = "team", source = "lineUp.team.name")
    LineUpsResource toLineupResource(LineUps lineUp);
}
