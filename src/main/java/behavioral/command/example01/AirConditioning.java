package behavioral.command.example01;

public class AirConditioning {

    private int temperature;

    void on(){
        System.out.println("Air conditioning on");

    }

    void off(){
        System.out.println("Air conditioning off");
    }

    void setTemperature(int temperature){
        this.temperature = temperature;

        System.out.println("Air conditioning temperature: " + temperature);

    }
}
