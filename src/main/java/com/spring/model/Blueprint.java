package com.spring.model;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Blueprint {
	private String id;
	private String description;
	private String main_file_name;
	private Map<String, String> plan;
	private Date create_at;
	private Date updatated_at;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMain_file_name() {
		return main_file_name;
	}
	public void setMain_file_name(String main_file_name) {
		this.main_file_name = main_file_name;
	}
	public Map<String, String> getPlan() {
		return plan;
	}
	public void setPlan(Map<String, String> plan) {
		this.plan = plan;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdatated_at() {
		return updatated_at;
	}
	public void setUpdatated_at(Date updatated_at) {
		this.updatated_at = updatated_at;
	}
	
	
}
