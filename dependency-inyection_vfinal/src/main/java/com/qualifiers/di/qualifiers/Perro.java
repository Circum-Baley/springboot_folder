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
public class Perro extends Animal{
	private static final Logger log = LoggerFactory.getLogger(Perro.class);

	public Perro(@Value("Laqui") String name,@Value("6") Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	

}
