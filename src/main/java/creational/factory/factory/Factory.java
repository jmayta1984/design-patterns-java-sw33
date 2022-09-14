package creational.factory.factory;

import creational.factory.product.Shape;

public interface Factory {
    public Shape getShape(String shapeType);
}
