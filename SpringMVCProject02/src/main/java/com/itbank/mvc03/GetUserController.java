package com.itbank.mvc03;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetUserController {
	
	@RequestMapping("getUser")
	public String getUser(Mem mem, DaoMem daoMem, Model model) {
		String id = mem.getId();
		model.addAttribute("mem3", daoMem.getUser(id));
		System.out.println("getUser called ==================");
		return "getUser";
	}
	
	
}
