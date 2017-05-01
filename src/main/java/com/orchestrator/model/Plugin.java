package com.orchestrator.model;

import java.util.List;

public class Plugin {
	private String id;
	private String package_name;
	private String archive_name;
	private String package_source;
	private String package_version;
	private String supported_platform;
	private String distribution;
	private String distribution_version;
	private String distribution_release;
	private List<Object> wheels;
	private List<Object> excluded_wheels;
	private List<Object> supported_py_versions;
	private long uploaded_at;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getArchive_name() {
		return archive_name;
	}
	public void setArchive_name(String archive_name) {
		this.archive_name = archive_name;
	}
	public String getPackage_source() {
		return package_source;
	}
	public void setPackage_source(String package_source) {
		this.package_source = package_source;
	}
	public String getPackage_version() {
		return package_version;
	}
	public void setPackage_version(String package_version) {
		this.package_version = package_version;
	}
	public String getSupported_platform() {
		return supported_platform;
	}
	public void setSupported_platform(String supported_platform) {
		this.supported_platform = supported_platform;
	}
	public String getDistribution() {
		return distribution;
	}
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}
	public String getDistribution_version() {
		return distribution_version;
	}
	public void setDistribution_version(String distribution_version) {
		this.distribution_version = distribution_version;
	}
	public String getDistribution_release() {
		return distribution_release;
	}
	public void setDistribution_release(String distribution_release) {
		this.distribution_release = distribution_release;
	}
	public List<Object> getWheels() {
		return wheels;
	}
	public void setWheels(List<Object> wheels) {
		this.wheels = wheels;
	}
	public List<Object> getExcluded_wheels() {
		return excluded_wheels;
	}
	public void setExcluded_wheels(List<Object> excluded_wheels) {
		this.excluded_wheels = excluded_wheels;
	}
	public List<Object> getSupported_py_versions() {
		return supported_py_versions;
	}
	public void setSupported_py_versions(List<Object> supported_py_versions) {
		this.supported_py_versions = supported_py_versions;
	}
	public long getUploaded_at() {
		return uploaded_at;
	}
	public void setUploaded_at(long uploaded_at) {
		this.uploaded_at = uploaded_at;
	}
	@Override
	public String toString() {
		return "Plugin [id=" + id + ", package_name=" + package_name + ", archive_name=" + archive_name
				+ ", package_source=" + package_source + ", package_version=" + package_version
				+ ", supported_platform=" + supported_platform + ", distribution=" + distribution
				+ ", distribution_version=" + distribution_version + ", distribution_release=" + distribution_release
				+ ", wheels=" + wheels + ", excluded_wheels=" + excluded_wheels + ", supported_py_versions="
				+ supported_py_versions + ", uploaded_at=" + uploaded_at + "]";
	}
	
	
}
