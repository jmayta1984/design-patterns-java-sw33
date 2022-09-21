package structural.facade.example02;

public class CoolingController {

    private TemperatureSensor temperatureSensor;
    private Radiator radiator;

    public CoolingController() {
        this.temperatureSensor = new TemperatureSensor();
        this.radiator = new Radiator();
    }

    public void setTemperatureLimit(int temperature){
        System.out.println("CoolingController::Setting the temperature limit: " + temperature);
    }

    public void run(){
        radiator.on();
        temperatureSensor.on();
        System.out.println("CoolingController::Running");
    }
}
