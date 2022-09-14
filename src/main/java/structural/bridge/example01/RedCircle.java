package structural.bridge.example01;

public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Red Circle [radius: "+ radius +", x:"+x+ " y: "+y+"]");
    }
}
