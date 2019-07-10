package com.bionime.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bionime.pojo.User;

@Mapper
public interface UserMapper {
	User selectUser(int id);
}
