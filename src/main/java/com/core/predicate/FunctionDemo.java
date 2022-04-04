package com.core.predicate;

import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> f = s->s.length();
		System.out.println(f.apply("Ramakanth"));
		
		Function<Integer,Integer> f2 = s->s*s;
		
		System.out.println(f2.apply(10));
		
		Function<String,String> string=s->s.replaceAll(" ", "");
		
		System.out.println(string.apply("Ramaknath tandl e"));	
		
		Function<String,Integer> count=s->(s.length()-s.replaceAll(" ","").length());
		System.out.println(count.apply("Rama kant tandl rama"));	
		
		Function<List<User>,Double> totalSalary = s -> {
			double total = 0;
			for(User user:s) {
				total = total+user.getSalary();
			}
			return total;
		};
		
		//f.apply(pass the list)
		
		
		Function<String,String> toUpper = s->s.toUpperCase();
		Function<String,String> nine =s->s.substring(0, 9);
		
		System.out.println(toUpper.andThen(nine).apply("Ramakanthtandle"));
	
		System.out.println(toUpper.compose(nine).apply("Ramakanthtandle"));
	}
}
