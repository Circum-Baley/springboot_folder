/**
 *
 */
package com.qualifiers.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author circumbaley
 *
 */
@Component
public class Avion implements Volador{
	
	private static final Logger log = LoggerFactory.getLogger(Avion.class);
	@Override
	public void volar() {
		log.info("Avion volando");
		
	}

}
