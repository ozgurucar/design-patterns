package org.ozgurucar.bridge.device;

import org.ozgurucar.bridge.Music;
import org.ozgurucar.bridge.audiodevice.AudioDevice;
import org.ozgurucar.bridge.musicplayer.MusicPlayer;

public abstract class ComputerAbstraction {
    protected AudioDevice audioDevice;
    protected MusicPlayer musicPlayer;

    public ComputerAbstraction() {

    }

    public ComputerAbstraction(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        this.audioDevice = audioDevice;
        this.musicPlayer = musicPlayer;
    }

    public void runMusic(Music music) {

        String audio = musicPlayer.playMusic(music);
        audioDevice.playAudio(audio);
    }

    public AudioDevice getAudioDevice() {
        return audioDevice;
    }

    public void setAudioDevice(AudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
