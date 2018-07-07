package com.baidu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.mapper.UserMapper;
import com.baidu.pojo.User;
import com.baidu.service.UserService;

/**
 * <p>Description: </p>
 * @Auther 韩佳宝
 * @date 创建时间 2018年6月15日下午3:22:03
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
	}

}
