package com.diplomna2.diplomna2.resources;

import com.diplomna2.diplomna2.entity.Matches;
import com.diplomna2.diplomna2.entity.Teams;
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
