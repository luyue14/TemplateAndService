package com.ochestrator.model;

import java.util.List;

public class Service {
	//service instance
	private List<Instance> instances;
	private String display_name;
	
	public List<Instance> getInstances() {
		return instances;
	}
	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	
}
