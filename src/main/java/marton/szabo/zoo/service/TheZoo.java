package marton.szabo.zoo.service;

import marton.szabo.zoo.dao.ZooDAO;
import marton.szabo.zoo.model.Animal;
import marton.szabo.zoo.model.AnimalFactory;

import java.util.List;

public class TheZoo {

    private final List<Animal> ANIMALS;
    private final List<String> FOOD;

    public TheZoo(AnimalFactory animalFactory, ZooDAO zooDAO) {
        this.ANIMALS = animalFactory.generateAllAnimal(zooDAO.getAllAnimalsData());
        this.FOOD = zooDAO.getAllFoodsData();
    }

    public void feedTheZoo() {
        for (String food : FOOD) {
            for (Animal animal : ANIMALS) {
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
        for (Animal animal : ANIMALS) {
            if (animal.isAlive()) {
                System.out.printf("%s's weight is: %d%n", animal.getName(), animal.getWeight());
            } else {
                System.out.printf("%s is DECEASED :(%n", animal.getName());
            }

        }
    }


}

