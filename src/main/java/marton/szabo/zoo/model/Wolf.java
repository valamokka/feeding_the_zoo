package marton.szabo.zoo.model;

public class Wolf extends Animal {

    private final int MAX_WEIGHT = 6;

    public Wolf(String name, int weight) {
        super(name, weight);

    }


    public boolean isAlive() {
        return getWeight() > 0 && getWeight() < MAX_WEIGHT;
    }

    @Override
    public void givenFruit() {
        setWeight(getWeight()-1);
    }

    @Override
    public void givenVegetables() {
        setWeight(getWeight()-1);
    }

    @Override
    public void givenMeat() {
        setWeight(getWeight()+3);
    }

}
