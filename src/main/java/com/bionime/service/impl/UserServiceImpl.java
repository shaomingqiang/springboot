package com.bionime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionime.dao.UserMapper;
import com.bionime.pojo.User;
import com.bionime.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("service");
		return userMapper.selectUser(id);
	}

}
