package com.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.example.domain.User;

public interface UserMapper {

	@Select("SELECT * FROM user WHERE id = #{userId}")
	public User getUser(long userId);

	@Insert("insert into user (id, email, userName, createdDt) values(#{id}, #{email}, #{userName}, CAST (#{createdDt} AS DATE))")
	public int addUser(User user);

}
