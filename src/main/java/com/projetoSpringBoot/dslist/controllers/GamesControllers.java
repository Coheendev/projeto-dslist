package com.projetoSpringBoot.dslist.controllers;

import com.projetoSpringBoot.dslist.dto.GameMinDTO;
import com.projetoSpringBoot.dslist.dto.GamesDTO;
import com.projetoSpringBoot.dslist.entities.Games;
import com.projetoSpringBoot.dslist.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesControllers {
    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GameMinDTO>findAll(){
        List<GameMinDTO> result = gamesService.findAll();
        return result;

    }
    @GetMapping(value = "/{id}")
    public GamesDTO findById(@PathVariable long id){
        GamesDTO result = gamesService.findById(id);
        return result;

    }

}
