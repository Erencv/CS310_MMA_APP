package com.main.web.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.web.model.Fighter;
import java.util.Optional;



public interface FighterRepo extends MongoRepository<Fighter, String>{
	
	public Optional<Fighter> findByFighterId(String fighterId);
	
	

}
