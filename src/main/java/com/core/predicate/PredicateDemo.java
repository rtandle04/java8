package com.core.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String args[]) {
		Predicate<Integer> p = I-> I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(4));
		Predicate<Collection> p2 = c -> c.isEmpty();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		System.out.println(p2.test(list));
		int array[]= {10,15,20,29,30};
		Predicate<Integer> p4 = i -> i>29;
		method1(p4,array);
		Predicate<Integer> p5 = i ->i%2==0;
		System.out.println("Even numbers");
		method1(p5,array);
		
		Predicate<String> stringStartwithK= s -> s.charAt(0)=='K';
		
		Predicate<String> nullCheck= s -> s==null &&s.length()!=0;
		//prepare the list and add the strings which will satisfy the above condition
		
		Predicate<User> users = u ->u.getPassword().equals("abc") && u.getPassword().equals("pass");
				
	}
	public static void method1(Predicate<Integer> p, int array[]) {
		for(int i=0;i<array.length;i++) {
			if(p.test(array[i]))
			System.out.println(array[i]);
		}
	}
}
