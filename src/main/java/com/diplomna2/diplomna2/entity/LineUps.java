package com.diplomna2.diplomna2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class LineUps {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int formation;

    @ManyToMany(mappedBy = "lineUps")
    private List<Players> players;

    @ManyToOne
    private Teams team;

    @OneToMany (mappedBy = "homeLineUp")
    private List<Matches> homeLineUps;

    @OneToMany (mappedBy = "awayLineUp")
    private List<Matches> awayLineUps;
}
