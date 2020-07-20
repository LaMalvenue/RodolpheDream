package animals;

import animals.behavior.HappyBehavior;
import player.Rodolphe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    protected String name;
    protected String className;
    protected LocalDateTime dateAdoption;
    protected HappyBehavior happyBehavior;

    protected short experienceGiven;
    protected short price;
    protected byte levelNeeded;

    private static final List<Animal> animals = new ArrayList<>();
    private static int numberOfAnimals;

    public Animal(String name) {
        this.name = name;
        this.dateAdoption = LocalDateTime.now();
    }

    protected static void addAnimals(Animal animal) {
        animals.add(animal);
    }

    public static void showAnimals() {
        System.out.println("Voici les animaux que Rodolphe possède pour l'instant : ");
        for (int i = 0; i < animals.size(); i++) 
        {
            System.out.print((i + 1) + ". " + animals.get(i).name + " qui est ");
            if (animals.get(i).getClassName().equals("Couleuvre")) System.out.print("une ");
            else System.out.print("un ");
            System.out.print(animals.get(i).getClassName().toLowerCase());

            char ponctuation = (i < animals.size() - 1) ? ',' : '.';
            System.out.println(ponctuation);
        }
    }

    protected void givesExperience() {
        int actualExperience = Rodolphe.getExperience();
        Rodolphe.setExperience(actualExperience += this.experienceGiven);
    }

    public void getDateAdoption() {
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate dateAdoption = currentTime.toLocalDate();

        System.out.println(this.name + " a été adopté le " + dateAdoption + ".");
    }

    public static void getNumberOfAnimals() {
        numberOfAnimals = animals.size();
        if (numberOfAnimals == 0)
            System.out.println("Rodolphe est très triste, il n'a aucun animal en sa possession :(");
        else if (numberOfAnimals == 1) System.out.println("Rodolphe ne possède qu'un animal pour l'instant.");
        else System.out.println("Rodolphe possède déjà " + numberOfAnimals + " animaux !");
    }

    public abstract String getClassName();

    protected abstract boolean canBeInstanced();

    public void stroke() {
        System.out.println("Rodolphe caresse " + this.name + ".");
        happyBehavior.isHappy();
    }
}
