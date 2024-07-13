package GSLC;

import java.util.ArrayList;
import java.util.Scanner;

public class GSLC {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Song> songList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	
	public static void menu() {
		header();
		System.out.println("1. Play Song");
		System.out.println("2. Add New Song");
		System.out.println("3. Delete Song");
		System.out.println("4. Exit");
		System.out.println("===================");
		System.out.println("Enter your choice");
		System.out.print(">> ");
		
		int chooseOne;
		chooseOne=scan.nextInt();
		scan.nextLine();
		
		clearScreen();
		header();
		
		if(chooseOne==1) playSongList();
		else if(chooseOne==2) addNewSong();
		else if(chooseOne==3) deleteSong();
		else if(chooseOne==4) clearScreen();
		else clearScreen();
		
		scan.nextLine();
		clearScreen();
		menu();
	}
	
	public static void header() {
		System.out.println("Music Player");
		System.out.println("===================");
		seeSongList();
		System.out.println("===================");
	}
	
	public static void seeSongList() {  
		if (songList.size() == 0){
			System.out.println("Song list is empty");
		}
		else {
			for(int i = 0; i < songList.size(); i++) {
				System.out.println(i+1 + ". " + songList.get(i).getName());
			}
		}
	}
	
	public static void playSongList() {  
		System.out.print("Play song number: ");
		if (songList.size() == 0){
			System.out.println();
			System.out.println("Song list is empty");
		}
		else{
			int number = scan.nextInt();
			System.out.println();
			songList.get(number-1).play();
			songList.remove(number-1);
		}
		System.out.println("Press enter to continue..");
		scan.nextLine();
	}
	
	public static void addNewSong() {  
		System.out.println("Name of Song desired to be inputed [(Name of Song) - (Name of Singer)]: ");
		songList.add(new Song(scan.nextLine()));
		System.out.println("Song added");
		System.out.println("Press enter to continue..");
	}
	
	public static void deleteSong() {  
		System.out.print("Number of Song desired to be deleted: ");
		if (songList.size() == 0){
			System.out.println();
			System.out.println("Song list is empty");
		}
		else{
			songList.remove(scan.nextInt()-1);
		}
		System.out.println("Song deleted");
		System.out.println("Press enter to continue..");
		scan.nextLine();
		
	}
	
	public static void clearScreen() {  
		for (int i = 0; i < 25; i ++)
			System.out.println("");
	    System.out.flush();
	    System.out.println(" ");
	}

}
