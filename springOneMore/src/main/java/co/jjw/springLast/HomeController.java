package co.jjw.springLast;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/lastSpring.do")
	public String home() {
		
		return "lastSpring";
	}
	
}
