package TestRequisites;

import java.util.Random;

public class Adress {
    private String index, city, street, house;
    private Random random = new Random();
    private String[] cityPull = {
            "Москва",
            "Санкт-Петербург",
            "Екатеринбург",
            "Краснодар",
            "Тюмень",
            "Казань",
            "Уфа",
            "Новосибирск",
            "Красноярск",
            "Сочи"
    };
    private String[] streetPull = {
            "Центральная",
            "Молодежная",
            "Школьная",
            "Советская",
            "Садовая",
            "Лесная",
            "Новая",
            "Ленина",
            "Мира",
            "Заречная"
    };

    Adress() {
        index = setIndex();
        city = cityPull[random.nextInt(10)];
        street = streetPull[random.nextInt(10)];
        house = new StringBuilder().append(random.nextInt(200)).toString();
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
        System.out.println("Нас. пункт:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
}
