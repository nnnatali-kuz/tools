package TestRequisites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Name {
    private String name, phone;
    private String[] typeRus = {"ООО", "ОАО", "ЗАО", "АООТ", "АОЗТ"};
    private String[] typeUkr = {"ОАО", "АОЗТ", "ПАО", "ЧАО"};
    private String[] typeKzt = {"АО", "ТОО"};
    private String[] typeBel = {"ООО", "ОАО", "ЗАО", "ОДО"};

    Name(int type)
            throws IOException {
        Random random = new Random();
        switch (type) {
            case 0: {                               //юр. лицо рус.
                name = typeRus[random.nextInt(5)] + " " + setName("src\\data\\company.txt");
                break;
            }
            case 1: {
                name = "ИП" + " " + setName("src\\data\\name.txt");       //ИП рус.
                break;
            }
            case 2: {                               //физ. рус.
                name = setName("src\\data\\name.txt");
                phone = setPhone();
                break;
            }
        }
    }

    private String setName(String path)
            throws IOException {
        int i = 0;
        String buffer;
        String[] nameArray = new String[100];
        Random random = new Random();

        BufferedReader file = new BufferedReader(new FileReader(path));

        while ((buffer = file.readLine()) != null) {
            nameArray[i] = buffer;
            i++;
        }

        file.close();

        return nameArray[random.nextInt(100)];
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

    public void printName(int type) {
        switch (type) {
            case 0: {                                   //юр. лицо
                System.out.println("Название:\t" + name);
                break;
            }
            case 1: {
                System.out.println("Название:\t" + name);
                break;
            }
            case 2: {
                System.out.println("ФИО:\t\t" + name);
                System.out.println("Телефон:\t" + phone);
                break;
            }
        }
    }
}