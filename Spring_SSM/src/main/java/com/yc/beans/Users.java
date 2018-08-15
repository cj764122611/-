package com.yc.beans;

import java.io.Serializable;

public class Users implements Serializable {

	/**
	 * ID int primary key auto_increment, name varchar(50), password varchar(50),
	 * telephone varchar(15), username varchar(50), isadmin varchar(5)
	 */
	private static final long serialVersionUID = 1225312116752423754L;

	private Integer id;
	private String name;
	private String password;
	private String username;
	private String telephone;
	private String isadmin;

	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password + ", username=" + username
				+ ", telephone=" + telephone + ", isadmin=" + isadmin + "]";
	}

	

}
