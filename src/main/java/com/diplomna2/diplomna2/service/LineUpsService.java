package com.diplomna2.diplomna2.service;

import com.diplomna2.diplomna2.controller.resources.LineUpsResource;

import java.util.List;

public interface LineUpsService {

    List<LineUpsResource> findAll();

    LineUpsResource getById(long lineUpId);

    LineUpsResource save(LineUpsResource lineUp);

    LineUpsResource update(LineUpsResource resource, long id);

    void delete(long lineUpId);
}
