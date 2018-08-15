package com.yc.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.MyBatisApp01;
import com.yc.beans.Users;
import com.yc.services.UserBiz;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyBatisApp01.class)
public class UserBizDemo {
	
	@Resource(name="userBizImpl")
	private UserBiz userBiz;
	
	@Test
	public void demo1() {
		Users user = new Users();
		user.setName("yc");
		user.setPassword("a");
		user = userBiz.login(user);
		System.out.println(user);
	}
	
	@Test
	public void demo2() {
		Users user = new Users();
		user.setName("zqq");
		user.setPassword("a");
		user.setIsadmin("1");
		user.setTelephone("18570940562");
		user.setUsername("zqq");
		boolean register = userBiz.register(user);
		System.out.println(user);
		System.out.println(register);
		
	}
	
	@Test
	public void demo3() {
		Users user = new Users();
		user.setId(3);
		user.setName("zqq02");
		user.setPassword("a");
		user.setIsadmin("1");
		user.setTelephone("18570940562");
		user.setUsername("zqq");
		boolean register = userBiz.updateUserInfo(user);
		System.out.println(user);
		System.out.println(register);
		
	}
	
	@Test
	public void demo4() {
		Users user = new Users();
		user.setName("zqq");
		boolean register = userBiz.validate(user);
		System.out.println(user);
		System.out.println(register);
		
	}
	
	@Test
	public void demo5() {
		Users user = userBiz.getUsersById(1);
		System.out.println(user);
		
	}
	
	

	
	
}
