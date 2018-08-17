package TestRequisites;

import java.io.IOException;

public class Adress extends Helper {
    final private String index, city, street, house;

    Adress()
            throws IOException {
        index = generateRandomStringNumber(6);
        city = readOneFromFile("src\\data\\city_rus.txt");
        street = readOneFromFile("src\\data\\street.txt");
        house = String.valueOf(random.nextInt(200));
    }

    public void printAdress(){
        System.out.println("Индекс:\t\t" + index);
        System.out.println("Город:\t\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
}
