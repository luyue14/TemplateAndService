package com.orchestrator.model;

import java.util.List;

public class Status {
	private String status;
	private List<Service> services;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return "Status [status=" + status + ", services=" + services + "]";
	}
	
	
}
