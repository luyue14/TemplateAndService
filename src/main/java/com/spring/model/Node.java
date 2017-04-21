package com.spring.model;

import java.util.List;

public class Node {
	private String id;
	private String deployment_id;
	private String blueprint_id;
	private String type;
	//element of list?
	private List<Node> type_hierarchy;
	private int number_of_instances;
	private int planned_number_of_instances;
	private int deploy_number_of_instances;
	private String host_id;
	//Object
	private Object properties;
	private Object operations;
	private List<Execution> plugins;
	private List<Execution> plugins_to_install;
	private List<Object> relationships;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeployment_id() {
		return deployment_id;
	}
	public void setDeployment_id(String deployment_id) {
		this.deployment_id = deployment_id;
	}
	public String getBlueprint_id() {
		return blueprint_id;
	}
	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Node> getType_hierarchy() {
		return type_hierarchy;
	}
	public void setType_hierarchy(List<Node> type_hierarchy) {
		this.type_hierarchy = type_hierarchy;
	}
	public int getNumber_of_instances() {
		return number_of_instances;
	}
	public void setNumber_of_instances(int number_of_instances) {
		this.number_of_instances = number_of_instances;
	}
	public int getPlanned_number_of_instances() {
		return planned_number_of_instances;
	}
	public void setPlanned_number_of_instances(int planned_number_of_instances) {
		this.planned_number_of_instances = planned_number_of_instances;
	}
	public int getDeploy_number_of_instances() {
		return deploy_number_of_instances;
	}
	public void setDeploy_number_of_instances(int deploy_number_of_instances) {
		this.deploy_number_of_instances = deploy_number_of_instances;
	}
	public String getHost_id() {
		return host_id;
	}
	public void setHost_id(String host_id) {
		this.host_id = host_id;
	}
	public Object getProperties() {
		return properties;
	}
	public void setProperties(Object properties) {
		this.properties = properties;
	}
	public Object getOperations() {
		return operations;
	}
	public void setOperations(Object operations) {
		this.operations = operations;
	}
	public List<Execution> getPlugins() {
		return plugins;
	}
	public void setPlugins(List<Execution> plugins) {
		this.plugins = plugins;
	}
	public List<Execution> getPlugins_to_install() {
		return plugins_to_install;
	}
	public void setPlugins_to_install(List<Execution> plugins_to_install) {
		this.plugins_to_install = plugins_to_install;
	}
	public List<Object> getRelationships() {
		return relationships;
	}
	public void setRelationships(List<Object> relationships) {
		this.relationships = relationships;
	}
	
	
}
