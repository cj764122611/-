package com.yc.services.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.beans.House;
import com.yc.dao.BaseDao;
import com.yc.services.HouseBiz;
import com.yc.web.dto.PageSet;
@Service
public class HouseBizImpl implements HouseBiz{

	@Resource(name="baseDaoImpl")
	private BaseDao<House> baseDao;
	
	@Override
	public House getHouseBean(House house) {
		return baseDao.findOne(house, "findHouseByjoint");
	}

	@Override
	public boolean addHouse(House house) {
		baseDao.save(house, "addHouse");
		return true;
	}

	@Override
	public boolean updateHouseInfo(House house) {
		baseDao.update(house, "updateHouseInfo");
		return true;
	}

	@Override
	public boolean delHouse(House house) {
		baseDao.del(House.class, "delHouseByid", house.getId());
		return true;
	}

	@Override
	public boolean delHouses(List<Integer> ids) {
		baseDao.del(House.class, "delHouseByList", ids);
		return true;
	}

	@Override
	public PageSet<House> findHouse(Map<String, Object> map) {
		int total = baseDao.findCount(House.class,"findHouseCount",map);
		List<House> list = baseDao.findAll(House.class, "findHouse", map);
		PageSet<House> pageSet = new PageSet<House>();
		int pagesize = Integer.parseInt(map.get("pagesize").toString());
		int pageNum = total%pagesize == 0?total/pagesize:total/pagesize+1;
		pageSet.setList(list);
		pageSet.setTotal(total);
		pageSet.setPages(Integer.parseInt(map.get("pages").toString()));
		pageSet.setPagesize(pagesize);
		pageSet.setPageNum(pageNum);
		return pageSet;
	}

}
