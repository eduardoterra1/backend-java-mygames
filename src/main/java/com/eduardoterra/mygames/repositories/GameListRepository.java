package com.eduardoterra.mygames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardoterra.mygames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
