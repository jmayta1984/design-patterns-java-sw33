package creational.factory.factory;

import creational.factory.product.Circle;
import creational.factory.product.Rectangle;
import creational.factory.product.Shape;
import creational.factory.product.Square;

public class ShapeFactory implements Factory {

    @Override
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        return null;
    }
}
