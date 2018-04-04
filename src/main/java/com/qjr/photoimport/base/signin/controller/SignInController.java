package com.qjr.photoimport.base.signin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/sign_in")
@Controller
public class SignInController {
	@RequestMapping("/")
	public String signOpenNode(){
		return "/base/signin/signin";
	}
}
