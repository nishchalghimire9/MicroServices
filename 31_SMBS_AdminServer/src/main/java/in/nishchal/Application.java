package in.nishchal;
// Admin server
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer // this is required for admin server. it will provide a Dashboard to monitor and manage all API actuators at one place
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
