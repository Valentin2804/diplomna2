package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.ManagersResource;
import com.diplomna2.diplomna2.entity.Managers;

import java.util.List;

public interface ManagersService {

    List<ManagersResource> findAll();

    ManagersResource getById(long managerId);

    ManagersResource save(ManagersResource manager);

    ManagersResource update(ManagersResource resource, long id);

    void delete(long managerId);
}
