package com.projetoSpringBoot.dslist.controllers;

import com.projetoSpringBoot.dslist.dto.GameMinDTO;
import com.projetoSpringBoot.dslist.dto.GamesDTO;
import com.projetoSpringBoot.dslist.dto.GamesListsDTO;
import com.projetoSpringBoot.dslist.services.GamesListsService;
import com.projetoSpringBoot.dslist.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GamesListsControllers {
    @Autowired
    private GamesListsService gamesListsService;
    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GamesListsDTO>findAll(){
        List<GamesListsDTO> result = gamesListsService.findAll();
        return result;

    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO>findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gamesService.findByList(listId);
        return result;

    }


}
