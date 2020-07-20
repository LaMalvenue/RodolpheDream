package animals;

import animals.behavior.HappyBehavior;
import player.Rodolphe;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Animal {

    protected String name;
    protected String className;
    protected LocalDateTime dateAdoption;
    protected HappyBehavior happyBehavior;

    protected short experienceGiven;
    protected short price;

    public Animal(String name) {
        this.name = name;
        this.dateAdoption = LocalDateTime.now();
    }

    protected void givesExperience() {
        int actualExperience = Rodolphe.getExperience();
        Rodolphe.setExperience(actualExperience += this.experienceGiven);
    }

    public void getDateAdoption() {
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate dateAdoption = currentTime.toLocalDate();

        System.out.println(this.name + " a été adopté le " + dateAdoption + ".\n");
    }

    public abstract String getClassName();

    public String getName() {
        return this.name;
    }

    public void isHappy() {
        happyBehavior.happy();
    }
}
