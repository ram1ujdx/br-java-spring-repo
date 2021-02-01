package com.example.musicapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.musicapp.model.Song;
import com.example.musicapp.repository.SongRepo;

@RestController
@RequestMapping("/songs")
public class SongInfoController {

	@Autowired
	private SongRepo repo;
	
	@Autowired
	Environment env;
	
	@GetMapping("/songId/{songId}")
	public Song getSongInfo(@PathVariable int songId) {
		Song song= repo.getSong(songId);
		int port=Integer.parseInt(env.getProperty("local.server.port"));
		song.setSongServicePort(port);
		return song;
	}
}
