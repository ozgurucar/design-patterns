package org.ozgurucar.bridge.musicplayer;

import org.ozgurucar.bridge.Music;

public class Fizy implements MusicPlayer {
    @Override
    public String playMusic(Music music) {
        System.out.println("Fizy playing -> " + music);
        return music.getAudio();
    }
}
