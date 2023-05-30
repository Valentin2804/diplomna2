package com.diplomna2.diplomna2.resources;

import com.diplomna2.diplomna2.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class TeamsResource {

    private Long id;

    private String name;

    private List<LineUpsResource> lineUps;

    private List<PlayersResource> players;

    private String manager;

    private List<TournamentsResource> competitions;

    private List<MatchesResource> homeMatches;

    private List<MatchesResource> awayMatches;
}
