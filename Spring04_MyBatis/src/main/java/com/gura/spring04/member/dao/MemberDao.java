package com.gura.spring04.member.dao;

import java.util.List;

import com.gura.spring04.member.dto.MemberDto;

public interface MemberDao {
	//회원목록을 리턴하는 메소드
	public List<MemberDto> getList();
	//회원정보를 추가하는 메소드
	public void insert(MemberDto dto);
	public void update(MemberDto dto);
	public void delete(int num);
	public MemberDto getData(int num);
	

}
