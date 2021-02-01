package com.example.musicapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.musicapp.model.Artist;
import com.example.musicapp.repository.ArtistRepo;

@RestController
@RequestMapping("/artists")
public class ArtistInfoController {

	@Autowired
	private ArtistRepo repo;
	
	@Autowired
	Environment env;
	
	@GetMapping("/songId/{songId}")
	public Artist getArtistInfo(@PathVariable int songId) {
		Artist artist= repo.getArtist(songId);
		int port=Integer.parseInt(env.getProperty("local.server.port"));
		artist.setArtistServicePort(port);
		return artist;
	}
}
