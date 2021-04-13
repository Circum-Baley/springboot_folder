package com.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Circle implements Figure{
	@Value("${circleFigure}")
	private double radius;

	@Override
	public double calcularArea() {
		
		
		return Math.PI*Math.pow(radius, 2);
	}

}
