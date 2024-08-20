package org.ozgurucar.bridge_first;

public class Music {
    private String name;
    private String audio;

    public Music(String name,String audio) {
        this.audio = audio;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
