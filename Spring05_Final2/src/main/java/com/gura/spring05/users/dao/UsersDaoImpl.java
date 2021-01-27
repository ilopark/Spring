package com.gura.spring05.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao{
	
	//핵심 의존 객체(DI)
	@Autowired
	private SqlSession session;
	
	@Override
	public void updateProfile(UsersDto dto) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => updateProfile
		 * 	parameter Type => UsersDto
		 */
		session.update("users.updateProfile", dto);
	}

	@Override
	public boolean isExist(String id) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => isExist
		 * 	parameter Type => String
		 * 	resultType => UsersDto
		 */
		UsersDto dto=session.selectOne("users.isExist", id);
		if(dto==null)
			return false;
		else
			return true;
	}

	@Override
	public void updatePwd(UsersDto dto) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => updatePwd
		 * 	parameter Type => UsersDto
		 */
		session.update("users.updatePwd", dto);
	}

	@Override
	public void update(UsersDto dto) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => update
		 * 	parameter Type => UsersDto
		 */
		session.update("users.update", dto);
		
	}

	@Override
	public void delete(String id) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => delete
		 * 	parameter Type => String
		 */
		session.delete("users.delete", id);
		
	}

	@Override
	public UsersDto getData(String id) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => getData
		 * 	parameter Type => String
		 * 	resultType =>UsersDto
		 */
		UsersDto dto=session.selectOne("users.getdata", id);
		return dto;
	}

	@Override
	public boolean isValid(UsersDto dto) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => isValid
		 * 	parameter Type => UsersDto
		 * 	resultType => String
		 */
		String id = session.selectOne("users.isValid", dto);
		if(id==null) //잘못된 아이디와 비밀번호
			return false;
		else //유효한 아이디와 비밀번호
			return false;
	}

	@Override
	public void insert(UsersDto dto) {
		/*
		 * 	mapper namespace => users
		 * 	sql id => insert
		 * 	parameter Type => UsersDto
		 */
		session.insert("users.insert", dto);
		
	}

}
