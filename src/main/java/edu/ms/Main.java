package edu.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = { Main.class })
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	

}
