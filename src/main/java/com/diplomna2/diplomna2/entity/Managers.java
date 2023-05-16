package com.diplomna2.diplomna2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Managers {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Teams team;
}