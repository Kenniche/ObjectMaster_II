package com.kenniche.object;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	// Constructor method
	public Human()  {


	}
	
	//Attack method
	public void Attack(Human human ) {
		human.health -= strength;
	}
	
	public int displayHealth() {
		System.out.println("The Health Level is: " + health);
		return health;
	}
	
}// End of class Human
