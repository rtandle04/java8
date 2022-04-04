package com.corejava.lamda;


//it is functional interface


@FunctionalInterface 
public interface I1 {

	public void method1();
	
	public static void method2() {
		
	}
	
	public default void method3() {
		
	}
}
