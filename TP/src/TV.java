public class TV {
    private int channel;
    private int volume;
    private boolean on;

    // Constructor
    public TV() {
        channel = 1;  // Initialize channel to 1
        volume = 1;   // Initialize volume to 1
        on = false;   // TV is initially turned off
    }

    // Method to turn on the TV
    public void turnOn() {
        on = true;
        System.out.println("TV is turned on.");
    }

    // Method to turn off the TV
    public void turnOff() {
        on = false;
        System.out.println("TV is turned off.");
    }

    // Method to set the channel
    public void setChannel(int nCh) {
        if (on && nCh >= 1 && nCh <= 120) {
            channel = nCh;
            System.out.println("Channel set to " + channel);
        }
    }

    // Method to set the volume
    public void setVolume(int nVol) {
        if (on && nVol >= 1 && nVol <= 7) {
            volume = nVol;
            System.out.println("Volume set to " + volume);
        }
    }

    // Method to increment the channel by 1
    public void chanSup() {
        if (on && channel < 120) {
            channel++;
            System.out.println("Channel incremented to " + channel);
        }
    }

    // Method to decrement the channel by 1
    public void chanInf() {
        if (on && channel > 1) {
            channel--;
            System.out.println("Channel decremented to " + channel);
        }
    }

    // Method to increment the volume by 1
    public void volumeSup() {
        if (on && volume < 7) {
            volume++;
            System.out.println("Volume incremented to " + volume);
        }
    }

    // Method to decrement the volume by 1
    public void volumeInf() {
        if (on && volume > 1) {
            volume--;
            System.out.println("Volume decremented to " + volume);
        }
    }

    public static void main(String[] args) {
        TV myTV = new TV();  // Create a TV object

        myTV.turnOn();
        myTV.setChannel(5);
        myTV.setVolume(3);
        myTV.chanSup();
        myTV.volumeInf();
        myTV.turnOff();
    }
}
