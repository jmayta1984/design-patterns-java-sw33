package structural.facade.example02;

public class CarEngineFacade {

    private static final int TEMPERATURE = 90;

    private Starter starter = new Starter();

    private CoolingController coolingController = new CoolingController();

    private FuelInjector fuelInjector = new FuelInjector();

    public void startEngine(){
        starter.start();
        fuelInjector.on();
        coolingController.setTemperatureLimit(TEMPERATURE);
        coolingController.run();
    }
}
