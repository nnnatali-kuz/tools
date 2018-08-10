package TestRequisites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Firm {
    private String filePath;
    private String name, phone, inn, ogrn, kpp, rs, bik, bank, ks, postindex, city, street, house;

    Firm(String p)
    throws IOException {

        int i = 0;
        String buffer;
        String[] requisite = new String[100];

        filePath = p;

        BufferedReader file = new BufferedReader(new FileReader(filePath));

        while((buffer = file.readLine())!= null){
            requisite[i] = buffer;
            i++;
        }
        file.close();

        final Random r = new Random();
        int n = r.nextInt((requisite.length-1));

        name = requisite[n].split("\t")[0];
        phone = requisite[n].split("\t") [1];
        inn = requisite[n].split("\t")[2];
        ogrn = requisite[n].split("\t") [3];
        kpp = requisite[n].split("\t") [4];
        rs = requisite[n].split("\t") [5];
        bik = requisite[n].split("\t") [6];
        bank = requisite[n].split("\t") [7];
        ks = requisite[n].split("\t") [8];
        postindex = requisite[n].split("\t") [9];
        city = requisite[n].split("\t") [10];
        street = requisite[n].split("\t") [11];
        house = requisite[n].split("\t") [12];
    }
    public void urRus(){
        System.out.println("Название:\t" + name);
        System.out.println("ИНН:\t\t" + inn);
        System.out.println("ОГРН:\t\t" + ogrn);
        System.out.println("КПП:\t\t" + kpp);
        System.out.println("Р/с:\t\t" + rs);
        System.out.println("БИК:\t\t" + bik);
        System.out.println("Банк:\t\t" + bank);
        System.out.println("К/с:\t\t" + ks);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void ipRus(){
        System.out.println("Название:\t" + name);
        System.out.println("ИНН:\t\t" + inn);
        System.out.println("ОГРНИП:\t\t" + ogrn);
        System.out.println("Р/с:\t\t" + rs);
        System.out.println("БИК:\t\t" + bik);
        System.out.println("Банк:\t\t" + bank);
        System.out.println("К/с:\t\t" + ks);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void fRusUkr() {
        System.out.println("ФИО:\t\t" + name);
        System.out.println("Телефон:\t" + phone);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void urUkr(){
        System.out.println("Название:\t" + name);
        System.out.println("ЕДРПОУ:\t\t" + inn);
        System.out.println("Р/с:\t\t" + rs);
        System.out.println("МФО:\t\t" + bik);
        System.out.println("Банк:\t\t" + bank);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void urKzt(){
        System.out.println("Название:\t" + name);
        System.out.println("БИН:\t\t" + inn);
        System.out.println("ИИК:\t\t" + rs);
        System.out.println("БИК:\t\t" + bik);
        System.out.println("Банк:\t\t" + bank);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void ipKzt(){
        System.out.println("Название:\t" + name);
        System.out.println("ИИН:\t\t" + inn);
        System.out.println("ИИК:\t\t" + rs);
        System.out.println("БИК:\t\t" + bik);
        System.out.println("Банк:\t\t" + bank);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void fKzt(){
        System.out.println("ФИО:\t\t" + name);
        System.out.println("Телефон:\t" + phone);
        System.out.println("ИИН:\t\t" + inn);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void urBel() {
        System.out.println("Название:\t" + name);
        System.out.println("УНП:\t\t" + inn);
        System.out.println("Р/с:\t\t" + rs);
        System.out.println("Код:\t\t" + bik);
        System.out.println("Банк:\t\t" + bank);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
    public void fBel() {
        System.out.println("ФИО:\t\t" + name);
        System.out.println("Телефон:\t" + phone);
        System.out.println("УНП:\t\t" + inn);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }


    /*public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getInn(){
        return inn;
    }
    public String getOgrn(){
        return ogrn;
    }
    public String getKpp(){
        return kpp;
    }
    public String getRs(){
        return rs;
    }
    public String getBik(){
        return bik;
    }
    public String getBank(){
        return bank;
    }
    public String getKs(){
        return ks;
    }
    public String getPostindex(){
        return postindex;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getHouse() {
        return house;
    }*/
}

