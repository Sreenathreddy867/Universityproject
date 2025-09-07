package com.uni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departments {
	
	@Id
	private int dep_id;
	private String dep_name;
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departments(int dep_id, String dep_name) {
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
	}
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	
	
	
}
