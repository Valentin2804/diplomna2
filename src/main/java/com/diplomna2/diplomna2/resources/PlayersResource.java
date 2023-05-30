package com.diplomna2.diplomna2.resources;

import com.diplomna2.diplomna2.entity.LineUps;
import com.diplomna2.diplomna2.entity.Matches;
import com.diplomna2.diplomna2.entity.Teams;
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
