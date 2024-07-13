package GSLC;

public class Song {

	String name;

	public Song(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("Currently playing song: " + this.getName());
	}
	
}


