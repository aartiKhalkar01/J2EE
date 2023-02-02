package com.jspiders.music_playercorejava.song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongOperation {
      static List<Song> albumList = new ArrayList<Song>();
      static Scanner sc= new Scanner(System.in);
	private char[] songName;
      
      public void playSong() {
    	  System.out.println("1.Play all songs:");
    	  System.out.println("2.Choose song:");
    	  System.out.println("3.Play Random:");
    	  System.out.println("4.Go back:");
    	  
    	  System.out.println("Choose option:");
    	  int choice = sc.nextInt();
    	  switch(choice) {
    	  case 1:
    		  System.out.println("All songs are playing");
    		  break;
    		  
    	  case 2:
    		  System.out.println("Select one song:");
    		  break;
    		
    	  case 3:
    		  System.out.println("Songs playing randomly now:");
    		  break;
    		  
    	  default:
    		  System.out.println("Invalid input:");
    	  break;
    	  }
      }
      public void addRemove() {
    	  System.out.println("Add song");
    	  System.out.println("2.Remove Song");
    	  System.out.println("3.Go back");
    	  System.out.println("Choose option:");
    	  SongOperation operation = new SongOperation();
    	  
    	  int choice  = sc.nextInt();
    	  switch (choice) {
    	  case 1:
    		 operation.addsong();
    		 System.out.println("1.Go Back");
    		 int choice1 =sc.nextInt();
    		 switch (choice1) {
    		 case 1:
    			 operation.goBack();
    			 break;
    			default:
    				System.out.println("Invalid input");
    			case 2:
    				System.out.println("Song is Removed");
    				break;
    			case 3:
    				operation.goBack();
    				break;
    		 }
    		 default:
    			 System.out.println("Invalid input");
    		  
    	  }
      }
      public void addsong() {
    	  Song song = new Song();
    	  System.out.println("put song id");
    	  int songid = sc.nextInt();
    	  song.setId(songid);
    	  
    	  System.out.println("put song name");
    	  String songName = sc.next();
    	  song.setName(songName);
    	  
    	  albumList.add(song);
    	  
    	  //song.add(new ArrayList());
       	  System.out.println(songName + "successfully added to the list");
       	  for(Song s:albumList) {
       		  System.out.println(s);
       	  }
      }
      public void goBack() {
    	  MusicPlayer.test();
      }
      public void remove() {
    	  MusicPlayer.test();
      }
      public void updateSong() {
    	  System.out.println("1.Name");
    	  System.out.println("2.Singer");
    	  System.out.println("3.Album");
    	  System.out.println("4.Go back");
    	  SongOperation updateop = new SongOperation();
    	  int choice2 = sc.nextInt();
    	  switch(choice2) {
    	  
    	  case 1:
    	     System.out.println(songName);
    	  case 4:
    		  updateop.goBack();
    		  break;
    		  
    	 default:
    		 System.out.println("Invalid input");
    	  }
      }
      public void exit() {
    	  System.out.println("Exit Application");
      }
      
}
