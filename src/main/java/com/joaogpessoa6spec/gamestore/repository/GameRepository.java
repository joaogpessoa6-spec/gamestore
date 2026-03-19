package com.joaogpessoa6spec.gamestore.repository;


import org.springframework.data.repository.CrudRepository;

import com.joaogpessoa6spec.gamestore.model.Game;

public interface GameRepository extends CrudRepository<Game, Integer>{
    
}
