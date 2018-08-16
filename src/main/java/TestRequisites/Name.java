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
    public enum Type {UR, IP, FIZ}

    Name(Type type)
            throws IOException{
        switch (type) {
            case UR: {                               //юр. лицо рус.
                name = setTypeRus() + " " + setCompany();
                break;
            }
            case IP: {
                name = "ИП" + " " + setName();       //ИП рус.
                break;
            }
            case FIZ: {                               //физ. рус.
                name = setName();
                break;
            }
            default: {
                name = null;
                break;
            }
        }
    }

    private String setName()
            throws IOException {
        int i=0;
        String buffer;
        String [] n = new String[100];
        Random r = new Random();

        BufferedReader file = new BufferedReader(new FileReader("src\\data\\name.txt"));

        while((buffer = file.readLine())!= null) {
            n[i] = buffer;
            i++;
        }

        file.close();

        return n[r.nextInt(100)];
    }

    private String setCompany()
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

    private String setTypeRus(){
        Random r = new Random();
        return typeRus[r.nextInt(5)];
    }

    private String setTypeUkr(){
        Random r = new Random();
        return typeUkr[r.nextInt(4)];
    }

    private String setTypeKzt(){
        Random r = new Random();
        return typeKzt[r.nextInt(2)];
    }

    private String setTypeBel(){
        Random r = new Random();
        return typeBel[r.nextInt(4)];
    }
}
