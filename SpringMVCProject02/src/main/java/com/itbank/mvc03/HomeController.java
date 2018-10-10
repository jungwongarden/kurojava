package com.itbank.mvc03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("home")
	public void home() {
		System.out.println("home() 메소드 호출");
	}
	
	@RequestMapping("first")
	public void first() {
		System.out.println("first() 메소드 호출");
	}
	
	@RequestMapping("second")
	public String second() {
		System.out.println("second() 호출>>>>>>>");
		return "second";
	}
	
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		System.out.println("doC() 메소드 호출>>>>");
		System.out.println(msg);
		return "result";
	}
	
	@RequestMapping("doD")
	public String doD(Model model) {
		System.out.println("doD()메소드 호출>>>>>");
		Mem mem = new Mem();
		mem.setId("will");
		mem.setPw("1234");
		model.addAttribute(mem);
		return "memDetail";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
