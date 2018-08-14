package TestRequisites;

import java.util.Random;

public class GenRusReq {

    private String inn, ogrn, kpp, bik, rs;

    GenRusReq(int t) {
        if (t == 0) {   //юр. лицо
            inn = innRusUr();
            ogrn = ogrnRusUr();
            kpp = kppRus();
        }
        else {
            inn = innRusIp();   //ИП
            ogrn = ogrnRusIp();
        }
        bik = bikRus();
        rs = rsRus(bik);
    }

    public String innRusUr() {
        int n[] = new int[10];
        int m[] = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;
        Random r = new Random();

        for (int i = 0; i < (n.length - 1); i++) {
            n[i] = r.nextInt(10);
            sum += n[i] * m[i];
        }

        n[9] = (sum % 11) == 10 ? 0 : sum % 11;

        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            inn.append(n[i]);
        }
        return inn.toString();
    }

    public String innRusIp() {
        int n[] = new int[12];
        int m1[] = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int m2[] = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum1 = 0, sum2 = 0;
        Random r = new Random();

        for (int i = 0; i < (n.length - 2); i++) {
            n[i] = r.nextInt(10);
            sum1 += n[i] * m1[i];
            sum2 += n[i] * m2[i];
        }

        n[10] = (sum1 % 11) == 10 ? 0 : sum1 % 11;
        sum2 += n[10] * m2[10];
        n[11] = (sum2 % 11) == 10 ? 0 : sum2 % 11;

        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            inn.append(n[i]);
        }
        return inn.toString();
    }

    public String ogrnRusUr() {

        long sum = 0;
        long n[] = new long[13];
        Random r = new Random();

        for (int i = 0; i < (n.length - 1); i++) {
            n[i] = r.nextInt(10);
            sum += n[i] * Math.pow(10, (11 - i));
        }
        if ((sum % 11) > 9)
            n[12] = (sum % 11) - 10;
        else
            n[12] = sum % 11;

        StringBuilder ogrn = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            ogrn.append(n[i]);
        }
        return ogrn.toString();
    }

    public String ogrnRusIp() {

        long sum = 0;
        long n[] = new long[15];
        Random r = new Random();

        for (int i = 0; i < (n.length - 1); i++) {
            n[i] = r.nextInt(10);
            sum += n[i] * Math.pow(10, (13 - i));
        }
        if ((sum % 13) > 9)
            n[14] = (sum % 13) - 10;
        else
            n[14] = sum % 13;

        StringBuilder ogrn = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            ogrn.append(n[i]);
        }
        return ogrn.toString();
    }

    public String kppRus(){
        int n[] = new int[9];
        Random r = new Random();
        StringBuilder kpp = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(10);
            kpp.append(n[i]);
        }
        return kpp.toString();
    }

    public String bikRus() {
        int n[] = new int[9];
        Random r = new Random();
        StringBuilder bik = new StringBuilder("04");    //Для РФ
        for (int i = 2; i < n.length; i++) {
            n[i] = r.nextInt(10);
            bik.append(n[i]);
        }
        return bik.toString();
    }

    public String rsRus(String bik) {
        int n[] = new int[20];
        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(10);
        }

        int sum = Integer.parseInt(String.valueOf(bik.charAt(6))) * 7
                + Integer.parseInt(String.valueOf(bik.charAt(7)))
                + Integer.parseInt(String.valueOf(bik.charAt(8))) * 3;

        n[8] = 0;
        for(int i = 0; i < n.length; i++){
            if ((i % 3) == 0)
                sum += n[i]*7;
            if (((i-1) % 3) == 0)
                sum += n[i];
            if (((i-2) % 3) == 0)
                sum += n[i]*3;
        }

        if ((sum % 100) > 9)
            n[8] = (sum % 100) % 10;
        else
            n[8] = sum % 100;

        n[8] = (n[8] * 3) % 10;
        for (int i = 0; i < n.length; i++) {
            rs.append(n[i]);
        }
        return rs.toString();
    }

    public void getReq(int t) {
        if (t == 0) {   //юр. лицо
            System.out.println("ИНН:\t\t" + inn);
            System.out.println("ОГРН:\t\t" + ogrn);
            System.out.println("КПП:\t\t" + kpp);
            System.out.println("Р/с:\t\t" + rs);
            System.out.println("БИК:\t\t" + bik);
        }
        else {
            System.out.println("ИНН:\t\t" + inn);
            System.out.println("ОГРНИП:\t\t" + ogrn);
            System.out.println("Р/с:\t\t" + rs);
            System.out.println("БИК:\t\t" + bik);
        }
    }
}
