package com.diplomna2.diplomna2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Tournaments {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int numOfParticipants;

    @ManyToMany
    @JoinTable(name = "tournament_team",
            joinColumns = @JoinColumn(name = "tournament_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id"))
    private List<Teams> participants;

    @OneToMany (mappedBy = "tournament")
    private List<Matches> matches;
}
