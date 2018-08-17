package TestRequisites;

import java.io.IOException;

public class Name extends ReadFromFile {
    private String name, phone;
    private String[] typeRus = {"ООО", "ОАО", "ЗАО", "АООТ", "АОЗТ"};
    private String[] typeUkr = {"ОАО", "АОЗТ", "ПАО", "ЧАО"};
    private String[] typeKzt = {"АО", "ТОО"};
    private String[] typeBel = {"ООО", "ОАО", "ЗАО", "ОДО"};

    Name(Type type)
            throws IOException {
        switch (type) {
            case RUS_UR: {
                name = typeRus[random.nextInt(typeRus.length)] + " " + readOneFromFile("src\\data\\company_rus.txt");
                break;
            }
            case RUS_IP: {
                name = "ИП" + " " + readOneFromFile("src\\data\\name_rus.txt");
                break;
            }
            case RUS_FIZ: {
                name = readOneFromFile("src\\data\\name_rus.txt");
                phone = "+79" + generateRandomStringNumber(9);
                break;
            }
        }
    }

    public void printName(Type type) {
        switch (type) {
            case RUS_UR: {                                   //юр. лицо
                System.out.println("Название:\t" + name);
                break;
            }
            case RUS_IP: {
                System.out.println("Название:\t" + name);
                break;
            }
            case RUS_FIZ: {
                System.out.println("ФИО:\t\t" + name);
                System.out.println("Телефон:\t" + phone);
                break;
            }
        }
    }
}