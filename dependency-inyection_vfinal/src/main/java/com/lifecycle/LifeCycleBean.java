package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
//@Scope("prototype") ?? Recordemos que predestroy no se ejecuta para beans de tipo prototype
//@Lazy(false) //Se utiliza para darle un tiempo de vida al bean
public class LifeCycleBean implements BeanNameAware,InitializingBean,DisposableBean{
	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);
	/**
	 *  Se ejecuta durante la contruccion del bean "BeanNameAware"
	 */
	@Override
	public void setBeanName(String name) {
		log.info("1- BeanName {} ",name);
	}
	/**
	 * Se Ejecuta despues de la inyeccion de dependencias
	 */
	@PreDestroy
	public void destroyBean() {
		log.info("2- Destroy");
	}
	/**
	 * Antes de que el bean sea destruido se ejecutara 
	 * Estos metodos no se ejecutan para BeanPrototype
	 * Solo se ejecutan durante una terminacion de la VIRTUAL MACHINE de forma normal
	 */
	
	@PostConstruct
	public void init() {
		log.info("3- PostContruc");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("4- After Properties set mehod");
	}
	@Override
	public void destroy() throws Exception {
		log.info("5- Destroy properties set method");	
	}
}
