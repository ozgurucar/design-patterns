package org.ozgurucar.bridge_first;

public class Computer {
    private Spotify spotify;
    private Speaker speaker;

    public Computer() {
        this.speaker = new Speaker();
        this.spotify = new Spotify();
    }

    public void playMusic(Music music) {
        System.out.println("Computer is running");
        String audio = spotify.playMusic(music);
        speaker.playAudio(audio);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
