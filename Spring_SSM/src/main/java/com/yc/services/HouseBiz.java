package com.yc.services;

import java.util.List;
import java.util.Map;

import com.yc.beans.House;
import com.yc.web.dto.PageSet;

public interface HouseBiz {
	
	public House getHouseBean(House house);
	
	public boolean addHouse(House house);
	
	public boolean updateHouseInfo(House house);
	
	public boolean delHouse(House house);
	
	public boolean delHouses(List<Integer> id);
	
	public 	PageSet<House> findHouse(Map<String,Object> map);
}
