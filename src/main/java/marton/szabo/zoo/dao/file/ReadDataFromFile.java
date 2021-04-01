package marton.szabo.zoo.dao.file;

import marton.szabo.zoo.dao.ZooDAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDataFromFile implements ZooDAO {

    private final File FILE_ANIMALS;
    private final File FILE_FOOD;

    public ReadDataFromFile(String fileAnimals, String fileFood) {
        FILE_ANIMALS = new File(fileAnimals);
        FILE_FOOD = new File(fileFood);
    }

    @Override
    public List<String[]> getAllAnimalsData() {
        List<String[]> animals = new ArrayList<>();
        try (Scanner scanner = new Scanner(FILE_ANIMALS)) {
            while (scanner.hasNextLine()) {
                animals.add(scanner.nextLine().split(" "));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return animals;
    }

    @Override
    public List<String> getAllFoodsData() {
        List<String> food = new ArrayList<>();
        try (Scanner scanner = new Scanner(FILE_FOOD)) {
            while (scanner.hasNextLine()) {
                food.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return food;
    }
}
