package structural.facade.example01;

public class ShapeMaker {
    private Circle circle;
    private Square square;
    private Triangle triangle;

    public ShapeMaker(){
        this.circle = new Circle();
        this.square = new Square();
        this.triangle = new Triangle();
    }

    public void drawCircle(){
        this.circle.draw();
    }

    public void drawSquare(){
        this.square.draw();
    }

    public void drawTriangle(){
        this.triangle.draw();
    }
}
