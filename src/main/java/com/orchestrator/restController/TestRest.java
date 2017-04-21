package com.orchestrator.restController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orchestrator.model.Blueprint;
import com.orchestrator.service.TestService;

@EnableMongoRepositories("com.orchestrator.model")
@RestController
@RequestMapping("/test")
public class TestRest{
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String test(){
		System.out.print("hhh");

		Blueprint blueprint = new Blueprint();
		blueprint.setId("hsafhasdildhfajl");
		Blueprint tt = testService.findById("test");
		System.out.println(tt);
		return "test";
	}
	
}