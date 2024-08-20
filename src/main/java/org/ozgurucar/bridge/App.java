package org.ozgurucar.bridge;


import org.ozgurucar.bridge.audiodevice.Headphones;
import org.ozgurucar.bridge.device.Computer;
import org.ozgurucar.bridge.device.Phone;
import org.ozgurucar.bridge.musicplayer.Fizy;
import org.ozgurucar.bridge.musicplayer.Spotify;

public class App {
    public static void main(String[] args) {
        Music music = new Music("Eminem - Rap God", "I am beginning to feel like a Rap God!");

        Computer computer = new Computer();
        computer.runMusic(music);

        System.out.println();

        //firstly created by constructor but we can also use build structure; first create empty object then set
        Phone phone = new Phone(new Headphones(), new Spotify());
        phone.runMusic(music);

        // it becomes settable like playing youtube, spotify or else any time
        phone.setMusicPlayer(new Fizy());
        phone.runMusic(music);
    }
}
