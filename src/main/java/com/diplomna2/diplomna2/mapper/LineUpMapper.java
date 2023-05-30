package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.LineUps;
import com.diplomna2.diplomna2.resources.LineUpsResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PlayerMapper.class, MatchMapper.class})
public interface LineUpMapper {

    LineUpMapper LINE_UP_MAPPER = Mappers.getMapper(LineUpMapper.class);

    LineUps fromLineUpResource(LineUpsResource lineUpResource);

    LineUpsResource toLineupResource(LineUps lineUp);
}
