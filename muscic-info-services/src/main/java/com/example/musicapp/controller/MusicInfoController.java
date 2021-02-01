package com.example.musicapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.musicapp.model.Music;
import com.example.musicapp.service.MusicInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/music")
//@CrossOrigin
public class MusicInfoController {

	@Autowired
	MusicInfoService service;
	
	@GetMapping("/songId/{songId}")
	@HystrixCommand(fallbackMethod = "getMusicInfoFallback"
//					 commandProperties = {
//							 //@HystrixProperty(name="execution.timeout.enabled", value ="true" )
//							 /*
//							  * Other Properties
//							  */
//					 }
			)
	public Music getMusicInfo(@PathVariable int songId) {
		return service.getMusicInfo(songId);
	}
	
	public Music getMusicInfoFallback(@PathVariable int songId) {
		return new Music(songId, "Faded", 1000, "Alan Walker", 2000);
	}
	
	
}
