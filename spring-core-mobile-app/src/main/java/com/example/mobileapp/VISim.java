package com.example.mobileapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vi")
//@Scope("prototype")
public class VISim implements Sim{

	public VISim() {
	System.out.println("VI Sim Created");
	}

	public void call() {
		System.out.println("Making calls using VI");

	}

	public void browse() {
		System.out.println("Browsing with VI Internet");

	}

}
