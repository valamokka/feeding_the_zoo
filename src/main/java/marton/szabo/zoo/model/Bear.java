package marton.szabo.zoo.model;

public class Bear extends Animal {

    private final int MAX_WEIGHT = 10;

    public Bear(String name, int weight) {
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
        setWeight(getWeight() - 1);
    }

    @Override
    public void givenMeat() {
        setWeight(getWeight() + 1);
    }


}
