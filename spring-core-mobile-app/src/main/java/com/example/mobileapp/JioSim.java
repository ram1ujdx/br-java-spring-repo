package com.example.mobileapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
//@Scope("prototype")
public class JioSim implements Sim {

	public JioSim() {
		System.out.println("JIO Sim Created");
	}

	public void call() {
		System.out.println("Making calls using Jio");

	}


	public void browse() {
		System.out.println("Browsing with Jio Internet");

	}


}
