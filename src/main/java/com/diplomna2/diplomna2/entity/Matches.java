package com.diplomna2.diplomna2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Matches {
    @Id
    @GeneratedValue
    private Long id;

    private int homeTeamGoals;

    private int awayTeamGoals;

    @ManyToOne
    private Teams homeTeam;

    @ManyToOne
    private Teams awayTeam;

    @ManyToOne
    private LineUps homeLineUp;

    @ManyToOne
    private LineUps awayLineUp;

    @ManyToOne
    private Tournaments tournament;

    @ManyToMany
    @JoinTable(
            name = "match_home_goal_scorers",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id")
    )
    private List<Players> homeGoalScorers;

    @ManyToMany
    @JoinTable(
            name = "match_away_goal_scorers",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id")
    )
    private List<Players> awayGoalScorers;

    @ManyToMany
    @JoinTable(
            name = "match_home_goal_assistants",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id")
    )
    private List<Players> homeGoalAssistants;

    @ManyToMany
    @JoinTable(
            name = "match_away_goal_assistants",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id")
    )
    private List<Players> awayGoalAssistants;
}
