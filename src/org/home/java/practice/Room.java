package org.home.java.practice;

public class Room extends Building {

	//Constructor Child class
	public Room() {
		super(12);
		System.out.println("Fully furnished Room");
	}
	public Room(int no_of_rooms) {
	
		System.out.println("Total number of rooms " + no_of_rooms);
	}
	public static void main(String[] args) {
		Room r=new Room();
		Room r1=new Room(3);
	}
}
