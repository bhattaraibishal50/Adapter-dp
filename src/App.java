public class App {
    public static void main(String[] args) throws Exception {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic("mp3", "song1.mp3");
        audioPlayer.playMusic("mp4", "song2.mp4");
        audioPlayer.playMusic("vlc", "song3.vlc");
        audioPlayer.playMusic("xyz", "song4.avi");
    }
}
