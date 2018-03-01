package com.xtremax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		String[] developers = new String[] {"developer", "developer1", "developer2"};
		Developer obj;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		for (String s : developers) {
			obj = (Developer) context.getBean(s);
			System.out.println(s);
			System.out.println("----------------");
			obj.aaa();
			System.out.println("----------------");
		}
	}

}