package com.projetoSpringBoot.dslist.services;


import com.projetoSpringBoot.dslist.dto.GameMinDTO;
import com.projetoSpringBoot.dslist.entities.Games;
import com.projetoSpringBoot.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Games> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
