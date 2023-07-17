package com.projetoSpringBoot.dslist.dto;

import com.projetoSpringBoot.dslist.entities.GamesList;

public class GamesListsDTO {

    private long id;
    private String name;

    public GamesListsDTO(){}

    public GamesListsDTO(GamesList entity) {
       id = entity.getId();
       name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
