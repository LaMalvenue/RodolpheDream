package animals.behavior;

public class WagTheTail implements HappyBehavior {
    @Override
    public void happy() {
        System.out.println("Le chien remue la queue.\n");
    }
}
