package com.itbank.big;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

	@RequestMapping("food")
	public String food() {
		food2();
		System.out.println("좋아하는 음식이 많아요..");
		return "home";
	}

	public void food2() {
		System.out.println("좋아하는 음식이 많아요..");
	}

}
