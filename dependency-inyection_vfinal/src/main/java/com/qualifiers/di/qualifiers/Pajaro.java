/**
 * 
 */
package com.qualifiers.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author circumbaley
 *
 */
@Component
@Primary
public class Pajaro extends Animal implements Volador{
	public Pajaro(@Value("Pajaron") String name,@Value("12") Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	@Override
	public void volar() {
		log.info("Soy Un Pajaro Y Estoy En El Metodo Volar");
		
	}


}
