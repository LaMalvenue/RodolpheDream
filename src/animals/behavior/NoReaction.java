package animals.behavior;

public class NoReaction implements HappyBehavior {
    @Override
    public void happy() {
        System.out.println("Celui-ci n'a aucune réaction, mais Rodolphe sait qu'il n'est simplement pas très expressif !\n");
    }
}
