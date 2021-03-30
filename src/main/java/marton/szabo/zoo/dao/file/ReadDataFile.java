package marton.szabo.zoo.dao.file;

import lombok.Getter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDataFile {

    @Getter
    private List<String[]> animals;
    @Getter
    private List<String> food;
    private File fileAnimals;
    private File fileFood;

    public ReadDataFile(String fileAnimals, String fileFood) {
        this.fileAnimals = new File(fileAnimals);
        this.fileFood = new File(fileFood);
        addAllAnimals();
        addAllFood();
    }

    public void addAllAnimals(){
        animals = new ArrayList<>();
        try (Scanner scanner = new Scanner(fileAnimals)) {
            while (scanner.hasNextLine()){
                animals.add(scanner.nextLine().split(" "));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addAllFood(){
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
