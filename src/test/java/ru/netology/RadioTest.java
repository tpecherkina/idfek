package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setStation() {
        Radio volna = new Radio();
        volna.setStation(0);
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void setStationHigherMax() {
        Radio volna = new Radio();

        volna.setStation(15);
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void setStationLowerMin() {
        Radio volna = new Radio();

        volna.setStation(-5);
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void switchToNext() {
        Radio volna = new Radio();

        volna.switchStationtNext();
        assertEquals(1, volna.getCurrentStation());
    }

    @Test
    void switchToPrev() {
        Radio volna = new Radio();

        volna.setStation(0);
        volna.switchStationtPrev();
        assertEquals(9, volna.getCurrentStation());
    }

    @Test
    void switchToNextLoop() {
        Radio volna = new Radio();


        volna.switchStationtNext();
        assertEquals(1, volna.getCurrentStation());
    }
    @Test
    void switchToPrevLoop() {
        Radio volna = new Radio();

        volna.switchStationtPrev();
        assertEquals(9, volna.getCurrentStation());
    }



    @Test
    void switchVolumeUp() {
        Radio volna = new Radio();

        volna.volumeUp();
        assertEquals(1, volna.getSoundVolume());
    }


    @Test
    void switchVolumeDown() {
        Radio volna = new Radio();

        volna.volumeDown();
        volna.volumeUp();
        assertEquals(1, volna.getSoundVolume());
    }

    @Test
    void borderStationMax() {
        Radio volna = new Radio();

        for (int i = 0; i < 11; i++) {
            volna.volumeUp();
        }
        assertEquals(10, volna.getSoundVolume());
    }

    @Test
    void borderStationMin() {
        Radio volna = new Radio();

        volna.volumeDown();
        assertEquals(0, volna.getSoundVolume());
    }
}
