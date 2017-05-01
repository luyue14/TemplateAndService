package com.orchestrator.model;

public class Version {
	private long date;
	private String commit;
	private String version;
	private String build;
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public String getCommit() {
		return commit;
	}
	public void setCommit(String commit) {
		this.commit = commit;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	@Override
	public String toString() {
		return "Version [date=" + date + ", commit=" + commit + ", version=" + version + ", build=" + build + "]";
	}
	
	
}
