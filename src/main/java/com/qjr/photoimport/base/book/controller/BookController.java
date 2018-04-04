package com.qjr.photoimport.base.book.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("/book")
@Controller
public class BookController {

	@RequestMapping("/open_cookie")
	public void book(HttpServletResponse response,HttpServletRequest request) throws IOException {
		Cookie[] cookies = request.getCookies();
		boolean isbaidu=false;
		for(Cookie c:cookies) {
			if(c.getName().equals("baidu456")) {
				System.out.println(c.getValue());
				isbaidu=true;
			}
		}
		if(!isbaidu) {
			Cookie cookie =new  Cookie("baidu456", "852092058");
			cookie.setMaxAge(1800);
			response.addCookie(cookie);
		}
//		response.sendRedirect("http://www.baidu.com?cookieid=852092058");
	}

	@RequestMapping("/close_cookie")
	public void cannalcookeie(HttpServletResponse response,HttpServletRequest request) throws IOException {
		Cookie[] cookies = request.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("baidu456")) {
				c.setMaxAge(0);
				response.addCookie(c);
			}
		}
	}
}

