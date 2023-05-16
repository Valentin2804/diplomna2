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

    @ManyToMany(mappedBy = "lineUps")
    private List<Players> players;

    @ManyToOne
    private Teams team;
}
