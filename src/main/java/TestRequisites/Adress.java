package TestRequisites;

import java.io.IOException;
import java.util.Random;

public class Adress extends ReadFromFile {
    final private String index, city, street, house;
    private Random random = new Random();

    Adress()
            throws IOException {
        index = setIndex();
        city = readOneFromFile("src\\data\\city_rus.txt");
        street = readOneFromFile("src\\data\\street_rus.txt");
        house = String.valueOf(random.nextInt(200));
    }

    private String setIndex() {
        int n[] = new int[6];
        StringBuilder index = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(10);
            index.append(n[i]);
        }
        return index.toString();
    }

    public void printAdress(){
        System.out.println("Индекс:\t\t" + index);
        System.out.println("Город:\t\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
}
