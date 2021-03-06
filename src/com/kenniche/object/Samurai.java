package com.kenniche.object;

public class Samurai extends Human {
    private static int numSamurai = 0;
    private static int defaultHealth = 200;
    public static int howMany() {
        return Samurai.numSamurai;
    }
    // Constructor method
    public Samurai() {
        this.health = Samurai.defaultHealth;
        Samurai.numSamurai += 1;
    }
    public void deathBlow(Human human) {
        human.health = 0;
        this.health = (this.health/2);
    }
    public void meditate() {
        this.health = Samurai.defaultHealth;
    }
}
