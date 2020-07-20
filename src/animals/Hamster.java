package animals;

import animals.behavior.NoReaction;

public class Hamster extends Animal {

    public Hamster(String name) {
        super(name);
        this.className = "Hamster";
        this.happyBehavior = new NoReaction();
        this.price = 5;
    }

    @Override
    public String getClassName() {
        return this.className;
    }
}
