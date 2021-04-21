package com.aop;
import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);
	
	@Before("execution(* com.aop.TargetObject.hello(..))")
	public void before(JoinPoint joinpoint) {
		log.info("Method Name {} ",joinpoint.getSignature().getName());
		log.info("Object Type {} ",joinpoint.getSignature().getDeclaringType());
		log.info("Object Type Name {} ",joinpoint.getSignature().getDeclaringTypeName());
		log.info("Modificadores de acceso{}",joinpoint.getSignature().getModifiers());
		log.info("Arguments {} ",joinpoint.getArgs());
		log.info("Is public  {}",Modifier.isPublic(joinpoint.getSignature().getModifiers()));
		log.info("CLASS MYASPECT");
	}
}
