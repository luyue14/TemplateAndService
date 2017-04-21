package com.orchestrator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.orchestrator.model.Blueprint;


@Service
public class TestService{
	@Autowired
	@Qualifier("MongoTemplate")
	MongoTemplate mongoTemplate;
	public Blueprint findById(String id){
		Blueprint blueprint = new Blueprint();
		try{
			blueprint = mongoTemplate.findOne(new Query(Criteria.where("id").is(id)),Blueprint.class); 
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Can not find blueprint by id = " + id);
		}
		return blueprint;
	}
}