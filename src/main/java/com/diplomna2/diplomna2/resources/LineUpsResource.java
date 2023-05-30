package com.diplomna2.diplomna2.resources;

import com.diplomna2.diplomna2.entity.Matches;
import com.diplomna2.diplomna2.entity.Players;
import com.diplomna2.diplomna2.entity.Teams;
import lombok.Data;

import java.util.List;

@Data
public class LineUpsResource {

    private Long id;

    private String name;

    private int formation;

    private List<PlayersResource> players;

    private String team;

    private List<MatchesResource> homeLineUps;

    private List<MatchesResource> awayLineUps;
}
