package com.diplomna2.diplomna2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Players {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "lineup_players",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "lineup_id")
    )
    private List<LineUps> lineUps;

    @ManyToOne
    private Teams team;

    @ManyToMany(mappedBy = "homeGoalScorers")
    private List<Matches> homeGoalMatches;

    @ManyToMany(mappedBy = "awayGoalScorers")
    private List<Matches> awayGoalMatches;

    @ManyToMany(mappedBy = "homeGoalAssistants")
    private List<Matches> homeGoalAssistants;

    @ManyToMany(mappedBy = "awayGoalAssistants")
    private List<Matches> awayGoalAssistants;
}
