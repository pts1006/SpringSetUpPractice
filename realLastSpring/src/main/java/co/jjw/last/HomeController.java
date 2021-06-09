package co.jjw.last;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/goodbyeSpringTest.do")
	public String home() {
		
		return "goodbyeSpringTest";
	}
	
}
