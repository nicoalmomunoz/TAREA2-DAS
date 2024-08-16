package edu.unisabana.dyas.patterns.adapters;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
