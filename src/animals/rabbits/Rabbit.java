package animals.rabbits;

import animals.Animal;
import animals.behavior.NoReaction;
import player.Rodolphe;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name);
        if (this.canBeInstanced()) {
            this.className = "Lapin";
            this.happyBehavior = new NoReaction();
            this.price = 5;
            this.experienceGiven = 4;
            this.levelNeeded = 2;
            Animal.addAnimals(this);
            this.givesExperience();
            System.out.println("Rodople achète un lapinou, il décide de lui donner le joli nom de " + name + ".");

        } else {
            System.out.println("Rodolphe n'a pas assez d'expérience pour acheter un lapin ! :(");
        }
    }
    @Override
    public String getClassName() {
        return this.className;
    }
    
    @Override
    protected boolean canBeInstanced() {
        return Rodolphe.getLevel() >= 2;
    }
}
