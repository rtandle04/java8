package com.corejava;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		double d=13325548.43d;
		
		String str="6.0";
		Double D=0.0;
		
		//BigDecimal decimal = new BigDecimal(d);
		
		System.out.println(d);
		
		if(Double.valueOf(str) == 6.0) {
			System.out.println("d==0 passed");
		}

	}

}
