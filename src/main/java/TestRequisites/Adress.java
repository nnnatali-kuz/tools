package TestRequisites;

import java.io.IOException;

public class Adress extends Helper {
    private String index, city, street, house;

    Adress(Country country)
            throws IOException {
        index = generateRandomStringNumber(6);
        street = readOneFromFile("src\\data\\street.txt");
        house = String.valueOf(random.nextInt(200));

        switch (country) {
            case RUS: {
                city = readOneFromFile("src\\data\\city_rus.txt");
                break;
            }
            case UKR: {
                city = readOneFromFile("src\\data\\city_ukr.txt");
                break;
            }
        }
    }

    public void printAdress(){
        System.out.println("Индекс:\t\t" + index);
        System.out.println("Город:\t\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
}
