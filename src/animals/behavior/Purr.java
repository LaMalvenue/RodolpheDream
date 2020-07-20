package animals.behavior;

public class Purr implements HappyBehavior {
    @Override
    public void happy() {
        System.out.println("Le chat ronronne et se dandinne.\n");
    }
}
