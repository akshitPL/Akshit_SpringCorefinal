package com.springcore.model;

public class person {

	private String n,g;

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public person(String n1, String g1) {
		super();
		this.n = n1;
		this.g = g1;
	}
	
	
	
	

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	@Override
	public String toString() {
		return "person [name=" + n + ", gender=" + g + "]";
	}

	
	
	
	
}
