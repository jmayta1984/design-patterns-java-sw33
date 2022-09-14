package structural.adapter.toystore;

import structural.adapter.toystore.adaptee.Bird;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Cri Cri");
    }
}
