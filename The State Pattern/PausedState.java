package Behavioural_pattern.ex4;

public class PausedState implements State{
	@Override
    public void play(MediaPlayer player) {
        System.out.println("Playing media...");

        player.setIcon("PAUSE");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Media is already paused.");
    }
}
