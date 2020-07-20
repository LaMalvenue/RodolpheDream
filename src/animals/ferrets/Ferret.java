package animals.ferrets;

import animals.Animal;
import animals.behavior.NoReaction;

public class Ferret extends Animal {
    
    public Ferret(String name) {
        super(name);
        this.className = "Furet";
        this.happyBehavior = new NoReaction();
        this.price = 20;
        this.experienceGiven = 8;
        this.givesExperience();
    }

    @Override
    public String getClassName() {
        return "Furet";
    }
}
