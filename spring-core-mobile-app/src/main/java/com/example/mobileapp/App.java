package com.example.mobileapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
	
	public static void main(String[] args) {
		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Mobile m1=(Mobile)appContext.getBean("mobile");
//		Sim sim=(Sim)appContext.getBean("vi");
//		m1.setSim(sim);
		
		m1.browseWeb();
		m1.showMobileInfo();
		
		m1=(Mobile)appContext.getBean("mobile");
		m1=(Mobile)appContext.getBean("mobile");
		m1=(Mobile)appContext.getBean("mobile");
		
	}
	

}
