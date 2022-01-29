package ru.netology;

public class Radio {
    private int volume = 0;
    private int channel = 0;
    private int maxChannels = 10;

    public Radio() {}

    public Radio(int channelsCount) {
        this.maxChannels = channelsCount;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxChannels() {
        return maxChannels;
    }

    public void setMaxChannels(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        if (volume > 100){
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
        if (this.channel == this.maxChannels-1) {
            this.channel = 0;
            return;
        }
        setChannel(this.channel + 1);
    }

    public void prevChannel() {
        if (this.channel == 0) {
            this.channel = this.maxChannels-1;
            return;
        }
        setChannel(this.channel - 1);
    }


    public void setChannel(int channelNumber) {
        if (channelNumber > this.maxChannels-1 ) {
            return;
        }
        if ( channelNumber < 0 ) {
            return;
        }
        this.channel = channelNumber;
    }
}
