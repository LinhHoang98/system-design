package com.linhhn.lb.server_side;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSideApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello from " + System.getProperty("server.port");
	}
}
