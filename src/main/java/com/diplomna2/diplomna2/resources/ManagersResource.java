package com.diplomna2.diplomna2.resources;

import com.diplomna2.diplomna2.entity.Teams;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ManagersResource {

    private Long id;

    private String name;

    private LocalDate birthDay;

    private TeamsResource team;
}
