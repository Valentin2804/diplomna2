package com.diplomna2.diplomna2.repository;

import com.diplomna2.diplomna2.entity.Managers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManagersRepository extends JpaRepository<Managers, Long> {
    Optional<Managers> getManagersByBirthDayAndName();
}
