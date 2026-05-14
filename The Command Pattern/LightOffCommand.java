package Behavioural_pattern.ex1_1;

public class LightOffCommand implements Command {

    private Light light;
    private int prevBrightness;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevBrightness = light.getBrightness();
        light.off();
    }

    @Override
    public void undo() {
        light.setBrightness(prevBrightness);
    }
}
