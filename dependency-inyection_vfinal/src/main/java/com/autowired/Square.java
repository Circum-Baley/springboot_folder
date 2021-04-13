package com.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Square implements Figure{
	@Value("${squareFigure}")
	private double size;

	
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return size*size;
	}

}
