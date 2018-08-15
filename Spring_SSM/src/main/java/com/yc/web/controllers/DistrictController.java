package com.yc.web.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.beans.District;
import com.yc.services.DistrictBiz;
import com.yc.web.dto.JsonModel;

@Controller
public class DistrictController {

	@Resource(name="districtBizImpl")
	private DistrictBiz districtBiz;
	
	
	@RequestMapping(value="districtList.action")
	@ResponseBody
	public JsonModel getAllHouseType(JsonModel jsonModel) {
		List<District> list = districtBiz.getAllDistrict();
		jsonModel.setObj(list);
		return jsonModel;
	}
}
