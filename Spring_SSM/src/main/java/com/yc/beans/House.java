package com.yc.beans;

import java.io.Serializable;

public class House implements Serializable {

	/**
	 *  id          int primary key auto_increment,                
		  user_id     int,                
		  type_id     int,                 
		  title       nvarchar(50),          
		  description text,     
		  price       double,                
		  pubdate     date,                  
		  floorage    int,                 
		  contact     varchar(100),        
		  street_id   int     
	 */
	private static final long serialVersionUID = 4222136104953285753L;
	
	private Integer id;
	private Users user;
	private HouseType houseType;
	private Integer floorage;
	private Street street;
	private String title;
	private Double price;
	private String pubdate;
	private String contact;
	private String description;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public HouseType getHouseType() {
		return houseType;
	}
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}
	public Integer getFloorage() {
		return floorage;
	}
	public void setFloorage(Integer floorage) {
		this.floorage = floorage;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private Double minprice;
	private Double maxprice;
	private Integer minfloorage;
	private Integer maxfloorage;
	public Double getMinprice() {
		return minprice;
	}
	public void setMinprice(Double minprice) {
		this.minprice = minprice;
	}
	public Double getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(Double maxprice) {
		this.maxprice = maxprice;
	}
	public Integer getMinfloorage() {
		return minfloorage;
	}
	public void setMinfloorage(Integer minfloorage) {
		this.minfloorage = minfloorage;
	}
	public Integer getMaxfloorage() {
		return maxfloorage;
	}
	public void setMaxfloorage(Integer maxfloorage) {
		this.maxfloorage = maxfloorage;
	}
	@Override
	public String toString() {
		return "\nHouse [id=" + id + ", user=" + user + ", houseType=" + houseType + ", floorage=" + floorage
				+ ", street=" + street + ", title=" + title + ", price=" + price + ", pubdate=" + pubdate + ", contact="
				+ contact + ", description=" + description + "]";
	}
	
	
	

}
