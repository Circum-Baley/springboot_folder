package com.ejemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.autowired.AreaCalculatorService;
import com.profiles.EnvironmentService;
import com.scope.EjemploScopeService;
@Configuration
@SpringBootApplication
// Ruta donde se encuentra el bean ---
@ComponentScan("com.autowired")
@EnableAutoConfiguration
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);
	@Bean
	public String getApplicationName() {
		return "Circum Baley";
	}
		
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
//		Motor motor = context.getBean(Motor.class);
//		Coche coche = context.getBean(Coche.class);
//		logger.info(coche.toString());
//		logger.info("Los datos del coche son : {}",coche.toString());
//		System.out.println("Wena Wena");
//		Nido nido = context.getBean(Nido.class);
//		nido.imprimir();
//		EnvironmentService environmentService = context.getBean(EnvironmentService.class);
//		log.info("El perfil activo es {} ",environmentService.getEnvironment());
//		EjemploScopeService ejemploscopeservice = context.getBean(EjemploScopeService.class);
//		EjemploScopeService ejemploscopeservice1 = context.getBean(EjemploScopeService.class);
//		log.info("Ejemplo {} es igual ",ejemploscopeservice.equals(ejemploscopeservice1));
//		log.info("Ejemplo {} es == ",ejemploscopeservice == ejemploscopeservice1);
		AreaCalculatorService areacalculatorservice= context.getBean(AreaCalculatorService.class);
		log.info("Area ?{} ",areacalculatorservice.calcArea());

				
	}

}
