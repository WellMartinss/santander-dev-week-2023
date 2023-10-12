package me.dio.santander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private String PORT = System.getenv("PORT");
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
