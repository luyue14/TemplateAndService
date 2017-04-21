
package com.ochestrator.model;

public class Event {
	private String blueprint_id;
	private String deployment_id;
	private String execution_id;
	private String workflow_id;
	private String node_name;
	private String node_instance_id;
	private String operation;
	private long timestamp;
	private long reported_timestamp;
	private String message;
	private String type;
	private String event_type;
	private String logger;
	private String level;
	
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
	public String getExecution_id() {
		return execution_id;
	}
	public void setExecution_id(String execution_id) {
		this.execution_id = execution_id;
	}
	public String getWorkflow_id() {
		return workflow_id;
	}
	public void setWorkflow_id(String workflow_id) {
		this.workflow_id = workflow_id;
	}
	public String getNode_name() {
		return node_name;
	}
	public void setNode_name(String node_name) {
		this.node_name = node_name;
	}
	public String getNode_instance_id() {
		return node_instance_id;
	}
	public void setNode_instance_id(String node_instance_id) {
		this.node_instance_id = node_instance_id;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public long getReported_timestamp() {
		return reported_timestamp;
	}
	public void setReported_timestamp(long reported_timestamp) {
		this.reported_timestamp = reported_timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getLogger() {
		return logger;
	}
	public void setLogger(String logger) {
		this.logger = logger;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
