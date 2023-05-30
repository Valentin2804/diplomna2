package com.diplomna2.diplomna2.controller.resources;

import com.diplomna2.diplomna2.controller.resources.LineUpsResource;
import com.diplomna2.diplomna2.controller.resources.MatchesResource;
import lombok.Data;

import java.util.List;

@Data
public class PlayersResource {

    private Long id;

    private String name;

    private int apps;

    private int cls;

    private String position;

    private List<LineUpsResource> lineUps;

    private String team;

    private List<MatchesResource> homeMatchGoals;

    private List<MatchesResource> awayMatchGoals;

    private List<MatchesResource> homeMatchAssists;

    private List<MatchesResource> awayMatchAssists;
}
