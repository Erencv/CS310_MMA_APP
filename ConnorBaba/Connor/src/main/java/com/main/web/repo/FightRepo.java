package com.main.web.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.web.model.Fight;
import java.util.Optional;
import java.util.List;



//sikinti olursa Optional i Liste cevir 

public interface FightRepo extends MongoRepository<Fight, String>{
	
	
	public Optional<Fight> findByFightId(String fightId);
	public List<Fight> findByYear(int year);

}
