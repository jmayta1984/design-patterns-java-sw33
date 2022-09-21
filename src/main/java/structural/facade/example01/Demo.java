package structural.facade.example01;

public class Demo {

    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawTriangle();
    }
}
