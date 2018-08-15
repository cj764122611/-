package com.yc.web.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.beans.Users;
import com.yc.services.UserBiz;
import com.yc.web.dto.JsonModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value="/user",tags="用户模块")
@Controller
public class UserController {

	@Resource(name="userBizImpl")
	private UserBiz userBiz;
	
	@RequestMapping(value="/user_login.action")
	@ResponseBody
	@ApiOperation(value="用户登录",notes="用户登录",httpMethod = "PUT")
	@ApiImplicitParam(name="user",value="Users",required=true,dataType="Users")
	public JsonModel userLogin(Users user,HttpSession session,JsonModel jsonModel) {
		if(user != null && user.getUsername() != null && !user.getUsername().equals("") && user.getPassword() != null && !user.getPassword().equals("")) {
			Users users = userBiz.login(user);
			if(users != null) {
				session.setAttribute("user", users);
				jsonModel.setCode(1);
				jsonModel.setObj(users);
			}else {
				jsonModel.setCode(0);
				jsonModel.setErrorMsg("用户名或密码错误");
			}
		}else {
			jsonModel.setCode(0);
			jsonModel.setErrorMsg("用户名或密码不能为空");
		}
			return  jsonModel;
	}
	
	@RequestMapping(value="/user_register.action")
	@ResponseBody
	@ApiOperation(value="注册用户",notes="注册用户",httpMethod = "PUT")
	@ApiImplicitParam(name="user",value="Users",required=true,dataType="Users")
	public JsonModel registerUser (Users user,JsonModel jsonModel) {
		boolean flag = userBiz.register(user);
		if(flag) {
			jsonModel.setCode(1);
			jsonModel.setObj(user);
		}else {
			jsonModel.setCode(0);
			jsonModel.setErrorMsg("注册失败");
		}
		return jsonModel;
	}
	
	@RequestMapping(value="/user_isUserExists.action")
	@ResponseBody
	public JsonModel isUserExists (Users user,JsonModel jsonModel) {
		Users users = userBiz.login(user);
		if(users == null) {
			jsonModel.setCode(1);
		}else {
			jsonModel.setCode(0);
		}
		return jsonModel;
	}
	
	@RequestMapping(value="/user_loginout.action")
	@ResponseBody
	public JsonModel loginout (HttpSession session,JsonModel jsonModel) {
		session.removeAttribute("user");
		jsonModel.setCode(1);
		return jsonModel;
	}
}
