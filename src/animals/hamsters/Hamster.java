package animals.hamsters;

import animals.Animal;
import animals.behavior.NoReaction;

public class Hamster extends Animal {

    public Hamster(String name) {
        super(name);
        this.className = "Hamster";
        this.happyBehavior = new NoReaction();
        this.price = 5;
        this.experienceGiven = 2;
        this.givesExperience();
    }

    @Override
    public String getClassName() {
        return this.className;
    }
}
