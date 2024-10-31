package me.elordenador.megajar.tema3.tresenraya;

import me.elordenador.audioplayer.AudioPlayer;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class pAudioPlayer extends AudioPlayer {
    public pAudioPlayer() throws LineUnavailableException {
    }

    public void playBackground() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        InputStream stream = getClass().getResourceAsStream("/me/elordenador/megajar/tema3/tresenraya/audio/background.wav");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(stream);
        load(bufferedInputStream);
        play();
    }
}
