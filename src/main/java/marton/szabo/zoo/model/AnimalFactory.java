package marton.szabo.zoo.model;

public class AnimalFactory {

    public Animal getAnimal(String[] animal) {

        for (int i = 0; i < animal.length; i++) {
            switch (animal[i]) {
                case "WOLF":
                    return new Wolf(animal[i + 1], Integer.parseInt(animal[i + 2]));
                case "BEAR":
                    return new Bear(animal[i + 1], Integer.parseInt(animal[i + 2]));
                case "HEDGEHOG":
                    return new Hedgehog(animal[i + 1], Integer.parseInt(animal[i + 2]));
                case "RABBIT":
                    return new Rabbit(animal[i + 1], Integer.parseInt(animal[i + 2]));
            }
        }
        return null;
    }
}
