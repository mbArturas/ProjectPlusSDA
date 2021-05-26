package com.example.projectplus.database.repositories;

import com.example.projectplus.database.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
