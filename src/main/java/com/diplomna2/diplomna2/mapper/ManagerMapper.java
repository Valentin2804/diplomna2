package com.diplomna2.diplomna2.mapper;

import com.diplomna2.diplomna2.entity.Managers;
import com.diplomna2.diplomna2.controller.resources.ManagersResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = TeamMapper.class)
public interface ManagerMapper {

    ManagerMapper MANAGER_MAPPER = Mappers.getMapper(ManagerMapper.class);

    Managers fromManagersResource(ManagersResource managerResource);

    ManagersResource toManagerResource(Managers manager);
}
