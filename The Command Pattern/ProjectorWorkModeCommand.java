package Behavioural_pattern.ex1_1;

public class ProjectorWorkModeCommand implements Command {

    private Projector projector;
    private String prevMode;

    public ProjectorWorkModeCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute() {
        prevMode = projector.getMode();
        projector.workMode();
    }

    @Override
    public void undo() {

        if(prevMode.equals("OFF")) {
            projector.off();
        }
        else if(prevMode.equals("MOVIE")) {
            projector.movieMode();
        }
    }
}