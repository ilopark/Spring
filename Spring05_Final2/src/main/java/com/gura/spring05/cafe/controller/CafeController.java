package com.gura.spring05.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	@RequestMapping("/cafe/private/insertform")
	public String inerstform() {
		return "cafe/private/insertform";
	}
	

}
