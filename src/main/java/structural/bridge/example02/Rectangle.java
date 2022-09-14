package structural.bridge.example02;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.coloring();
    }
}
