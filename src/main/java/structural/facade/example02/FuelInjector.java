package structural.facade.example02;

public class FuelInjector {
    private FuelPump fuelPump;

    public FuelInjector() {
        fuelPump = new FuelPump();
    }

    public void on(){
        System.out.println("FuelInjector::Turning Fuel Injector on");
    }

    public void inject(){
        this.fuelPump.pump();
    }
}
