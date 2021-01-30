package com.example.mobileapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Mobile {
	
	
	
	@Autowired
	@Qualifier("vi")
	private Sim sim;
	
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

}
