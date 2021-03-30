package marton.szabo.zoo;

import marton.szabo.zoo.model.AnimalFactory;
import marton.szabo.zoo.dao.file.ReadDataFile;
import marton.szabo.zoo.service.FeedingTheZoo;
import marton.szabo.zoo.service.SetupTheZoo;

public class Main{

    public static void main(String[] args) {

        SetupTheZoo set = new SetupTheZoo(new AnimalFactory(), new ReadDataFile("src/main/resources/models.txt", "src/main/resources/food.txt"));
        FeedingTheZoo feed = new FeedingTheZoo(set.getAllAnimals(), set.getFood());
        feed.feedTheZoo();
        feed.printResults();
    }

}
