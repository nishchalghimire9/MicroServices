package in.nishchal.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
@GetMapping("/greet")
	public String getGreeting() {
		
		return "Hello Goog Morning";
	}
	
}
