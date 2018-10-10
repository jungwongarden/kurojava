package com.itbank.mvc03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		System.out.println("logout()메소드 호출");
		session.invalidate();
		return "logoutOK";
	}
}
