package org.ozgurucar.bridge.device;

import org.ozgurucar.bridge.Music;
import org.ozgurucar.bridge.audiodevice.Headphones;
import org.ozgurucar.bridge.musicplayer.Fizy;

public class Computer extends ComputerAbstraction{
public Computer() {
    audioDevice = new Headphones();
    musicPlayer = new Fizy();
}

    @Override
    public void runMusic(Music music) {
        System.out.println("Computer is running");
        super.runMusic(music);
    }
}
