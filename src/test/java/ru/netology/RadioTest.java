package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void volumeUp() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeUpBorder() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeDownBorder() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setChannel() {
        Radio radio = new Radio();
        radio.setChannel(5);
        int expected = 5;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setChannelLarger() {
        Radio radio = new Radio();
        radio.setChannel(10);
        int expected = 0;
        int actual = radio.getChannel();

        assertEquals(expected, actual);;
    }

    @Test
    void setChannelLess() {
        Radio radio = new Radio();
        radio.setChannel(-1);
        int expected = 0;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void nextChannel() {
        Radio radio = new Radio();
        radio.nextChannel();
        int expected = 1;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }
    @Test
    void nextChannelBorder() {
        Radio radio = new Radio();
        radio.setChannel(9);
        radio.nextChannel();
        int expected = 0;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prevChannel() {
        Radio radio = new Radio();
        radio.setChannel(4);
        radio.prevChannel();
        int expected = 3;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prevChannelBorder() {
        Radio radio = new Radio();
        radio.setChannel(0);
        radio.prevChannel();
        int expected = 9;
        int actual = radio.getChannel();

        assertEquals(expected, actual);
    }

}
