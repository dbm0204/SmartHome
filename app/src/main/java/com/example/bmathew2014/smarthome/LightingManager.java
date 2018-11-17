package com.example.bmathew2014.smarthome;

public class LightingManager {
    private boolean status;
    private int intensity;

    public LightingManager() {}
    public LightingManager(boolean status, int intensity) {
        this.status = status;
        this.intensity = intensity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "LightingManager{" + "status=" + status + ", intensity=" + intensity + '}';
    }
}
