package com.gura.hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 	컨트롤러 정의하기
 * 	
 * 	@Controller 어노테이션을 클래스 위에 작성하면 된다.
 */
@Controller
public class HomeController {
			
	// /home 요청을 처리할 메소드
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		//요청 객체가 필요하면 메소드의 인자로 선언하면 된다.
		request.setAttribute("name", "김구라");
		/*
		 * 	return type 이 문자열이면 view 페이지의 정보를 리턴한다.
		 * 
		 * 	"WEB-INF/views/"+"home"+".jsp"
		 * 
		 * 	위와 같이 view 페이지의 정보가 구성된다.
		 * 	디폴트 동작은 forward 이동이다.
		 */
		return "home";
	}
	
}
