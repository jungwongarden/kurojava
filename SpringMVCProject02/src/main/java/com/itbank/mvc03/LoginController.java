package com.itbank.mvc03;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public String login() {
		System.out.println("login()메소드 호출");
		return "login";
	}
	
	@RequestMapping("loginOK")
	public String loginOK(Mem mem, DaoMem daoMem, HttpSession session) {
		System.out.println("loginOK() 메소드 호출");
		System.out.println("입력한 ID: " + mem.getId());
		System.out.println("입력한 PW: " + mem.getPw());
		
		String inputId = mem.getId();
		String inputPw = mem.getPw();
		
		Mem mem1 = daoMem.getUser(mem.getId());
		String getId = mem1.getId();
		String getPw = mem1.getPw();
		
		if((inputId.equals(getId))&&(inputPw.equals(getPw))) {
			return "loginConfirm";
		}else return "login";
	}
	@RequestMapping("loginOK2")
	public String loginOK() {
		System.out.println("loginOK() 메소드 호출");
/*		System.out.println("입력한 ID: " + request.getParameter("id"));*/
		return "login2";
}
}
