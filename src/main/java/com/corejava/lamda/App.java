package com.corejava.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<>();
		list.stream().filter(i ->i%2==0).collect(Collectors.toList());
		list.stream().map(i->i*2).collect(Collectors.toList());
		list2.stream().filter(s->s.length()>=9).collect(Collectors.toList());
		list2.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		list2.stream().filter(s->s.length()>=9).count();
		list.stream().sorted().collect(Collectors.toList());
		list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		//for min and max the elements should be sorted order
		list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		list.forEach(System.out::print); //:: method ref and constructor reference not score resolution operator
		I1 i1=()->{System.out.println("Hi");};
		i1.method1();
		
		I2 i2=(x)-> x*x;
		System.out.println(i2.method2(5));
		
		Thread t = new Thread();
		//I3 i3 =(t)-> {}
		
	
		Runnable r = ()-> {
			for(int i=0;i<=10;i++) 
			{
				System.out.println("child thread");
			}
		};
		Thread t2=new Thread(r);
		t2.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("parent thread");
		}
		}
		
	
	
	}
