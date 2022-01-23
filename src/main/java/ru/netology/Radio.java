package ru.netology;

public class Radio {
    private int volume = 0;
    private int channel = 0;

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        if (volume > 10){
            return;
        }
        if (volume < 0){
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        setVolume(this.volume + 1);
    }

    public void decreaseVolume() {
        setVolume(this.volume - 1);
    }

    public void nextChannel() {
        if (this.channel == 9) {
            this.channel = 0;
            return;
        }
        this.channel = this.channel + 1;
    }

    public void prevChannel() {
        if (this.channel == 0) {
            this.channel = 9;
            return;
        }
        this.channel = this.channel - 1;
    }


    public void setChannel(int channelNumber) {
        if ( channelNumber > 9 ) {
            return;
        }
        if ( channelNumber < 0 ) {
            return;
        }
        this.channel = channelNumber;
    }
}
