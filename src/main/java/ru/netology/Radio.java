package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int numberStation) {
        if (currentStation >= minStation && numberStation <= maxStation) this.currentStation = currentStation;
    }

    public void switchStationtNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        } else {
            currentStation++;
        }

    }
    public void switchStationtPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation-=1;
    }


    public int getSoundVolume() {
        return currentVolume;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume)
            return;
        currentVolume++;
    }


    public void volumeDown() {
        if (currentVolume == minVolume)
            return;
        currentVolume--;

    }



}
