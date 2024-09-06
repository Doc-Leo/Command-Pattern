public class MusicPlayer {
    private boolean isPlaying;
    private int volume;

    public MusicPlayer() {
        this.isPlaying = false;
        this.volume = 50;  // Default volume level
    }

    public void playMusic() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Playing music.");
        } else {
            System.out.println("Music is already playing.");
        }
    }

    public void stopMusic() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Stopping music.");
        } else {
            System.out.println("No music is playing.");
        }
    }

    public void increaseVolume() {
        if (isPlaying) {
            if (volume < 100) {
                volume += 10;
                System.out.println("Increasing volume to " + volume + ".");
            } else {
                System.out.println("Volume is already at maximum.");
            }
        } else {
            System.out.println("Play some music first!");
        }
    }

    public void decreaseVolume() {
        if (isPlaying) {
            if (volume > 0) {
                volume -= 10;
                System.out.println("Decreasing volume to " + volume + ".");
            } else {
                System.out.println("Volume is already at minimum.");
            }
        } else {
            System.out.println("Play some music first!");
        }
    }

    public void showStatus() {
        if (isPlaying) {
            System.out.println("Music is playing. Current volume: " + volume);
        } else {
            System.out.println("No music is playing.");
        }
    }
}
