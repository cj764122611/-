package com.yc.services;

import com.yc.beans.Users;

public interface UserBiz {
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	public boolean register(Users user);
	/**
	 * 用户是否存在
	 * @param user
	 * @return
	 */
	public boolean validate(Users user);
	/**
	 * 查询用户
	 * @param id
	 * @return
	 */
	public Users getUsersById(Integer id);
	/**
	 * 登录操作
	 * @param user
	 * @return
	 */
	public Users login(Users user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public boolean updateUserInfo(Users user);
	
	
}
