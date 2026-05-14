package Behavioural_pattern.ex1_1;

public class Projector {
    private String mode = "OFF";

    public void workMode() {
        mode = "WORK";
        System.out.println("Projector WORK mode");
    }

    public void movieMode() {
        mode = "MOVIE";
        System.out.println("Projector MOVIE mode");
    }

    public void off() {
        mode = "OFF";
        System.out.println("Projector OFF");
    }

    public String getMode() {
        return mode;
    }
}
