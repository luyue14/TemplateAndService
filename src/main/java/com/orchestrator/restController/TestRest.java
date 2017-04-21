package com.orchestrator.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableMongoRepositories("com.orchestator.model")
@RestController
@RequestMapping("/test")
public class TestRest{
	
	@Autowired
	private BlueprintRepository blueprintRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String test(){
		System.out.print("hhh");

		Blueprint blueprint = new Blueprint();
		blueprint.setId("hsafhasdildhfajl");
		//blueprintRepository.save(blueprint);
		return "test";
	}
	
}