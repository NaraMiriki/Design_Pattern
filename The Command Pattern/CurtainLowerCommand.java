package Behavioural_pattern.ex1_1;

public class CurtainLowerCommand implements Command {

    private Curtain curtain;
    private int prevPosition;
    private int newPosition;

    public CurtainLowerCommand(Curtain curtain, int newPosition) {
        this.curtain = curtain;
        this.newPosition = newPosition;
    }

    @Override
    public void execute() {
        prevPosition = curtain.getPosition();
        curtain.lower(newPosition);
    }

    @Override
    public void undo() {
        curtain.raise(prevPosition);
    }
}
