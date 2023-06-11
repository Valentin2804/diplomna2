package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.ManagersResource;
import com.diplomna2.diplomna2.entity.Managers;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ManagersService {

    List<ManagersResource> findAll();

    ManagersResource getById(long managerId);

    ManagersResource save(ManagersResource manager);

    ManagersResource update(ManagersResource resource, long id);

    Optional<Managers> getManagerByNameAndBirthday(String name, LocalDate birthday);

    void delete(long managerId);
}
