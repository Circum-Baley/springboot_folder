package com.qualifiers.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nido {
	@Autowired
	private Animal pajaroAnimal;
	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);
	
	public void imprimir() {
		log.info("El pajaro animal que esta en el nido, se llama {} ",pajaroAnimal.getName());
	}

}
