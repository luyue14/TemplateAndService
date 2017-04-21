package com.orchestrator.model;

import org.springframework.stereotype.Component;

@Component
public class Test{
	int t1 = 0;

	
	public Test(){
		
	}
	public int getT1() {
		return t1;
	}

	public void setT1(int t1) {
		this.t1 = t1;
	}

	@Override
	public String toString() {
		return "Test [t1=" + t1 + "]";
	}
}