package com.example.musicapp.model;

public class Song {

	private int songId;
	private String songName;
	private int songServicePort;
	
	public int getSongServicePort() {
		return songServicePort;
	}
	public void setSongServicePort(int songServicePort) {
		this.songServicePort = songServicePort;
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
	public Song(int songId, String songName) {
		super();
		this.songId = songId;
		this.songName = songName;
	}
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
}
