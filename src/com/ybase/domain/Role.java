package com.ybase.domain;

import java.sql.Clob;

public class Role {

	private String id;
	
	private String name;
	
	private Clob desc;

	public Role() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Clob getDesc() {
		return desc;
	}

	public void setDesc(Clob desc) {
		this.desc = desc;
	}
	
}
