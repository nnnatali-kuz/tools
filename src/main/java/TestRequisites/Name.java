package TestRequisites;

import java.io.IOException;
import java.util.Random;

public class Name extends ReadFromFile {
    private String name, phone;
    private String[] typeRus = {"ООО", "ОАО", "ЗАО", "АООТ", "АОЗТ"};
    private String[] typeUkr = {"ОАО", "АОЗТ", "ПАО", "ЧАО"};
    private String[] typeKzt = {"АО", "ТОО"};
    private String[] typeBel = {"ООО", "ОАО", "ЗАО", "ОДО"};

    Name(Type type)
            throws IOException {
        Random random = new Random();
        switch (type) {
            case UR_RUS: {
                name = typeRus[random.nextInt(typeRus.length)] + " " + readOneFromFile("src\\data\\company_rus.txt");
                break;
            }
            case IP_RUS: {
                name = "ИП" + " " + readOneFromFile("src\\data\\name_rus.txt");
                break;
            }
            case FIZ_RUS: {
                name = readOneFromFile("src\\data\\name_rus.txt");
                phone = setPhone();
                break;
            }
        }
    }

    private String setPhone() {
        int n[] = new int[12];
        Random random = new Random();
        StringBuilder phone = new StringBuilder("+79");     // Первые цифры номера телефона
        for (int i = 3; i < n.length; i++) {
            n[i] = random.nextInt(10);
            phone.append(n[i]);
        }
        return phone.toString();
    }

    public void printName(Type type) {
        switch (type) {
            case UR_RUS: {                                   //юр. лицо
                System.out.println("Название:\t" + name);
                break;
            }
            case IP_RUS: {
                System.out.println("Название:\t" + name);
                break;
            }
            case FIZ_RUS: {
                System.out.println("ФИО:\t\t" + name);
                System.out.println("Телефон:\t" + phone);
                break;
            }
        }
    }
}