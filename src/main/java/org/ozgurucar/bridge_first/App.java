package org.ozgurucar.bridge_first;

public class App {
    public static void main(String[] args) {
        Music music = new Music("Eminem - Rap God", "I am beginning to feel like a Rap God!");

        Computer computer = new Computer();

        computer.playMusic(music);
    }
}
