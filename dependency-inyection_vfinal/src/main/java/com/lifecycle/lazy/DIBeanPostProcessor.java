package com.lifecycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.lifecycle.LifeCycleBean;

@Component
public class DIBeanPostProcessor implements BeanPostProcessor{
	private static final Logger log = LoggerFactory.getLogger(DIBeanPostProcessor.class);
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleBean) {
			log.info("Before initialization {} ",beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleBean) {
			log.info("After Initialization {} ",beanName);
		}
		return bean;
	}

	
	
}
