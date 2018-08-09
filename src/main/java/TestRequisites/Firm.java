package TestRequisites;

public class Firm {
    private String name,phone, inn, ogrn, kpp, rs, bik, bank, ks, postindex, city, street, house;

    Firm(String [] req){
        name = req [0];
        phone = req [1];
        inn = req[2];
        ogrn = req [3];
        kpp = req [4];
        rs = req [5];
        bik = req [6];
        bank = req [7];
        ks = req [8];
        postindex = req [9];
        city = req [10];
        street = req [11];
        house = req [12];
    }
    public String getName(){
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
        System.out.println("Телефон:\t\t" + phone);
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
        System.out.println("Телефон:\t\t" + phone);
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
        System.out.println("Телефон:\t\t" + phone);
        System.out.println("УНП:\t\t" + inn);
        System.out.println("Индекс:\t\t" + postindex);
        System.out.println("Нас. п.:\t" + city);
        System.out.println("Улица:\t\t" + street);
        System.out.println("Дом:\t\t" + house);
    }
}

