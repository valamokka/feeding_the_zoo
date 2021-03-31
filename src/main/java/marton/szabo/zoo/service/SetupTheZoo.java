package marton.szabo.zoo.service;

import marton.szabo.zoo.dao.file.ReadDataFile;
import marton.szabo.zoo.model.Animal;
import lombok.Getter;
import marton.szabo.zoo.model.AnimalFactory;

import java.util.ArrayList;
import java.util.List;

public class SetupTheZoo {

    private AnimalFactory animalFactory;
    private ReadDataFile readDataFile;
    @Getter
    private List<String> food;


    public SetupTheZoo(AnimalFactory animalFactory, ReadDataFile readDataFile) {
        this.animalFactory = animalFactory;
        this.readDataFile = readDataFile;
        this.food = readDataFile.getFood();
    }

    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < readDataFile.getAnimals().size(); i++) {
            animals.add(animalFactory.getAnimal(readDataFile.getAnimals().get(i)));
        }
        return animals;
    }
}
