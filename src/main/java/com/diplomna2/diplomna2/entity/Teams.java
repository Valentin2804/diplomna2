package com.diplomna2.diplomna2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Teams {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany (mappedBy = "teams")
    private List<LineUps> lineUps;
}
