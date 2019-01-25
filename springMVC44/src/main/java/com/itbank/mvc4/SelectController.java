package com.itbank.mvc4;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SelectController {

	@Autowired
	MemInterface dao;
	
	@RequestMapping("selectAll.do")
	public String selectAll(Model model) throws Exception{
		ArrayList<MemberDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "selectAllResult";
	}
	@RequestMapping("select.do")
	public String select(@RequestParam("id") String id, Model model) throws Exception{
		MemberDTO dto = dao.select(id);
		model.addAttribute("dto", dto);
		return "selectResult";
	}
	
	
}
