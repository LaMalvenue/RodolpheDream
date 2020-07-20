import animals.Cat;
import animals.Ferret;
import animals.Hamster;
import animals.Rabbit;
import player.Rodolphe;

public class App {
    public static void main(String[] args) {

        Rodolphe.getRodolphe();

        createAnimal("Hamster", "Victor");
        createAnimal("Lapin", "Charlot");
        createAnimal("Hamster", "Raymond");
        createAnimal("Hamster", "Jean-Paul");

        Rodolphe.animals.get(1).getDateAdoption();

        currentLevel();
        showAnimals();
        Rodolphe.getNumberOfAnimals();

        createAnimal("Hamster", "Raoul");
        createAnimal("Hamster", "Hugues");

        createAnimal("Cat", "Simone");

        createAnimal("Rabbit", "Mireille");
        createAnimal("Rabbit", "Odette");
        createAnimal("Rabbit", "Jacqueline");
        createAnimal("Rabbit", "Michelle");
        createAnimal("Rabbit", "Daniel");

        currentLevel();

        createAnimal("Ferret", "Nicole");
        createAnimal("Ferret", "Veronique");
        createAnimal("Ferret", "Pascal");
        createAnimal("Ferret", "Marty");
        createAnimal("Ferret", "Charles");

        Rodolphe.getNumberOfAnimals();
        currentLevel();

        createAnimal("Cat", "Poulette");
        createAnimal("Cat", "Poulet");

        Rodolphe.stroke(Rodolphe.animals.get(Rodolphe.animals.size()-1));
        Rodolphe.stroke(Rodolphe.animals.get(0));

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
                    Rodolphe.setExperience((short) 2);
                } else {
                    System.out.println("Rodolphe n'a pas encore assez d'expérience pour acheter un petit hamster !\n");
                }
                break;
            case "Rabbit":
                if (Rodolphe.getLevel() >= 2) {
                    System.out.println("Rodople achète un lapinou, il décide de lui donner le joli nom de " + name + ".");
                    Rodolphe.animals.add(new Rabbit(name));
                    Rodolphe.setExperience((short) 4);
                } else {
                    System.out.println("Rodolphe n'a pas assez d'expérience pour acheter un lapin ! :(\n");
                }
                break;
            case "Ferret":
                if (Rodolphe.getLevel() >= 3) {
                    System.out.println("Rodople achète un furet, il décide de lui donner le joli nom de " + name + ".");
                    Rodolphe.animals.add(new Ferret(name));
                    Rodolphe.setExperience((short) 8);
                } else {
                    System.out.println("Rodolphe n'a pas assez d'expérience pour acheter un furet ! :(\n");
                }
                break;
            case "Cat":
                if (Rodolphe.getLevel() >= 4) {
                    System.out.println("Rodople achète un pitichat, il décide de lui donner le joli nom de " + name + ".");
                    Rodolphe.animals.add(new Cat(name));
                    Rodolphe.setExperience((short) 16);
                } else {
                    System.out.println("Rodolphe n'a pas assez d'expérience pour acheter un chat ! :(\n");
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
