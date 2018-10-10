package com.itbank.mvc03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

	@RequestMapping("insertMem")
	public String insertMem() {
		System.out.println("insertMem() 메소드 호출 >>>>>");
		return "insertMem";
	}
	
	@RequestMapping("insert")
	public String insert(Mem mem, DaoMem daoMem) {
		System.out.println("insert()메소드 호출 >>>>>");
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		String name = request.getParameter("name");
//		String tel = request.getParameter("tel");
		
//		Mem mem = new Mem();
//		mem.setId(id);
//		mem.setPw(pw);
//		mem.setName(name);
//		mem.setTel(tel);
		
		System.out.println("확인용 id " + mem.getId());
//		DaoMem daoMem = new DaoMem();
		daoMem.insertUser(mem);
		return "login";
	}
	
	
	
	
	
	
	
	
	
}
