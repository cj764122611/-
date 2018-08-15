package com.yc.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.beans.Users;
import com.yc.dao.BaseDao;
import com.yc.services.UserBiz;

@Service
public class UserBizImpl implements UserBiz {

	@Resource(name="baseDaoImpl")
	private BaseDao<Users> baseDao;
	
	@Override
	public boolean register(Users user) {
		baseDao.save(user, "registerUsers");
		return true;
	}

	@Override
	public boolean validate(Users user) {
		Users users = baseDao.findOne(user, "selectOne");
		if(users != null) {
			return true;
		}else {			
			return false;
		}
	}

	@Override
	public Users getUsersById(Integer id) {
		Users user = new Users();
		user.setId(id);
		user = (Users) baseDao.findOne(user,"selectOne");
		return user;
	}

	@Override
	public Users login(Users user) {
		user = baseDao.findOne(user,"selectOne");
		if(user != null){
			return user;
		}else {
			return null;
		}
		
	}

	@Override
	public boolean updateUserInfo(Users user) {
		baseDao.update(user, "updateUserInfo");
		return true;
	}

}
