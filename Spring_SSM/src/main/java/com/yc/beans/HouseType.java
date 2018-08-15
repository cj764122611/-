package com.yc.beans;

import java.io.Serializable;

public class HouseType implements Serializable {

	/**
	 * id    int primary key auto_increment,            
  		name varchar(20) 
	 */
	private static final long serialVersionUID = 3453436149609061497L;
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HousetType [id=" + id + ", name=" + name + "]";
	}
	

}
