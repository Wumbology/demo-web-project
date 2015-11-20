package edu.csupomona.cs480.OODP;

//A9 For Jonathan Francisco
//Class uses the Singleton desing pattern to create one instance of the whiteboard
//This allows the groups to only be editing one whiteboard per project that they
//will be working on
//Won't allow for multiple whiteboards to be opened on the same project
public class Whiteboard {
	private static final Whiteboard instance = new Whiteboard();
	
	private Whiteboard() {}
	
	public static Whiteboard getInstance() {
		return instance;
	}
}
