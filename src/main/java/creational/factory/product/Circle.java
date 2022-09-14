package creational.factory.product;

import creational.factory.product.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle: draw() method.");
    }
}
