package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int id;
    private int numberOfRadioStations = 10;
    private int currentRadioStation = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 20;


    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int setNumberOfRadioStations;

    public int setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > (numberOfRadioStations - 1)) {
            currentRadioStation = 0;
        }
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation;
        }


        this.currentRadioStation = currentRadioStation;


        return currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = currentVolume;
        }

    }

    public void reducerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
    }

    public void increaseRadioStation() {

        if (currentRadioStation < (numberOfRadioStations - 1)) {
            currentRadioStation = currentRadioStation + 1;
        } else if (currentRadioStation == (numberOfRadioStations - 1)) {
            currentRadioStation = 0;
        }

    }

    public void reducerRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = numberOfRadioStations - 1;
        }
    }

    public void setCurrentMaxVolume(int i) {
    }
}
