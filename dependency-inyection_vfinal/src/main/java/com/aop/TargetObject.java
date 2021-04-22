package com.aop;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class TargetObject {
	
	private static final Logger log = LoggerFactory.getLogger(TargetObject.class);
	@Before("executive(* com.aop.TargetObject.*(..))")
	public void foo() {
		log.info("______________________FOO FROM TARGEROBJECT________________________");
	}
	@SpringAnnotation
	public void hello(String message) {
		log.info(message);
	} 



}
