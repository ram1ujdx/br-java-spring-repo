package com.example.musicapp.model;

public class Artist {

	private int songId;
	private String artistName;
	private int artistServicePort;
	
	public int getArtistServicePort() {
		return artistServicePort;
	}
	public void setArtistServicePort(int artistServicePort) {
		this.artistServicePort = artistServicePort;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public Artist(int songId, String artistName) {
		super();
		this.songId = songId;
		this.artistName = artistName;
	}
	public Artist() {
		// TODO Auto-generated constructor stub
	}
	
}
