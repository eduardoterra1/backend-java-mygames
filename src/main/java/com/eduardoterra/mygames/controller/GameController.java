package com.eduardoterra.mygames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardoterra.mygames.dto.GameDTO;
import com.eduardoterra.mygames.dto.GameListDTO;
import com.eduardoterra.mygames.dto.GameMinDTO;
import com.eduardoterra.mygames.services.GameService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;    
    } 
}
