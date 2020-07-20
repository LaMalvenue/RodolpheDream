package animals;

import animals.behavior.NoReaction;

public class Ferret extends Animal {

    public Ferret(String name) {
        super(name);
        this.className = "Furet";
        this.happyBehavior = new NoReaction();
        this.price = 20;
    }

    @Override
    public String getClassName() {
        return "Furet";
    }
}
