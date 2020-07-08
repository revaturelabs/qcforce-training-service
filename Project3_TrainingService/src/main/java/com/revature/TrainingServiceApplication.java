package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Training Service microservice main class.
 */
@SpringBootApplication
public class TrainingServiceApplication {

	/**
	 * The training service is run from the main method below.
	 * 
	 * @param args A string array containing the command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(TrainingServiceApplication.class, args);
	}

}
