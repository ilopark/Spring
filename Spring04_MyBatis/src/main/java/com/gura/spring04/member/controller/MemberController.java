package com.gura.spring04.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.member.dao.MemberDao;
import com.gura.spring04.member.dto.MemberDto;
import com.gura.spring04.member.service.MemberService;

@Controller	
public class MemberController {
	//핵심 읜존객체 주입받기
	@Autowired
	private MemberService service;
	
	@RequestMapping("/member/list")
	public ModelAndView list(ModelAndView mView) {
		//MemberService 의 메소드를 호출하면서 ModelAndView 객체의 참조값을 전달해서
		//"list"라는 키값으로 회원목록이 담기도록 한다.
		service.getMemberList(mView);
		mView.setViewName("member/list");
		return mView;
	}
	//회원정보 추가
	@RequestMapping("/member/insertform.do")
	public String insertform() {
		return "member/insertform";
    }
	//회원 추가 요청처리
	@RequestMapping("/member/insert.do")
	public ModelAndView insert(ModelAndView mView, @ModelAttribute MemberDto dto) {
		//MemberService 객체를 이용해서 회원 정보를 추가한다.
		service.addMember(dto);
		//view page 정보도 담아서
		mView.setViewName("member/insert");
		//리턴해 준다.
		return mView;
	}
	
	//회원정보 삭제
	@RequestMapping("/member/delete.do")
	public ModelAndView delete(@RequestParam int num,
			ModelAndView mView) {
		service.deleteMember(num);
		//목록보리고 리다이렉트 이동 시 
	   mView.setViewName("redirect:/member/list.do");
	   return mView;
	}
   
	//회원정보 수정
	@RequestMapping("/member/updateform.do")
	public ModelAndView updateform(@RequestParam int num,
			ModelAndView mView) {
		service.getMember(num, mView);
		mView.setViewName("member/updateform");
		return mView;
	}
	//	회원정보 수정 요청 처리
	/*
	 * 	Dto에 @ModelAndView("key") 을 선언하면
	 * 	해당 객체가 "key 값"으로 자동으로 request scope 된다.
	 */
	@RequestMapping("/member/update.do")
	public ModelAndView update(@ModelAttribute("dto") MemberDto dto,
			ModelAndView mView) {
		service.updateMemmber(dto);
		mView.setViewName("member/update");
		return mView;
	}
   
	
   
	

}
