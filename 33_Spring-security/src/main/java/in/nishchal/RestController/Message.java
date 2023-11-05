package in.nishchal.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

	@GetMapping("/hi")
	public String sayHi() {
		return "Hello how are you!";
	}
}
