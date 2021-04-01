package marton.szabo.zoo;

import marton.szabo.zoo.dao.file.ReadDataFile;
import marton.szabo.zoo.model.AnimalFactory;
import marton.szabo.zoo.service.FeedingTheZoo;

public class Main {

    public static void main(String[] args) {
        String fileNameAnimals = "src/main/resources/models.txt";
        String fileNameFoods = "src/main/resources/food.txt";
        FeedingTheZoo feed = new FeedingTheZoo(new AnimalFactory(),
                new ReadDataFile(fileNameAnimals, fileNameFoods));
        feed.feedTheZoo();
        feed.printResults();
    }

}
