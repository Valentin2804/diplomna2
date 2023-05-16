package com.diplomna2.diplomna2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Managers {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDate birthDay;

    @OneToOne
    private Teams team;
}