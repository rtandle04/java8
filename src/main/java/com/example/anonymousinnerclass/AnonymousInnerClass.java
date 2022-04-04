package com.example.anonymousinnerclass;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		System.out.println("demo");
		Runnable r=new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=10;i++)
				System.out.println("Child Thread is running");
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		for(int i=1;i<=10;i++)
			System.out.println("Main Thread is running");
			
		//Above code can be written as below
		Runnable r2 =()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Child thread");
			}
		};
		new Thread(r2).start();
		
		Thread t=new Thread(()-> {
			for(int i=1;i<=10;i++) {
				System.out.println("Child thread");
			}
		});
		t.start();
		
		Test test=new Test() {

			@Override
			public void method2() {
				System.out.println("Anonymous inner class");
				
			}
			
		};
	}
}
