package com.yc.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.MyBatisApp01;
import com.yc.beans.District;
import com.yc.beans.Street;
import com.yc.services.DistrictBiz;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyBatisApp01.class)
public class DistrictDaoDemo {
	
	@Resource(name="districtBizImpl")
	private DistrictBiz districtBiz;
	
	@Test
	public void demo1() {
		List<District> list = districtBiz.getAllDistrict();
		System.out.println(list);
	}
	
	@Test
	public void demo2() {
		List<Street> list = districtBiz.getAllStreetByid(1004);
		System.out.println(list);
	}
	
	

	
	
}
