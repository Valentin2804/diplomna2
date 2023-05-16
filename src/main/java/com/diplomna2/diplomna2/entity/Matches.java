package com.diplomna2.diplomna2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class Matches {
    @Id
    @GeneratedValue
    private Long id;

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
}
