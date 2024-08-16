package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.adapters.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());

        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.stop();

        audioPlayer.play("vlc", "song.vlc");
        audioPlayer.stop();

        audioPlayer.play("mp3", "audio.mp3");  // Formato no soportado
    }
}
