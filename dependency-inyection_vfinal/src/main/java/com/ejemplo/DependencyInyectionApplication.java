package com.ejemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.lifecycle.ExplicitBean;
import com.lifecycle.LifeCycleBean;

//@Configuration
@SpringBootApplication
// Ruta donde se encuentra el bean ---
@ComponentScan("com.lifecycle")
//@ComponentScan("com.config")
//@EnableAutoConfiguration
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);
	@Bean
	public String getApplicationName() {
		return "Circum Baley";
	}
	@Bean(initMethod = "init" ,destroyMethod = "destroy")	
	public ExplicitBean getBean() {
		return new ExplicitBean();
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
//		AreaCalculatorService areacalculatorservice= context.getBean(AreaCalculatorService.class);	

		//		# Se realiza una carga de propiedades desde el archivo 
//		Circle circle = context.getBean(Circle.class);
//		Square square= context.getBean(Square.class);
//		log.info("El Area total de los objetos es {} ",areacalculatorservice.calcArea());
//		log.info("El Area Del Circulo Es {} ",circle.calcularArea());;
//		log.info("El Area Del Cuadrado Es {} ",square.calcularArea());
//		ExpressionParser parser = new SpelExpressionParser();
//		org.springframework.expression.Expression expression = parser.parseExpression("10 < 20 ? 'a' : 'b'");
//		log.info("{}",expression.getValue());
		LifeCycleBean bean = context.getBean(LifeCycleBean.class);
		
		
	}
}
