package com.itbank.mvc4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

	@Autowired
	MemInterface dao;
	
	@RequestMapping("insert.do")
	public String insert(MemberDTO memberDTO) throws Exception{
		//MemberDAO dao = new MemberDAO();
		dao.insert(memberDTO);
		String id = memberDTO.getId();
		return "redirect:insert.jsp?id="+id;
	}
	
	
}
