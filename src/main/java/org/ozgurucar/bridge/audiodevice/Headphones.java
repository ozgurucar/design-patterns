package org.ozgurucar.bridge.audiodevice;

public class Headphones implements AudioDevice {
    @Override
    public void playAudio(String audio) {
        System.out.println("Headphones playing audio -> " + audio);
    }
}
