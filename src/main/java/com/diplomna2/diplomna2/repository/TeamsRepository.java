package com.diplomna2.diplomna2.repository;

import com.diplomna2.diplomna2.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamsRepository extends JpaRepository<Teams, Long> {
    Optional<Teams> getTeamsByName(String name);
}
