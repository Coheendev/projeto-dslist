package com.projetoSpringBoot.dslist.repositories;

import com.projetoSpringBoot.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games, Long> {


}
