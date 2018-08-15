package com.yc.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.MyBatisApp01;
import com.yc.beans.HouseType;
import com.yc.services.HouseTypeBiz;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyBatisApp01.class)
public class HouseTypeBizDemo {
	
	@Resource(name="houseTypeBizImpl")
	private HouseTypeBiz houseTypeBiz;
	
	@Test
	public void demo1() {
		List<HouseType> list = houseTypeBiz.getAllHouseType();
		System.out.println(list);
	}

}
