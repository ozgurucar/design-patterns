package org.ozgurucar.bridge_first;

public class Spotify {
    public String playMusic(Music music) {
        System.out.println("Spotify playing -> " + music.getName());
        return music.getAudio();
    }
}
