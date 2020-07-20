package player;

import animals.Animal;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Rodolphe {

    private static Rodolphe uniqInstance;   // Rodolphe n'est instancié qu'une fois
    private static int experience = 0;    // Initialisation de l'expérience de Rodolphe
    private static Level level;
    private static PropertyChangeSupport pcs;
    public static final List<Animal> animals = new ArrayList<>();
    private static int numberOfAnimals;

    private Rodolphe () {
    }

    public static void getRodolphe() {
        if (uniqInstance == null)
        {
            uniqInstance = new Rodolphe();
            pcs = new  PropertyChangeSupport(uniqInstance);
            Rodolphe.level = new Level((byte) 1);
            uniqInstance.addObserver(level);

            System.out.println("Vous incarnez Rodolphe, réalisez son rêve et achetez tous les animaux !\n");
        }
    }

    public static void getNumberOfAnimals() {
        numberOfAnimals = Rodolphe.animals.size();
        if (numberOfAnimals == 0)
            System.out.println("Rodolphe est très triste, il n'a aucun animal en sa possession :(");
        else if (numberOfAnimals == 1) System.out.println("Rodolphe ne possède qu'un animal pour l'instant.");
        else System.out.println("Rodolphe possède déjà " + numberOfAnimals + " animaux !");
        System.out.println();
    }

    public static void setExperience(int xpToAdd) {
        int old = Rodolphe.experience;
        Rodolphe.experience += xpToAdd;
        pcs.firePropertyChange("experience", old, Rodolphe.experience);
    }

    public static void stroke(Animal animal) {
        System.out.println("Rodolphe carresse " + animal.getName() + ".");
        animal.isHappy();
    }
    
    public void addObserver(PropertyChangeListener l) {
        pcs.addPropertyChangeListener("experience", l);
    }

    public static int getExperience() {
        return Rodolphe.experience;
    }

    public static byte getLevel() {
        return Rodolphe.level.getLevel();
    }
    
}
