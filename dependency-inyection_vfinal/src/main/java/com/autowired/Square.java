package com.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Square implements Figure{
	@Value("${square.size}")
	private double size;

	
	
	@Override
	public double calcularArea() {
		return size*size;
	}

}
