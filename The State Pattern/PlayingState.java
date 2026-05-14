package Behavioural_pattern.ex4;

public class PlayingState implements State{
	@Override
    public void play(MediaPlayer player) {
        System.out.println("Media is already playing.");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pausing media...");

        player.setIcon("PLAY");
        player.setState(new PausedState());
    }
}
