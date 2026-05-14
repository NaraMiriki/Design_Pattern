package Behavioural_pattern.ex4;

public class Main {
	public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer();

        player.showStatus();

        player.play();
        player.showStatus();

        player.play();
        player.showStatus();

        player.pause();
        player.showStatus();

        player.pause();
        player.showStatus();
    }
}
