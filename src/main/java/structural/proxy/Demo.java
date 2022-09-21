package structural.proxy;

public class Demo {

    public static void main(String[] args){
        Image image = new ProxyImage("pikachu.png");

        image.display();

        System.out.println("");
        image.display();
    }
}
