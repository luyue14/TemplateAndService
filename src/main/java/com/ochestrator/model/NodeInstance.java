package com.ochestrator.model;

import java.util.List;

public class NodeInstance {
	private String id;
	private String deployment;
	private String host_id;
	//runtime properties
	private Object runtime_properties;
	private List<Object> relationships;
	private String state;
	private int version;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeployment() {
		return deployment;
	}
	public void setDeployment(String deployment) {
		this.deployment = deployment;
	}
	public String getHost_id() {
		return host_id;
	}
	public void setHost_id(String host_id) {
		this.host_id = host_id;
	}
	public Object getRuntime_properties() {
		return runtime_properties;
	}
	public void setRuntime_properties(Object runtime_properties) {
		this.runtime_properties = runtime_properties;
	}
	public List<Object> getRelationships() {
		return relationships;
	}
	public void setRelationships(List<Object> relationships) {
		this.relationships = relationships;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	
}
