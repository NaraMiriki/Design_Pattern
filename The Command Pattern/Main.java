package Behavioural_pattern.ex1_1;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        Curtain curtain = new Curtain();
        Projector projector = new Projector();

        SmartOfficeController controller =
                new SmartOfficeController();

        Command lightOff =
                new LightOffCommand(light);

        Command curtainDown =
                new CurtainLowerCommand(curtain, 50);

        Command projectorWork =
                new ProjectorWorkModeCommand(projector);

        Command[] meetingCommands = {
                curtainDown,
                lightOff,
                projectorWork
        };

        MacroCommand startMeeting =
                new MacroCommand(meetingCommands);

        controller.pressButton(startMeeting);

        System.out.println();

        controller.undoButton();

        System.out.println();

        controller.showLogs();
    }
}
