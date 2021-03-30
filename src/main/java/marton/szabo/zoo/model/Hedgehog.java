package marton.szabo.zoo.model;

public class Hedgehog extends Animal {

    private final int MAX_WEIGHT = 5;

    public Hedgehog(String name, int weight) {
        super(name, weight);
    }

    public boolean isAlive() {
        return getWeight() > 0 && getWeight() < MAX_WEIGHT;
    }

    @Override
    public void givenFruit() {
        setWeight(getWeight() + 2);
    }

    @Override
    public void givenVegetables() {
        setWeight(getWeight());
    }

    @Override
    public void givenMeat() {
        setWeight(getWeight() - 1);
    }
}
