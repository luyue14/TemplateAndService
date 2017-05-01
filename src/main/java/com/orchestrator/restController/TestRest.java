package com.orchestrator.restController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orchestrator.model.Blueprint;
import com.orchestrator.service.DownloadService;
import com.orchestrator.service.TestService;

@EnableMongoRepositories("com.orchestrator.model")
@RestController
@RequestMapping("/test")
public class TestRest{
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private DownloadService downloadService;
	
	@RequestMapping(method = RequestMethod.GET)
	public void test(HttpServletRequest request, HttpServletResponse response){
		//downloadService.download( "", "test.txt", request, response);
		downloadService.download( "blueprint/", "test.txt", request, response);

		return;
		
	}
	
}