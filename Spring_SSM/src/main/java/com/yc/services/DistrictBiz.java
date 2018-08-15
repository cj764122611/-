package com.yc.services;

import java.util.List;

import com.yc.beans.District;
import com.yc.beans.Street;

public interface DistrictBiz {
	
	public List<District> getAllDistrict();
	
	public List<Street> getAllStreetByid(Integer id);

}
