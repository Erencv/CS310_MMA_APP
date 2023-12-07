package com.main.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.web.model.Comment;
import com.main.web.model.Fight;
import com.main.web.model.Fighter;
import com.main.web.repo.CommentRepo;
import com.main.web.repo.FightRepo;
import com.main.web.repo.FighterRepo;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("/connor")
public class fightRestController {

	@Autowired private FighterRepo fighterRepository;
	@Autowired private FightRepo fightRepository;
	@Autowired private CommentRepo commentRepository;
	
	
	@PostConstruct
	public void init() {
		if(fightRepository.count() == 0) {
			Fight myEvent = new Fight("_id", "fight1", "eventnam", 2020, "asasdd", "asdsdf", "qwfeert", true);
			
			fightRepository.save(myEvent);
			
			myEvent = new Fight("_id1", "fight2", "eventnam", 2020, "asasdd", "asdsdf", "qwfeert", true);
			fightRepository.save(myEvent);
			myEvent = new Fight("_id3", "fight3", "eventnam", 2023, "asasdd", "asdsdf", "qwfeert", true);
			fightRepository.save(myEvent);

		}
		
		
		
		
		
	}
	
	@GetMapping("/comment/{fightId}")
	public List<Comment> findCommentById(@PathVariable("fightId") String fightId){
		return commentRepository.findByFightId(fightId);
		
	}
	
	@PostMapping("/comment/save")
	public Comment saveComment(@RequestBody Comment comment) {
		
		Comment commentSaved = commentRepository.save(comment);
		return commentSaved;
		
	}
	

	@GetMapping("/fighter/{fighterId}")
	public Optional<Fighter> findFighterById(@PathVariable("fighterId") String id){
		return fighterRepository.findByFighterId(id);
	}
	
	@GetMapping("/fight/byid/{fightId}")
	public Optional<Fight> findFightById(@PathVariable("fightId") String id){
		return fightRepository.findByFightId(id);
	}
	
	@GetMapping("/fight/byyear/{year}")
	public List<Fight> findFightByYear(@PathVariable("year") int year){
		return fightRepository.findByYear(year);
	}
	
	
	
	
	
	
	
}


