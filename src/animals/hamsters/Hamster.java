package animals.hamsters;

import animals.Animal;
import animals.behavior.NoReaction;
import player.Rodolphe;

public class Hamster extends Animal {

    public Hamster (String name) {
        super(name);
        if (this.canBeInstanced())
        {
            this.className = "Hamster";
            this.happyBehavior = new NoReaction();
            this.price = 5;
            this.experienceGiven = 2;
            this.levelNeeded = 1;
            Animal.addAnimals(this);
            this.givesExperience();
            System.out.println("Rodople achète un hamster, il décide de lui donner le joli nom de "+ name + ".");
        }
        else
        {
            System.out.println("Rodolphe n'a pas assez d'expérience pour acheter cet animal !");
        }
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    protected boolean canBeInstanced() {
        return Rodolphe.getLevel() >= 1;
    }
}
