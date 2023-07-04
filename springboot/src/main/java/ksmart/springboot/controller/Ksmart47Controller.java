package ksmart.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/ksmart47")
public class Ksmart47Controller {
	
	@GetMapping("/kjh")
	
	public String ksmartView(Model model) {
		
		model.addAttribute("kjh", "한국스마트정보교육원 47기 김재훈");
		
		return "ksmart/kjh";
	}
	
	@PostMapping("/kjh")
	public String kjh(Model model) {
		return "ksmart/kjhPost";
	}

}
