package com.example.bmathew2014.smarthome;

public class TemperatureManager {
    private double temperature;

    public TemperatureManager() {}
    public TemperatureManager(double temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "TemperatureManager{" + "temperature=" + temperature + '}';
    }

    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
