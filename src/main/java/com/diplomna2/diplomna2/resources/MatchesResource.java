package com.diplomna2.diplomna2.resources;

import com.diplomna2.diplomna2.entity.LineUps;
import com.diplomna2.diplomna2.entity.Players;
import com.diplomna2.diplomna2.entity.Teams;
import com.diplomna2.diplomna2.entity.Tournaments;
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
