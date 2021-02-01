package com.example.musicapp.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.musicapp.model.Artist;
@Repository
public class ArtistRepo {

	Map<Integer, Artist> artistList;
	
	@PostConstruct
	public void addSomeArtist() {
		artistList=new HashMap<Integer, Artist>();
		artistList.put(1001,new Artist(1001,"Pritam"));
		artistList.put(1002,new Artist(1002,"Arijit"));
		artistList.put(1003,new Artist(1003,"Sonu"));
		artistList.put(1004,new Artist(1004,"Shreya"));
		
	}
	
	public Artist getArtist(int songId) {
		return artistList.get(songId);
	}
	
	
	
}
