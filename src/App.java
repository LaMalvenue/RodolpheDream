import animals.*;
import animals.cats.Cat;
import animals.ferrets.Ferret;
import animals.hamsters.Hamster;
import animals.rabbits.Rabbit;
import player.Rodolphe;

public class App {
    public static void main(String[] args) {

        Rodolphe.getRodolphe();

        createAnimal("Hamster", "Victor");

        Rodolphe.stroke(Rodolphe.animals.get(0));

        Rodolphe.getNumberOfAnimals();

        createAnimal("Lapin", "Charlot");

        showAnimals();

        createAnimal("Hamster", "Raymond");
        createAnimal("Hamster", "Jean-Paul");

        currentLevel();
        showAnimals();


    }

    public static void currentLevel() {
        System.out.println("Rodolphe est au niveau " + Rodolphe.getLevel());
        System.out.println("Il peut acheter :");
        switch (Rodolphe.getLevel()) {
            case 10:
                System.out.println("- Un lion !");
            case 9:
                System.out.println("- Un cheval de course");
            case 8:
                System.out.println("- Un cheval");
            case 7:
                System.out.println("- Un serpent");
            case 6:
                System.out.println("- Un gros chien");
            case 5:
                System.out.println("- Un petit chien");
            case 4:
                System.out.println("- Un chat");
            case 3:
                System.out.println("- Un furet");
            case 2:
                System.out.println("- Un lapin");
            case 1:
                System.out.println("- Un hamster");
        }
        System.out.println();
    }

    public static void createAnimal(String species, String name) {
        switch (species) {
            case "Hamster":
                if (Rodolphe.getLevel() >= 1) {
                    System.out.println("Rodople achète un hamster, il décide de lui donner le joli nom de " + name + ".");
                    Rodolphe.animals.add(new Hamster(name));
                } else {
                    System.out.println("Rodolphe n'a pas assez d'expérience pour acheter cet animal !");
                }
                break;
            case "Rabbit":
                if (Rodolphe.getLevel() >= 2) {
                    System.out.println("Rodople achète un lapinou, il décide de lui donner le joli nom de " + name + ".");
                    Rodolphe.animals.add(new Rabbit(name));
                } else {
                    System.out.println("Rodolphe n'a pas assez d'expérience pour acheter cet animal !");
                }
                break;
            case "Ferret":
                if (Rodolphe.getLevel() >= 3) {
                    System.out.println("Rodople achète un furet, il décide de lui donner le joli nom de " + name + ".");
                    Rodolphe.animals.add(new Ferret(name));
                } else {
                    System.out.println("Rodolphe n'a pas assez d'expérience pour acheter cet animal !");
                }
                break;
            case "Cat":
                if (Rodolphe.getLevel() >= 4) {
                    System.out.println("Rodople achète un pitichat, il décide de lui donner le joli nom de " + name + ".");
                    Rodolphe.animals.add(new Cat(name));
                } else {
                    System.out.println("Rodolphe n'a pas assez d'expérience pour acheter cet animal !");
                }
                break;
        }
    }

    public static void showAnimals() {
        System.out.println("Voici les animaux que Rodolphe possède pour l'instant : ");
        for (int i = 0; i < Rodolphe.animals.size(); i++) {
            System.out.print((i + 1) + ". " + Rodolphe.animals.get(i).getName() + " qui est ");
            if (Rodolphe.animals.get(i).getClassName().equals("Couleuvre")) System.out.print("une ");
            else System.out.print("un ");
            System.out.print(Rodolphe.animals.get(i).getClassName().toLowerCase());

            char ponctuation = (i < Rodolphe.animals.size() - 1) ? ',' : '.';
            System.out.println(ponctuation);
        }
        System.out.println();
    }
}
