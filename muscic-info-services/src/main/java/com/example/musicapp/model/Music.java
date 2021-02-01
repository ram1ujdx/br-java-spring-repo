package com.example.musicapp.model;

public class Music {

	private int songId;
	private String songName;
	private int songServicePort;
	private String artistName;
	private int artistServicePort;
	public Music() {
		// TODO Auto-generated constructor stub
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getSongServicePort() {
		return songServicePort;
	}
	public void setSongServicePort(int songServicePort) {
		this.songServicePort = songServicePort;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public int getArtistServicePort() {
		return artistServicePort;
	}
	public void setArtistServicePort(int artistServicePort) {
		this.artistServicePort = artistServicePort;
	}
	public Music(int songId, String songName, int songServicePort, String artistName, int artistServicePort) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.songServicePort = songServicePort;
		this.artistName = artistName;
		this.artistServicePort = artistServicePort;
	}
	
	
	
}
