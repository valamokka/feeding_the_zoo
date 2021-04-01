package marton.szabo.zoo.model;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactory {

    public List<Animal> generateAllAnimal(List<String []> allAnimals) {
        List<Animal> generatedAnimals = new ArrayList<>();
        for (String [] animal : allAnimals) {
            for (int i = 0; i < animal.length; i++) {
                switch (animal[i]) {
                    case "WOLF":
                        generatedAnimals.add(new Wolf(animal[i + 1], Integer.parseInt(animal[i + 2])));
                        break;
                    case "BEAR":
                        generatedAnimals.add(new Bear(animal[i + 1], Integer.parseInt(animal[i + 2])));
                        break;
                    case "HEDGEHOG":
                        generatedAnimals.add(new Hedgehog(animal[i + 1], Integer.parseInt(animal[i + 2])));
                        break;
                    case "RABBIT":
                        generatedAnimals.add(new Rabbit(animal[i + 1], Integer.parseInt(animal[i + 2])));
                        break;
                }
            }
        }
        return generatedAnimals;
    }
}
