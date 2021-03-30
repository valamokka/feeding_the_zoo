package marton.szabo.zoo.service;

import marton.szabo.zoo.model.Animal;
import java.util.List;

public class FeedingTheZoo {

    private List<Animal> animals;
    private final List<String> FOOD;

    public FeedingTheZoo(List<Animal> animals, List<String> food) {
        this.animals = animals;
        this.FOOD = food;
    }

    public void feedTheZoo() {
        for (String food : FOOD) {
            for (Animal animal : animals) {
                if (animal.isAlive()) {
                    switch (food) {
                        case "meat":
                            animal.givenMeat();
                            break;
                        case "fruit":
                            animal.givenFruit();
                            break;
                        case "vegetables":
                            animal.givenVegetables();
                            break;
                    }
                }
            }

        }
    }

    public void printResults() {
        System.out.printf("After %d days of feeding the animals:%n", FOOD.size());
        for (Animal animals1 : animals) {
            if (animals1.isAlive()) {
                System.out.printf("%s's weight is: %d%n", animals1.getName(), animals1.getWeight());
            } else {
                System.out.printf("%s is DECEASED :(%n", animals1.getName());
            }

        }
    }


}

