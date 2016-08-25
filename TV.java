/***********************************
File Name: TV.java
Author: island
Email: 1159401236@qq.com 
Created Time: 2016年08月25日 星期四 16时09分20秒
***********************************/
public class TV {
    int channel = 1; // Default channel
    int volumeLevel = 1; // Default volume vevel
    boolean on = false; // TV is off

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >=1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }
    
    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}
