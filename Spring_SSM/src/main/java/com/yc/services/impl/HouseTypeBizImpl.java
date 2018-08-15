package com.yc.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.beans.HouseType;
import com.yc.dao.BaseDao;
import com.yc.services.HouseTypeBiz;

@Service
public class HouseTypeBizImpl implements HouseTypeBiz {

	@Resource(name="baseDaoImpl")
	private BaseDao<HouseType> baseDao;
	@Override
	public List<HouseType> getAllHouseType() {
		return baseDao.findAll(HouseType.class, "getAllHouseType");
	}

}
