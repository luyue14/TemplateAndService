package com.orchestrator.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

public class Blueprint {
	
	@Id
	private String id = new String();
	private String description = new String();
	private String main_file_name = new String();
	private Map<String, String> plan = new HashMap<String, String>();
	private Date create_at = new Date();
	private Date updatated_at = new Date();
	
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
	@Override
	public String toString() {
		return "Blueprint [id=" + id + ", description=" + description + ", main_file_name=" + main_file_name + ", plan="
				+ plan + ", create_at=" + create_at + ", updatated_at=" + updatated_at + "]";
	}
	
	
}
