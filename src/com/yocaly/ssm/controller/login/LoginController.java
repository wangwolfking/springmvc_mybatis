package com.yocaly.ssm.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("managerLogin.action")
	public ModelAndView UserLogin(){
		System.out.println(123);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("managerIndex");
		return mav;
	}

}
