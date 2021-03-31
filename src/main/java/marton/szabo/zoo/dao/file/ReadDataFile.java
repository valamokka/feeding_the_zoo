package marton.szabo.zoo.dao.file;

import lombok.Getter;
import marton.szabo.zoo.dao.ZooDAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDataFile implements ZooDAO {

    @Getter
    private List<String[]> animals;
    @Getter
    private List<String> food;
    private File fileAnimals;
    private File fileFood;

    public ReadDataFile(String fileAnimals, String fileFood) {
        this.fileAnimals = new File(fileAnimals);
        this.fileFood = new File(fileFood);
        getAllAnimalsData();
        getAllFoodsData();
    }

    @Override
    public void getAllAnimalsData() {
        animals = new ArrayList<>();
        try (Scanner scanner = new Scanner(fileAnimals)) {
            while (scanner.hasNextLine()){
                animals.add(scanner.nextLine().split(" "));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getAllFoodsData() {
        food = new ArrayList<>();
        try (Scanner scanner = new Scanner(fileFood)) {
            while (scanner.hasNextLine()){
                food.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
