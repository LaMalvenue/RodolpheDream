package animals.rabbits;

import animals.Animal;
import animals.behavior.NoReaction;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name);
        this.className = "Lapin";
        this.happyBehavior = new NoReaction();
        this.price = 5;
        this.experienceGiven = 4;
        this.givesExperience();
    }

    @Override
    public String getClassName() {
        return this.className;
    }

}
