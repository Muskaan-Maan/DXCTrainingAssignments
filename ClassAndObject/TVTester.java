
class TV{
    int channel;
    int volumeLevel;
    boolean on;



    public TV() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel) {

        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolumeLevel(int newVolumeLevel) {

        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp(){
        if (on && channel < 120){
            channel++;
        }
    }

    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp(){

        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){

        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
public class TVTester {

    public static void main(String[] args){

        TV t = new TV();
        t.turnOn();
        t.setChannel(45);
        t.setVolumeLevel(5);

        System.out.println("TV channel is " + t.channel);
        System.out.println("Volume is " + t.volumeLevel);

        t.turnOff();

        TV t1 = new TV();

        t1.setChannel(45);
        t1.setVolumeLevel(5);
        t1.channelUp();

        System.out.println("Tv1 channel is " + t1.channel);

        t1.channelDown();

        System.out.println("Tv1 channel is " + t1.channel);

        t1.volumeUp();

        System.out.println("TV1 Volume is " + t1.volumeLevel);
        t1.volumeDown();
        System.out.println("Tv1 Volume is " + t1.volumeLevel);

    }
}
