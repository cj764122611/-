package com.yc.beans;

import java.io.Serializable;

public class Street implements Serializable {

	/**
	 * id        int primary key,      
	  name        varchar(50),        
	  district_id int 
	 */
	private static final long serialVersionUID = 2028146581986177480L;
	private Integer id;
	private String name;
	private Integer district_id;
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
	public Integer getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}
	@Override
	public String toString() {
		return "Street [id=" + id + ", name=" + name + ", district_id=" + district_id + "]";
	}
	

}
