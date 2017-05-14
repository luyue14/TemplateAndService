package com.orchestrator.mongo;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.orchestrator.util.GetConfig;

import org.slf4j.Logger;


@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	private static Logger logger = LoggerFactory.getLogger(MongoConfig.class);

	@Override
	protected String getDatabaseName() {
		GetConfig getConfig = new GetConfig("config.properties");
		String database = getConfig.getValue("database");
		return database;
	}

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		MongoClient mongoClient = null;
		GetConfig getConfig = new GetConfig("config.properties");

		try {
			mongoClient = new MongoClient(new ServerAddress(getConfig.getValue("ip"),new Integer(getConfig.getValue("port"))));
			logger.info("NMS DB connection established.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mongoClient;
	}
}
