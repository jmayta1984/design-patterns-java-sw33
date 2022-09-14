package structural.adapter.toystore;

import structural.adapter.toystore.adaptee.Bird;
import structural.adapter.toystore.adapter.BirdAdapter;
import structural.adapter.toystore.target.ToyDuck;

public class Demo {

    public static void main(String[] args){
        Bird sparrow = new Sparrow();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();

        System.out.println();

        System.out.println("Sparrow...");
        sparrow.makeSound();

        System.out.println();

        PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
        System.out.println("Plastic Toy Duck...");
        plasticToyDuck.squeak();

    }
}
