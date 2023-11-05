package in.nishchal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nishchal.feign.GreetFeignClient;

@RestController
public class WelcomeController {
	@Autowired
	private GreetFeignClient  greetClient;
	@GetMapping("/welcome")
	public String welcome() {
		
		//this is not recomended.
		
//		RestTemplate restTemplate = new RestTemplate();
//	
//		ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8081/greet", String.class);
//		String greetResp = forEntity.getBody();
		
		//return greetResp + "Welcome to this beautiful world !";
		
		String greetResposnes = greetClient.invokeGreetApi();
		return greetResposnes + "Welcome to this beautiful world !";
	}

}
