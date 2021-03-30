package marton.szabo.zoo.model;

import lombok.Getter;
import lombok.Setter;

public abstract class Animal {
    @Getter
    private String name;
    @Getter
    @Setter
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public abstract boolean isAlive();

    public abstract void givenFruit();

    public abstract void givenVegetables();

    public abstract void givenMeat();


}
