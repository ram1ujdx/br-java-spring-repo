package com.example.mobileapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Mobile {
	
	
	
	@Autowired
	@Qualifier("vi")
	private Sim sim;
	
	@Value("${mobile.brand}")
	String brand;
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Mobile() {
		System.out.println("Mobile Created");
	}
	
	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void makeCall() {
		sim.call();
	}
	
	public void browseWeb() {
		sim.browse();
	}

	public void showMobileInfo() {
		System.out.println("Mobile Brand : "+brand);
	}

}
