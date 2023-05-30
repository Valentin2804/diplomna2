package com.diplomna2.diplomna2.controller.resources;

import com.diplomna2.diplomna2.controller.resources.MatchesResource;
import com.diplomna2.diplomna2.controller.resources.TeamsResource;
import lombok.Data;

import java.util.List;

@Data
public class TournamentsResource {

    private Long id;

    private String name;

    private int numOfParticipants;

    private List<TeamsResource> participants;

    private List<MatchesResource> matches;
}
