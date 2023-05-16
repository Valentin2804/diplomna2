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

    @ManyToMany(mappedBy = "team")
    private List<Players> players;

    @ManyToOne
    private Teams team;

    @OneToMany (mappedBy = "match")
    private List<Matches> homeLineUps;

    @OneToMany (mappedBy = "match")
    private List<Matches> awayLineUps;
}
