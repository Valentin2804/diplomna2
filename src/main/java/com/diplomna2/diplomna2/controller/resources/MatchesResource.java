package com.diplomna2.diplomna2.controller.resources;

import lombok.Data;

import java.util.List;

@Data
public class MatchesResource {

    private Long id;

    private int homeTeamGoals;

    private int awayTeamGoals;

    private String homeTeam;

    private String awayTeam;

    private String homeLineUp;

    private String awayLineUp;

    private String tournament;

    private List<PlayersResource> homeGoalScorers;

    private List<PlayersResource> awayGoalScorers;

    private List<PlayersResource> homeGoalAssistants;

    private List<PlayersResource> awayGoalAssistants;
}
