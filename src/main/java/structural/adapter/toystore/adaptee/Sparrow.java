package structural.adapter.toystore.adaptee;

public class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Cri Cri");
    }
}
