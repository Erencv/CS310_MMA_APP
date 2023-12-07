package com.main.web.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.web.model.Comment;
import java.util.List;


public interface CommentRepo extends MongoRepository<Comment, String>{
	
	public List<Comment> findByFightId(String fightId);
	
}
