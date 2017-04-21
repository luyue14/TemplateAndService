package com.orchestrator.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.orchestrator.model.Blueprint;

//@Repository
public interface BlueprintRepository extends MongoRepository<Blueprint, String> {
	
	//public Blueprint save(Blueprint blueprint);
	//public List<Blueprint> findAll();
	//public List<Blueprint> findByVnid(int id);
	
}
