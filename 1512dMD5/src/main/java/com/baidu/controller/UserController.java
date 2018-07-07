package com.baidu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import com.baidu.utils.MD5Util;

/**
 * <p>Description: </p>
 * @Auther 韩佳宝
 * @date 创建时间 2018年6月15日下午2:56:11
 * @Version 1.0
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login(){
		
		return "login";
	}
	@RequestMapping("index")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("addUser")
	public String addUser(User user){
		String pwd = user.getPwd();
		String md5 = MD5Util.getMD5(pwd);
		user.setPwd(md5);
		System.out.println(user);
		userService.addUser(user);
		return "redirect:login";
	}
	
	
}
