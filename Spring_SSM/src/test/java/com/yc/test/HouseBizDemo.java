package com.yc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.MyBatisApp01;
import com.yc.beans.House;
import com.yc.beans.HouseType;
import com.yc.beans.Street;
import com.yc.beans.Users;
import com.yc.services.HouseBiz;
import com.yc.web.dto.PageSet;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyBatisApp01.class)
public class HouseBizDemo {
	
	@Resource(name="houseBizImpl")
	private HouseBiz houseBiz;
	
	@Test
	public void demo1() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pages",1);
		map.put("pagesize", 1);
		map.put("start", (1-1)*1);
		PageSet<House>  pageSet = houseBiz.findHouse(map);
		System.out.println(pageSet.getTotal()%pageSet.getPagesize() == 0?pageSet.getTotal()/pageSet.getPagesize():pageSet.getTotal()/pageSet.getPagesize()+1);
		System.out.println(pageSet);
	}
	
	@Test
	public void demo2() {
		House house = new House();
		Users user = new Users();
		user.setId(2);
		HouseType houseType = new HouseType();
		houseType.setId(2);
		Street street = new Street();
		street.setId(1003);
		house.setTitle("温馨小屋");
		house.setContact("18073445004");
		house.setDescription("居家首选，给你一个温馨的家.");
		house.setFloorage(100);
		house.setHouseType(houseType);
		house.setUser(user);
		house.setStreet(street);
		house.setPrice(1500.0);
		house.setPubdate("2018-08-06");	
		boolean  flag = houseBiz.addHouse(house);
		System.out.println(flag);
		System.out.println(house);
	}

	@Test
	public void demo3() {
		House house = new House();	
		house.setId(5);
		boolean  flag = houseBiz.delHouse(house);
		System.out.println(flag);
	}
	
	@Test
	public void demo4() {
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(6);
		ids.add(7);
		boolean  flag = houseBiz.delHouses(ids);		
		System.out.println(flag);
	}

}
