package player;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Level implements PropertyChangeListener {

    private byte level;

    public Level(byte level) {
        this.level = level;
    }

    public byte getLevel() {
        return level;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Rodolphe gagne de l'" + evt.getPropertyName() + " !");
        System.out.println("\t(" + evt.getOldValue() +  " -> " + evt.getNewValue() + ")\n");
        
        int experience = (int) evt.getNewValue();

        if (experience < 10) this.level=1;
        else if (experience < 30) this.level=2;
        else if (experience < 50) this.level=3;
        else if (experience < 100) this.level=4;
        else if (experience < 200) this.level=5;
        else if (experience < 400) this.level=6;
        else if (experience < 800) this.level=7;
        else if (experience < 1600) this.level=8;
        else if (experience < 3200) this.level=9;
        else if (experience >= 3200) this.level=10;
    }

}
