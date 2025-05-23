package com.eduardoterra.mygames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardoterra.mygames.dto.GameListDTO;
import com.eduardoterra.mygames.dto.GameMinDTO;
import com.eduardoterra.mygames.entities.Game;
import com.eduardoterra.mygames.entities.GameList;
import com.eduardoterra.mygames.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
