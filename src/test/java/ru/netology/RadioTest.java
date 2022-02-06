package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void createRadioDefault() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.getMaxChannels();

        assertEquals(expected, actual);
    }

    @Test
    void createRadioWithChannels() {
        Radio radio = new Radio(100);
        int expected = 100;
        int actual = radio.getMaxChannels();

        assertEquals(expected, actual);
    }

    Radio radio = new Radio();
    @Test
    void volumeUp() {
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeUpBorder() {
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeDown() {
        radio.setVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeDownBorder() {
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setChannel() {
        radio.setChannel(5);
        int expected = 5;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setChannelLarger() {
        radio.setChannel(10);
        int expected = 0;
        int actual = radio.getChannel();

        assertEquals(expected, actual);;
    }

    @Test
    void setChannelLess() {
        radio.setChannel(-1);
        int expected = 0;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void nextChannel() {
        radio.nextChannel();
        int expected = 1;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }
    @Test
    void nextChannelBorder() {
        radio.setChannel(9);
        radio.nextChannel();
        int expected = 0;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prevChannel() {
        radio.setChannel(4);
        radio.prevChannel();
        int expected = 3;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prevChannelBorder() {
        radio.setChannel(0);
        radio.prevChannel();
        int expected = 9;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setMaxChannels() {
        radio.setMaxChannels(15);
        int expected = 15;
        int actual = radio.getMaxChannels();

        assertEquals(expected, actual);
    }

}
