package com.diplomna2.diplomna2.repository;

import com.diplomna2.diplomna2.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.Position;
import java.util.Optional;

public interface PlayersRepository extends JpaRepository<Players, Long> {
    Optional<Players> getPlayersByNameAndPosition(String name, String position);
}
