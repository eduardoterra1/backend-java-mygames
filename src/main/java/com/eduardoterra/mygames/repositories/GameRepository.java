package com.eduardoterra.mygames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardoterra.mygames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
