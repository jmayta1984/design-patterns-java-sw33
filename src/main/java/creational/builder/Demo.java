package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.car.Car;
import creational.builder.director.Director;

public class Demo {

    public static void main(String[] args){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructSUVCar(builder);

        Car car = builder.getResult();

        System.out.println("Car type:\n" + car.getCarType());

    }
}
