package com.orchestrator.restController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orchestrator.service.DownloadService;

@EnableMongoRepositories("com.orchestrator.model")
@RestController
@RequestMapping("/get/blueprint/{blueprintId}")
public class DownloadBlueprint{
	
	@Autowired
	private DownloadService downloadService;
	
	@RequestMapping(method = RequestMethod.GET)
	public void download(@PathVariable("blueprintId") String blueprintId, HttpServletRequest request, HttpServletResponse response){
		downloadService.download("", blueprintId+".csra", request, response);
		return;
	}
	
}