package com.example.musicapp.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.musicapp.model.Song;
@Repository
public class SongRepo {

	Map<Integer, Song> songList;
	
	@PostConstruct
	public void addSomeArtist() {
		songList=new HashMap<Integer, Song>();
		songList.put(1001,new Song(1001,"ABC"));
		songList.put(1002,new Song(1002,"XYZ"));
		songList.put(1003,new Song(1003,"PQR"));
		songList.put(1004,new Song(1004,"JKL"));
		
	}
	
	public Song getSong(int songId) {
		return songList.get(songId);
	}
	
	
	
}
