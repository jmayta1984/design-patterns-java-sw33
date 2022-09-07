package creational.builder.builders;

import creational.builder.car.CarType;
import creational.builder.components.Engine;
import creational.builder.components.GPSNavigator;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setEngine(Engine engine);
    void setSeats(int seats);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    void setTransmission(Transmission transmission);
}
