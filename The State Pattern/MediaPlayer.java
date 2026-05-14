package Behavioural_pattern.ex4;

public class MediaPlayer {
	private State state;
    private String icon;

    public MediaPlayer() {
        state = new PausedState();
        icon = "PLAY";
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void showStatus() {
        System.out.println("Current Icon: " + icon);
        System.out.println("Current State: " + state.getClass().getSimpleName());
        System.out.println();
    }
}
