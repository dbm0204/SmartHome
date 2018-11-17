package com.example.bmathew2014.smarthome;

public class MusicItems {
    private String name;

    public MusicItems(String name){
        this.name = name;
    }
    public void setname(String item_name) {
        this.name = item_name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MusicItems{" + "name='" + name + '\'' + '}';
    }
}
