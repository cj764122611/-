package com.yc.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.beans.District;
import com.yc.beans.Street;
import com.yc.dao.BaseDao;
import com.yc.services.DistrictBiz;

@Service
public class DistrictBizImpl implements DistrictBiz {

	@Resource(name="baseDaoImpl")
	private BaseDao baseDao;
	@Override
	public List<District> getAllDistrict() {
		return baseDao.findAll(District.class, "getAllDistrict");
	}

	@Override
	public List<Street> getAllStreetByid(Integer id) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("district_id  ", id);
		return baseDao.findAll(Street.class, "getAllStreetByid", map);
	}

}
