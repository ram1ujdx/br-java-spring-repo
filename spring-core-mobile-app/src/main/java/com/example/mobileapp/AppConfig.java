package com.example.mobileapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.example.mobileapp"})
@PropertySource("app.properties")
public class AppConfig {

//	@Bean(name = "vi")
//	public VISim getViSim() {
//		return new VISim();
//	}
//	
//	@Bean(name = "jio")
//	public JioSim getJioSim() {
//		return new JioSim();
//	}
//	
//	@Bean(name = "mobile")
//	public Mobile getMobile() {
//		Mobile m1=new Mobile();
//		m1.setSim(getViSim());
//		return m1;
//	}
	
	
}
