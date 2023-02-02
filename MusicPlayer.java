package com.jspiders.music_playercorejava.song;


import java.util.Scanner;

public class MusicPlayer {
     static Scanner sc= new Scanner(System.in);
     static boolean loop = true;
     public static void main(String[] args) {
		while(loop) {
			test();
			
			}
		}
     public static void test() {
    	 Song song = new Song();
    	 System.out.println("Menu");
    	 System.out.println("1.Play song");
    	 System.out.println("2.Add/Remove  song");
    	 System.out.println("3.Update song");
    	 System.out.println("4.Exit");
    	 
    	 System.out.println("choose option:");
    	 int choice=sc.nextInt();
    	 SongOperation so= new SongOperation();
    	 
    	 switch(choice) {
    	 case 1:so.playSong();
    	        break;
    	        
    	 case 2:so.addRemove();
    	        break;
    	        
    	 case 3:so.updateSong();
    	        break;
    	        
    	 case 4: loop=false;
    	 System.out.println("Thank you");
    	         break;
    	         
    	  default:
    		  System.out.println("Invalid choice");
    		  break;
    	 
	}
}
}