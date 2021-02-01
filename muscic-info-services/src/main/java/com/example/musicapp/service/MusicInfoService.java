package com.example.musicapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.musicapp.model.Artist;
import com.example.musicapp.model.Music;
import com.example.musicapp.model.Song;

@Service
public class MusicInfoService {

	@Autowired
	RestTemplate restTemplate;
	
	public Music getMusicInfo(int songId) {
		
		Song song=restTemplate.getForObject("http://song-service/songs/songId/"+songId, Song.class);
		Artist artist=restTemplate.getForObject("http://artist-service/artists/songId/"+songId, Artist.class);
		Music music=new Music(songId, song.getSongName(), song.getSongServicePort(), artist.getArtistName(), artist.getArtistServicePort());
		return music;
		
		
	}
	
	
	
}
