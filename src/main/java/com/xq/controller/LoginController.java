package com.xq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @author itxin
 *
 */
@Controller
@RequestMapping("/admin")
public class LoginController {
	
	@RequestMapping("/index")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
