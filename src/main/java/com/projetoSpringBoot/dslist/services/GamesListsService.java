package com.projetoSpringBoot.dslist.services;


import com.projetoSpringBoot.dslist.dto.GameMinDTO;

import com.projetoSpringBoot.dslist.dto.GamesListsDTO;
import com.projetoSpringBoot.dslist.entities.Games;
import com.projetoSpringBoot.dslist.entities.GamesList;
import com.projetoSpringBoot.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesListsService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GamesListsDTO> findAll(){
        List<GamesList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GamesListsDTO(x)).toList();
    }
}
