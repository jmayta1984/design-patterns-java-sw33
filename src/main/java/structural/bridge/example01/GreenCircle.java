package structural.bridge.example01;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Green Circle [radius: "+ radius +", x:"+x+ " y: "+y+"]");
    }
}
