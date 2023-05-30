package com.diplomna2.diplomna2.controller.resources;

import lombok.Data;

import java.util.List;

@Data
public class TeamsResource {

    private Long id;

    private String name;

    private List<LineUpsResource> lineUps;

    private List<PlayersResource> players;

    private String manager;

    private List<TournamentsResource> competitions;

    private List<MatchesResource> homeMatches;

    private List<MatchesResource> awayMatches;
}
