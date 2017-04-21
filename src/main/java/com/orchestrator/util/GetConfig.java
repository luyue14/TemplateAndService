package com.orchestrator.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetConfig{
	
	Logger logger = LoggerFactory.getLogger(GetConfig.class);

	private  Properties config=null;  
	private String Ip;
	private String port;
	private String configFile;	
	
	public GetConfig(String configFile) {
		// TODO Auto-generated constructor stub
		setConfigFile(configFile);
	}
	
    public Properties load(){
		String path="";
		try{
			path = this.getClass().getResource("").toURI().getPath();
		} catch (URISyntaxException e1){
			logger.error("URI syntax Exception!");
		}
        File com = new File(path).getParentFile().getParentFile().getParentFile();  
        File root=com.getParentFile().getParentFile().getParentFile().getParentFile();  
        File external=new File(root.getAbsolutePath()+"/"+configFile);  
		InputStream is = null;
		if(external.exists()) {
			try{
				is = new FileInputStream(external);
			}catch (FileNotFoundException e){
				logger.error("File not found Exception!");
			}
		}else{
			logger.error("can not find config file from:"+external.getAbsolutePath());
			is = GetConfig.class.getClassLoader().getResourceAsStream(configFile);
		}
		
		if(is==null) {
			is = GetConfig.class.getClassLoader().getResourceAsStream("/"+configFile);
		}
		
		try{
			config = new Properties();
			config.load(is);
		}catch(FileNotFoundException e) {
			logger.error("can not find file");
		}catch(IOException e){
			logger.error("io exception");
		}
		
		logger.info("Config loaded");
		return config;

	}
	
    public  String getValue(String key) {  
        return config.getProperty(key, ""	);  
    } 

	public Properties getConfig() {
		return config;
	}

	public void setConfig(Properties config) {
		this.config = config;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getConfigFile() {
		return configFile;
	}

	public void setConfigFile(String configFile) {
		this.configFile = configFile;
		load();
	}

	
}