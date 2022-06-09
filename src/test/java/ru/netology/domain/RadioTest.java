package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {


    @Test
    public void shouldTheRadioStationTurnOn9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);


        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheRadioStationTurnOn8() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);


        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheRadioStationTurnOn5() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);


        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheRadioStationTurnOn0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);


        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheRadioStationTurnOn1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);


        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheRadioStationTurnOn10() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);


        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationWillBeBigger9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.increaseRadioStation();


        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationWillBeBigger8AndThenBigger9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.increaseRadioStation();
        radio.increaseRadioStation();


        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom9To8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.reducerRadioStation();


        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.increaseRadioStation();


        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test

    public void shouldTheRadioStationWillBeSmaller0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.reducerRadioStation();


        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom8To9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.increaseRadioStation();


        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom7To8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.increaseRadioStation();


        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom6To7() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.increaseRadioStation();


        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom5To6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.increaseRadioStation();


        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom1To2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.increaseRadioStation();


        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test

    public void shouldTheRadioStationSwitchFrom2To3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        radio.increaseRadioStation();


        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheRadioStationTurnOnMinus100() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-100);


        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);


    }


    @Test
    public void shouldTheVolumeTurnOnTo10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);


        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheVolumeTurnOnTo9() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);


        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheVolumeTurnOnTo0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldTheVolumeTurnOnTo1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);


        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }


    @Test
    public void shouldTheVolumeTurnOnTo11() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }


    @Test


    public void shouldTheVolumeIncreaseFrom9To10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);


        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test


    public void shouldTheVolumeIncreaseFrom10To11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);


        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test


    public void shouldTheVolumeIncreaseFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test


    public void shouldTheVolumeDecreaseFrom10To9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);


        radio.reducerVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test


    public void shouldTheVolumeDecreaseFrom1To0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);


        radio.reducerVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test


    public void shouldTheVolumeDecreaseFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        //radio.inc50percent();

        radio.reducerVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test


    public void shouldTheVolumeLow0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test


    public void shouldTheVolumeIncreaseFrom1To2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);


        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }




}