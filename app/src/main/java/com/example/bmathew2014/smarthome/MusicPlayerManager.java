package com.example.bmathew2014.smarthome;

import java.util.List;

public class MusicPlayerManager {
    private List<MusicItems> sound_track;
    private int volune;

    public MusicPlayerManager(List<MusicItems> sound_track, int volune) {
        this.sound_track = sound_track;
        this.volune = volune;
    }

    public void setSound_track(List<MusicItems> sound_track) {
        this.sound_track = sound_track;
    }

    public void setVolune(int volune) {
        this.volune = volune;
    }

    public List<MusicItems> getSound_track() {

        return sound_track;
    }

    public int getVolune() {
        return volune;
    }
}
