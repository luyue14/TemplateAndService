package com.ochestrator.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Deployment {
	private String id;
	private String blueprint_id;
	private Date create_at;
	private Date updated_at;
	private List<Execution> workflows;
	private Map<String, String> inputs;
	private Map<String, String> policy_types;
	private Map<String, String> policy_triggers;
	private Map<String, String> groups;
	private Map<String, String> outputs;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBlueprint_id() {
		return blueprint_id;
	}
	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public List<Execution> getWorkflows() {
		return workflows;
	}
	public void setWorkflows(List<Execution> workflows) {
		this.workflows = workflows;
	}
	public Map<String, String> getInputs() {
		return inputs;
	}
	public void setInputs(Map<String, String> inputs) {
		this.inputs = inputs;
	}
	public Map<String, String> getPolicy_types() {
		return policy_types;
	}
	public void setPolicy_types(Map<String, String> policy_types) {
		this.policy_types = policy_types;
	}
	public Map<String, String> getPolicy_triggers() {
		return policy_triggers;
	}
	public void setPolicy_triggers(Map<String, String> policy_triggers) {
		this.policy_triggers = policy_triggers;
	}
	public Map<String, String> getGroups() {
		return groups;
	}
	public void setGroups(Map<String, String> groups) {
		this.groups = groups;
	}
	public Map<String, String> getOutputs() {
		return outputs;
	}
	public void setOutputs(Map<String, String> outputs) {
		this.outputs = outputs;
	}
	
	
}
