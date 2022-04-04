package com.corejava;



public class FinalDemo {

	
	public static void main(String[] args) {
		Emp emp = new Emp("Hi");
		Emp emp2 = new Emp("Hi");
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		Class<? extends Emp> abc = emp.getClass();
		System.out.println(abc.toString());
	}

}
