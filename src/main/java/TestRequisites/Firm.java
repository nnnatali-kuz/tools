package TestRequisites;

public class Firm {
    private String name,inn, ogrn, kpp, rs, bik, bank, ks, postindex, city, street, house;

    Firm(String [] req){
        name = req [0];
        inn = req[1];
        ogrn = req [2];
        kpp = req [3];
        rs = req [4];
        bik = req [5];
        bank = req [6];
        ks = req [7];
        postindex = req [8];
        city = req [9];
        street = req [10];
        house = req [11];
    }
    public String getName(){
        return name;
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
}
