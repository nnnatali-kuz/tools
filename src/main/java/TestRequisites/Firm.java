package TestRequisites;

public class Firm {
    private String inn, ogrn, kpp, rs, bik, ks;

    Firm(String [] req){
        inn = req[0];
        ogrn = req [1];
        kpp = req [2];
        rs = req [3];
        bik = req [4];
        ks = req [5];
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
    public String getKs(){
        return ks;
    }
}
