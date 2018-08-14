package TestRequisites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Name {
    final public String name;
    private String[] typeRus = {"ООО", "ОАО", "ЗАО", "АООТ", "АОЗТ"};
    private String[] typeUkr = {"ОАО", "АОЗТ", "ПАО", "ЧАО"};
    private String[] typeKzt = {"АО", "ТОО"};
    private String[] typeBel = {"ООО", "ОАО", "ЗАО", "ОДО"};

    Name(int type)
            throws IOException{
        switch (type) {
            case 0: {                               //юр. лицо рус.
                name = getTypeRus() + " " + getCompany();
                break;
            }
            case 1: {
                name = "ИП" + " " + getName();       //ИП рус.
                break;
            }
            case 2: {                               //физ. рус.
                name = getName();
                break;
            }
            default: {
                name = null;
                break;
            }
        }
    }

    private String getName()
            throws IOException {
        int i=0;
        String buffer;
        String [] n = new String[100];
        Random r = new Random();

        BufferedReader file = new BufferedReader(new FileReader("src\\data\\name.txt"));

        while((buffer = file.readLine())!= null){
            n[i] = buffer;
            i++;
        }
        file.close();
        return n[r.nextInt(100)];
    }

    private String getCompany()
            throws IOException {
        int i=0;
        String buffer;
        String [] n = new String[100];
        Random r = new Random();

        BufferedReader file = new BufferedReader(new FileReader("src\\data\\company.txt"));

        while((buffer = file.readLine())!= null){
            n[i] = buffer;
            i++;
        }
        file.close();
        return n[r.nextInt(100)];
    }

    private String getTypeRus(){
        Random r = new Random();
        return typeRus[r.nextInt(5)];
    }

    private String getTypeUkr(){
        Random r = new Random();
        return typeUkr[r.nextInt(4)];
    }

    private String getTypeKzt(){
        Random r = new Random();
        return typeKzt[r.nextInt(2)];
    }

    private String getTypeBel(){
        Random r = new Random();
        return typeBel[r.nextInt(4)];
    }
}
