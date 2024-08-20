package org.ozgurucar.bridge.musicplayer;

import org.ozgurucar.bridge.Music;

public class Spotify implements MusicPlayer {
    @Override
    public String playMusic(Music music) {
        System.out.println("Spotify playing -> " + music);
        return music.getAudio();
    }
}
