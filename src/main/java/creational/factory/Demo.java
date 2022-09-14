package creational.factory;

import creational.factory.factory.ShapeFactory;
import creational.factory.product.Shape;

public class Demo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");

        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        rectangle.draw();

    }
}
