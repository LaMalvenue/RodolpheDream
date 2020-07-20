package animals.cats;

import animals.Animal;
import animals.behavior.Purr;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.className = "Chat";
        this.happyBehavior = new Purr();
        this.price = 50;
        this.experienceGiven = 16;
        this.givesExperience();
    }

    @Override
    public String getClassName() {
        return "Chat";
    }
}

