package ksmart.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KsmartController {
	
	@RequestMapping(value = "/ksmart", method = RequestMethod.GET)
	public String ksmart(Model model) {
		
		model.addAttribute("ksmart", "한국스마트정보교육원");
		
		return "ksmart";
	}
}
