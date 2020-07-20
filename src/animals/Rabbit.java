package animals;

import animals.behavior.NoReaction;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name);
        this.className = "Lapin";
        this.happyBehavior = new NoReaction();
        this.price = 5;
    }

    @Override
    public String getClassName() {
        return this.className;
    }

}
