package marton.szabo.zoo;

import marton.szabo.zoo.dao.file.ReadDataFromFile;
import marton.szabo.zoo.model.AnimalFactory;
import marton.szabo.zoo.service.TheZoo;

public class Main {

    public static void main(String[] args) {
        String fileNameAnimals = "src/main/resources/models.txt";
        String fileNameFoods = "src/main/resources/food.txt";
        TheZoo zoo = new TheZoo(new AnimalFactory(),
                new ReadDataFromFile(fileNameAnimals, fileNameFoods));
        zoo.feedTheZoo();
        zoo.printResults();
    }

}
