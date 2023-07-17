package com.projetoSpringBoot.dslist.repositories;


import com.projetoSpringBoot.dslist.entities.GamesList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GamesList, Long> {


}
