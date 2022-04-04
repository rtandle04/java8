package com.corejava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBug {
	
	public static void main(String[] args) throws ParseException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date today = new Date();
		//Date todayWithZeroTime = formatter.parse(formatter.format(today));
		System.out.println(new java.sql.Date(System.currentTimeMillis()).toString());
		Class cls = Class.forName("com.corejava.Demo");
		Object  newInstance = cls.newInstance();
		System.out.println(newInstance.toString());
		
		
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.toString());
		}
		System.out.println(cls.toString());
	}
}
