package com.diplomna2.diplomna2.service.impl;

import com.diplomna2.diplomna2.controller.resources.LineUpsResource;
import com.diplomna2.diplomna2.service.LineUpsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LineUpsImpl implements LineUpsService {
    @Override
    public List<LineUpsResource> findAll() {
        return null;
    }

    @Override
    public LineUpsResource getById(long lineUpId) {
        return null;
    }

    @Override
    public LineUpsResource save(LineUpsResource lineUp) {
        return null;
    }

    @Override
    public LineUpsResource update(LineUpsResource resource, long id) {
        return null;
    }

    @Override
    public void delete(long lineUpId) {

    }
}
