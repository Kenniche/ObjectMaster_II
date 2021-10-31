package com.kenniche.object;

import com.kenniche.object.Human;
import com.kenniche.object.Ninja;
import com.kenniche.object.Wizard;
import com.kenniche.object.Samurai;

public class HumanTest {

	public static void main(String[] args) {
		// Create a new object named myHuman
		Human myHuman = new Human();
		Human myHuman2 = new Human();
		Human myHuman3 = new Human();
				
		// Wizard, Ninja, Samurai  class overrides the instance method in Human	
		Human Wizard = myHuman;
		Human Ninja = myHuman2;
		Human Samurai = myHuman3;
		
		//Create Objects myWizard, myNinja, mySamurai  
		Wizard myWizard = new Wizard();
		Ninja myNinja = new Ninja();
		Samurai mySamurai = new Samurai();
		

		// Wizard, Ninja, Samurai display info & methods
		myWizard.displayHealth();
		myWizard.heal(myWizard);
		myWizard.displayHealth();
		myWizard.fireball(myWizard);
		myWizard.displayHealth();
		
		myNinja.displayHealth();
		myNinja.steal(myWizard);
		myNinja.displayHealth();
		myNinja.runAway();
		myNinja.displayHealth();
		
		mySamurai.displayHealth();
		mySamurai.deathBlow(myNinja);
		mySamurai.displayHealth();
		mySamurai.meditate();
		mySamurai.displayHealth();
		
		System.out.println("The number of Samurais is: " + mySamurai.howMany());
		
		
		
	}

}
