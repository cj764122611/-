package com.yc.beans;

import java.io.Serializable;
import java.util.List;

public class District implements Serializable {

	/**
	 *  id   int primary key,          
  		name varchar(50) 
	 */
	private static final long serialVersionUID = -6813925842974831212L;

	private Integer id;
	private String name;
	private List<Street> streets;

	public List<Street> getStreets() {
		return streets;
	}
	public void setStreets(List<Street> streets) {
		this.streets = streets;
	}
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
		return "District [id=" + id + ", name=" + name + ", streets=" + streets + "]";
	}
	
	 
	
	
}
