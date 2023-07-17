package com.projetoSpringBoot.dslist.services;


import com.projetoSpringBoot.dslist.dto.GameMinDTO;
import com.projetoSpringBoot.dslist.dto.GamesDTO;
import com.projetoSpringBoot.dslist.entities.Games;
import com.projetoSpringBoot.dslist.projections.GameMinProjection;
import com.projetoSpringBoot.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GamesDTO findById(Long id){
        Games result = gameRepository.findById(id).get();
        return new GamesDTO(result);

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Games> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
