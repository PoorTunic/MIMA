package org.iut.nantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot {
	public static void main(String[] args) {
		// Here, it runs the principal Spring class
		SpringApplication.run(ServiceApp.class, args);
	}
}
