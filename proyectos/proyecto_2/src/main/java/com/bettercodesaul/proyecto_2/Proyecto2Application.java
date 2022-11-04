package com.bettercodesaul.proyecto_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Proyecto2Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto2Application.class, args);
	}

}
