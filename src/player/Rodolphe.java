package player;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Rodolphe {

    private static Rodolphe uniqInstance;   // Rodolphe n'est instancié qu'une fois
    private static int experience = 0;    // Initialisation de l'expérience de Rodolphe
    private static Level level;
    private static PropertyChangeSupport pcs;

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
    public static void setExperience(int xpToAdd) {
        int old = Rodolphe.experience;
        Rodolphe.experience += xpToAdd;
        pcs.firePropertyChange("experience", old, Rodolphe.experience);
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
