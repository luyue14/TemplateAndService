package com.orchestrator.mongo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClientURI;
import com.orchestrator.util.GetConfig;

@Configurable
@Component
public class MyMongoTemplate{
	
	@Bean(name="MongoTemplate")
	public MongoTemplate template() throws Exception {
		// TODO Auto-generated method stub
		SimpleMongoDbFactory test = null;
		GetConfig getConfig = new GetConfig("config.properties");
		//getConfig.setConfigFile("vnconfig.properties");
		MongoClientURI uri = new MongoClientURI("mongodb://"+getConfig.getValue("ip")+
		":"+getConfig.getValue("port")+
		"/"+getConfig.getValue("database"));


		try {
			test =new SimpleMongoDbFactory(uri);
			System.out.println("Template and service database connection established.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new MongoTemplate(test);
	}
}