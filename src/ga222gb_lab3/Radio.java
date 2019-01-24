package ga222gb_lab3;

public class Radio {

    private boolean isOn = false;
    private int channel = 1;
    private int volume = 1;

    public String getSettings(){
        String settings = "Settings: On " + isOn + ", Channel " + channel + ", Volume " + volume;
        return settings;
    }

    private boolean checkRadioState(){
        if(isOn == false) {
            System.out.println("Radio off ==> No adjustment possible");
            return false;
        }
        return true;
    }

    private boolean checkVolume(int value){
        if(value < 0 || value > 5){
            System.out.println("New volume not within range!");
            return false;
        }
        return true;
    }

    private boolean checkChannel(int value){
        if(value < 1 || value > 10){
            System.out.println("New channel not within range!");
            return false;
        }
        return true;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
        channel = 1;
        volume = 1;
    }

    public void channelUp(){
        if(checkRadioState()){
            int value = channel + 1;
            if(checkChannel(value)){
                channel = channel + 1;
            }
        }
    }

    public void channelDown(){
        if(checkRadioState()){
            int value = channel - 1;
            if(checkChannel(value)) {
                channel = channel - 1;
            }
        }
    }

    public void volumeUp(){
        if(checkRadioState()) {
            int value = volume + 1;
            if(checkVolume(value)){
                volume = volume + 1;
            }
        }
    }

    public void volumeDown(){
        if(checkRadioState()) {
            int value = volume - 1;
            if(checkVolume(value)){
                volume = volume - 1;
            }
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(checkRadioState()) {
            if (checkChannel(channel)) {
                this.channel = channel;
            }
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(checkRadioState()) {
            if (checkVolume(volume)) {
                this.volume = volume;
            }
        }
    }
}
