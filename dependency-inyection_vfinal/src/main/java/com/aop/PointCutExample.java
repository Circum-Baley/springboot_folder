package com.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutExample {
//	@Pointcut("within(TargetObject+)")
	@Pointcut("@annotation(SpringAnnotation)")
	public void TargetObjectMethod() {
		
	}

}
