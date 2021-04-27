package com.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutExample {
//	@Pointcut("within(TargetObject+)")
//	Cuando utilizamos la anotacion de SpringAnnotation
	@Pointcut("@annotation(SpringAnnotation)")
	public void TargetObjectMethod() {
		
	}

}
