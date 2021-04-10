package com.ejemplo.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ejemplo.atributo.Coche;
import com.ejemplo.atributo.Motor;

@SpringBootApplication
@ComponentScan("com.ejemplo.atributo")
public class DependencyInyectionApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(DependencyInyectionApplication.class);
	public static void main(String[] args) {
//		SpringApplication.run(DependencyInyectionApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		Motor motor = context.getBean(Motor.class);
		Coche coche = context.getBean(Coche.class);
		logger.info(coche.toString());
		logger.info("Los datos del coche son : {}",coche.toString());

	}

}
