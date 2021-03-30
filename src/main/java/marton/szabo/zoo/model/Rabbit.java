package marton.szabo.zoo.model;

public class Rabbit extends Animal {

    private final int MAX_WEIGHT = 4;

    public Rabbit(String name, int weight) {
        super(name, weight);
    }


    public boolean isAlive() {
        return getWeight() > 0 && getWeight() < MAX_WEIGHT;
    }

    @Override
    public void givenFruit() {
        setWeight(getWeight() + 1);
    }

    @Override
    public void givenVegetables() {
        setWeight(getWeight() + 2);
    }

    @Override
    public void givenMeat() {
        setWeight(getWeight() - 1);
    }
}
