package com.diplomna2.diplomna2.controller.resources;

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
