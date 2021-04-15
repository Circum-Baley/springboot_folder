package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class LifeCycleBean implements BeanNameAware{
	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
		log.info("BeanName {} ",name);
	}
	/**
	 * Antes de que el bean sea destruido se ejecutara 
	 * Estos metodos no se ejecutan para BeanPrototype
	 * Solo se ejecutan durante una terminacion de la VIRTUAL MACHINE de forma normal
	 */
	@PreDestroy
	public void destroy() {
		log.info("Destroy");
	}
	@PostConstruct
	public void init() {
		log.info("PostContruc");
	}
	
}
