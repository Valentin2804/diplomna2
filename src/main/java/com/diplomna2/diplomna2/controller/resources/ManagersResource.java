package com.diplomna2.diplomna2.controller.resources;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ManagersResource {

    private Long id;

    private String name;

    private LocalDate birthDay;

    private TeamsResource team;
}
