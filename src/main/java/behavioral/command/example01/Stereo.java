package behavioral.command.example01;

public class Stereo {

    private int volume;

    void on(){
        System.out.println("Stereo on");
    }

    void off(){
        System.out.println("Stereo off");
    }

    void setVolumen(int volume){
        this.volume = volume;
        System.out.println("Stereo volume: " + volume);
    }

}
