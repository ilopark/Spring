package com.gura.spring04.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
	/*
	 * 	스프링 프레임워크가 동작하는 중에 DBFailException type 의 예외가 발생하면 호출되는 메소드
	 * 	@ExceptionHandler(예외 클래스 type)
	 */
	@ExceptionHandler(DBFailException.class)
	public ModelAndView dbFail(DBFailException e) {//발생한 예외 객체가 전달된다.
		//ModelAndView 객체를 생성해서
		ModelAndView mView=new ModelAndView();
		//exception 이라는 키값으로 예외 객체를 담고
		mView.addObject("exception", e);
		//view page 로 forward 이동해서 에러 정보를 응답한다.
		mView.setViewName("error/db_fail");
		return mView;
	}
}
