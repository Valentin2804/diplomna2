package com.diplomna2.diplomna2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Teams {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<LineUps> lineUps;

    @OneToMany(mappedBy = "team")
    private List<Players> players;

    @OneToOne
    private Managers manager;

    @ManyToMany(mappedBy = "participants")
    private List<Tournaments> competitions;

    @OneToMany(mappedBy = "homeTeam")
    private List<Matches> homeMatches;

    @OneToMany(mappedBy = "awayTeam")
    private List<Matches> awayMatches;

    public void addPlayer(Players player)
    {
        players.add(player);
    }
}
