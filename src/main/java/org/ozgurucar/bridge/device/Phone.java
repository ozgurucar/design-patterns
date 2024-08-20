package org.ozgurucar.bridge.device;

import org.ozgurucar.bridge.Music;
import org.ozgurucar.bridge.audiodevice.AudioDevice;
import org.ozgurucar.bridge.musicplayer.MusicPlayer;

public class Phone extends ComputerAbstraction {

    public Phone(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        super(audioDevice, musicPlayer);
    }

    @Override
    public void runMusic(Music music) {
        System.out.println("Phone is running");
        super.runMusic(music);
    }


}
