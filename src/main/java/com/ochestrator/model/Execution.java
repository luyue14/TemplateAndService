package com.ochestrator.model;

import java.util.Date;
import java.util.Map;

public class Execution {
	private String id;
	private String workflow_id;
	private String blueprint_id;
	private String deployment_id;
	private String status;
	private String error;
	private Date created_at;
	private Map<String, String> parameters;
	private boolean is_system_workflow;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWorkflow_id() {
		return workflow_id;
	}
	public void setWorkflow_id(String workflow_id) {
		this.workflow_id = workflow_id;
	}
	public String getBlueprint_id() {
		return blueprint_id;
	}
	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}
	public String getDeployment_id() {
		return deployment_id;
	}
	public void setDeployment_id(String deployment_id) {
		this.deployment_id = deployment_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	public boolean isIs_system_workflow() {
		return is_system_workflow;
	}
	public void setIs_system_workflow(boolean is_system_workflow) {
		this.is_system_workflow = is_system_workflow;
	}
	
	
}
