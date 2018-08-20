package TestRequisites;

import java.io.IOException;

public class Name extends Helper {
    private String name, phone;
    private String[] typeRus = {"ООО", "ОАО", "ЗАО", "АООТ", "АОЗТ"};
    private String[] typeUkr = {"ОАО", "АОЗТ", "ПАО", "ЧАО"};
    private String[] typeKzt = {"АО", "ТОО"};
    private String[] typeBel = {"ООО", "ОАО", "ЗАО", "ОДО"};

    Name( Country country, Type type)
            throws IOException {
        switch (country) {
            case RUS: {
                switch (type) {
                    case UR: {
                        name = typeRus[random.nextInt(typeRus.length)] + " " + readOneFromFile("src\\data\\company.txt");
                        break;
                    }
                    case IP: {
                        name = "ИП" + " " + readOneFromFile("src\\data\\name_rus.txt");
                        break;
                    }
                    case FIZ: {
                        name = readOneFromFile("src\\data\\name_rus.txt");
                        phone = "+79" + generateRandomStringNumber(9);
                        break;
                    }
                }
                break;
            }
            case UKR: {
                switch (type) {
                    case UR: {
                        name = typeUkr[random.nextInt(typeUkr.length)] + " " + readOneFromFile("src\\data\\company.txt");
                        break;
                    }
                    case IP: {
                        name = "ИП" + " " + readOneFromFile("src\\data\\name_ukr.txt");
                        break;
                    }
                    case FIZ: {
                        name = readOneFromFile("src\\data\\name_ukr.txt");
                        phone = "+380" + generateRandomStringNumber(9);
                        break;
                    }
                }
                break;
            }
        }
    }

    public void printName(Type type) {
        switch (type) {
            case UR: {
                System.out.println("Название:\t" + name);
                break;
            }
            case IP: {
                System.out.println("Название:\t" + name);
                break;
            }
            case FIZ: {
                System.out.println("ФИО:\t\t" + name);
                System.out.println("Телефон:\t" + phone);
                break;
            }
        }
    }
}