package com.utkicode.musicplayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import javax.print.attribute.standard.Media;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Song {
	private File directory;
	private File[] files;
	private Media media;
	//private MediaPlayer mediaplayer;
	
	private static ArrayList<File> songs;
	private int songNumber;
	
	public Song()
	{
		songs = new ArrayList<File>();
		directory = new File("C:\\Users\\91901\\eclipse-workspace\\MusicTest\\src\\Music");
		files = directory.listFiles();
		if(files!=null)
		{
			for(File file : files)
			{
				songs.add(file);
				//System.out.println(file);
			}
		}
	}
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Song song = new Song();
		AudioTest audioTest = new AudioTest(songs.get(0));
		
	}
	
}
