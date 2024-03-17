package com.study.security20240312hyunjin.domain.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

	public int save(User user) throws Exception;
	public User findUserByUsername(String username) throws Exception;
	
}
