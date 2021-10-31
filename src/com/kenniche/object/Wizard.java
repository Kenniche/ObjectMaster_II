package com.kenniche.object;

public class Wizard extends Human {
	
	// Constructor method
	public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human human) {
        human.health += this.intelligence;
    }

    public void fireball(Human human) {
        human.health -= (this.intelligence * 3);
    }

    
}
