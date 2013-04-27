package com.ybase.domain;

import java.sql.Clob;

public class User {

	private String id;
	
	private String name;
	
	private Integer age;
	
	private Character sex;
	
	private Float height;
	
	private Float weight;
	
	private Clob desc;

	public User() {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Clob getDesc() {
		return desc;
	}

	public void setDesc(Clob desc) {
		this.desc = desc;
	}
	
}
