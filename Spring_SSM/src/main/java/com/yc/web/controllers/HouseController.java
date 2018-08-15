package com.yc.web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.beans.House;
import com.yc.beans.Users;
import com.yc.services.HouseBiz;
import com.yc.web.dto.JsonModel;
import com.yc.web.dto.PageSet;

@Controller
public class HouseController {

	@Resource(name="houseBizImpl")
	private HouseBiz houseBiz;
	
	@RequestMapping(value="toList.action")
	public String toList() {
		return "list";
	}
	
	@RequestMapping(value="toAdd.action")
	public String toAdd() {
		return "add";
	}
	
	@RequestMapping(value="toUpdate.action")
	public String toUpdate(HttpSession session,Integer id) {
		PageSet<House>  pageSet = (PageSet<House>) session.getAttribute("pageSet");
		List<House> list = pageSet.getList();
		for (House house : list) {
			if(house.getId() == id) {
				session.setAttribute("houseInfo", house);
				break;
			}
		}
		return "update";
	}
	
	@RequestMapping(value="house_list.action")
	public String houseList(Integer pages,Integer pagesize,HttpSession session) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pages",pages);
		map.put("pagesize", pagesize);
		map.put("start", (pages-1)*pagesize);
		PageSet<House>  pageSet = houseBiz.findHouse(map);
		session.setAttribute("pageSet", pageSet);
		return "showList";
	}
	
	@RequestMapping(value="house_add.action")
	@ResponseBody
	public JsonModel  addHouse(House house,JsonModel jsonModel,HttpSession session) {

		Users user = (Users) session.getAttribute("user");
		house.setUser(user);		
		boolean  flag = houseBiz.addHouse(house);
		if(flag) {
			jsonModel.setCode(1);
		}else {
			jsonModel.setCode(0);
		}
		return jsonModel;
	}
	
	@RequestMapping(value="house_del.action")
	@ResponseBody
	public JsonModel  delHouse(House house,JsonModel jsonModel,HttpSession session) {		
		boolean  flag = houseBiz.delHouse(house);
		if(flag) {
			jsonModel.setCode(1);
		}else {
			jsonModel.setCode(0);
		}
		return jsonModel;
	}
	
	@RequestMapping(value="house_update.action")
	@ResponseBody
	public JsonModel  updateHousInfo(House house,JsonModel jsonModel,HttpSession session) {
		Users user = (Users) session.getAttribute("user");
		house.setUser(user);	
		System.out.println(user);
		boolean  flag = houseBiz.updateHouseInfo(house);
		if(flag) {
			jsonModel.setCode(1);
		}else {
			jsonModel.setCode(0);
		}
		return jsonModel;
	}
}
