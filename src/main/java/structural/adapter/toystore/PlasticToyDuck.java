package structural.adapter.toystore;

import structural.adapter.toystore.target.ToyDuck;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
