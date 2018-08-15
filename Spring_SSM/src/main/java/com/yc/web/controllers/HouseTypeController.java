package com.yc.web.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.beans.HouseType;
import com.yc.services.HouseTypeBiz;
import com.yc.web.dto.JsonModel;

@Controller
public class HouseTypeController {

	@Resource(name="houseTypeBizImpl")
	private HouseTypeBiz houseTypeBiz;
	
	
	@RequestMapping(value="houseType.action")
	@ResponseBody
	public JsonModel getAllHouseType(JsonModel jsonModel) {
		List<HouseType> list = houseTypeBiz.getAllHouseType();
		jsonModel.setObj(list);
		return jsonModel;
	}
}
