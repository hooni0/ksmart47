package ksmart.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Controller : 사용자 요청과 응답을 처리( 주소 분기 및 매핑 ), (= servlet 클래스)
 * 
 */

@Controller
public class MainController {
	
	/**
	 * @GetMapping : GET방식의 http 주소 요청시 핸들러 특정 메소드와 매핑
	 * 
	 * @return String 타입은(@Controller를 기재한 클래스에서만) 논리적인 경로를 의미한다.
	 * 		   prefix = "classpath:/templates/"
			   subfix = ".html"
			   화면 경로 => prefix + returnString + subfix;
					   => "scr/main/resources/templates/" + "main" + ".html";
		Model model -> 화면에 전달할 데이터
	 */
	
	@GetMapping("/")
    public String mainPage() {
        
		/*
		prefix = "classpath:/templates/"
		subfix = ".html"
		화면 경로 => prefix + returnString + subfix;
				=> "scr/main/resources/templates/" + "main" + ".html";
		*/
        return "main";
    }
	
	@GetMapping("/ksmartView")
	public String ksmartView(Model model) {
		
		model.addAttribute("contents", "ksmart47 ksmartView");
		
		return "ksmartView";
	}
}
