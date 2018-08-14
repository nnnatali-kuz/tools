package TestRequisites;

import java.util.Random;

public class GenRusReq {

    private String inn, ogrn, kpp, bik, rs, ks, phone;
    public enum Type {UR, IP, FIZ}

    GenRusReq(Type t) {
        switch (t) {
            case UR: {               //юр. лицо
                inn = innRusUr();
                ogrn = ogrnRusUr();
                kpp = kppRus();
                break;
            }
            case IP: {               //ИП
                inn = innRusIp();
                ogrn = ogrnRusIp();
                break;
            }
            case FIZ: {               //физ. лицо
                phone = phoneRus();
                break;
            }
        }
        bik = bikRus();
        rs = rsRus(bik);
        ks = ksRus(bik);
    }

    private String innRusUr() {
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

    private String innRusIp() {
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

    private String ogrnRusUr() {

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

    private String ogrnRusIp() {

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

    private String kppRus(){
        int n[] = new int[9];
        Random r = new Random();
        StringBuilder kpp = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(10);
            kpp.append(n[i]);
        }
        return kpp.toString();
    }

    private String bikRus() {
        int n[] = new int[9];
        Random r = new Random();
        StringBuilder bik = new StringBuilder("04");    //Для РФ
        for (int i = 2; i < n.length; i++) {
            n[i] = r.nextInt(10);
            bik.append(n[i]);
        }
        return bik.toString();
    }

    private String rsRus(String bik) {
        int n[] = new int[20];
        int m[] ={7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1};
        Random r = new Random();
        StringBuilder rs = new StringBuilder();

        int sum = Integer.parseInt(String.valueOf(bik.charAt(6))) * 7
                + Integer.parseInt(String.valueOf(bik.charAt(7)))
                + Integer.parseInt(String.valueOf(bik.charAt(8))) * 3;

        for (int i = 0; i < n.length; i++) {
            if (i != 8) {
                n[i] = r.nextInt(10);
            }
            else {
                n[i] = 0;
            }
            sum += n[i] * m[i];
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

    private String ksRus(String bik) {
        int n[] = new int[20];
        int m[] ={7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1};
        Random r = new Random();
        StringBuilder ks = new StringBuilder("301");

        n[17] = Integer.parseInt(String.valueOf(bik.charAt(6)));
        n[18] = Integer.parseInt(String.valueOf(bik.charAt(7)));
        n[19] = Integer.parseInt(String.valueOf(bik.charAt(8)));

        int sum = n[17] * 3 + n[18] * 7 + n[19] + 3*7 + 3
                + Integer.parseInt(String.valueOf(bik.charAt(4)))
                + Integer.parseInt(String.valueOf(bik.charAt(5))) * 3;

        for (int i = 3; i < n.length-3; i++) {
            if (i != 8) {
                n[i] = r.nextInt(10);
            }
            else {
                n[i] = 0;
            }
            sum += n[i] * m[i];
        }

        if ((sum % 100) > 9)
            n[8] = (sum % 100) % 10;
        else
            n[8] = sum % 100;

        n[8] = (n[8] * 3) % 10;
        for (int i = 3; i < n.length; i++) {
            ks.append(n[i]);
        }
        return ks.toString();
    }

    private String phoneRus() {
        int n[] = new int[12];
        Random r = new Random();
        StringBuilder phone = new StringBuilder("+79");
        for (int i = 3; i < n.length; i++) {
            n[i] = r.nextInt(10);
            phone.append(n[i]);
        }
        return phone.toString();
    }

    public void getReq(int t) {
        switch (t) {
            case 0: {                                   //юр. лицо
                System.out.println("ИНН:\t\t" + inn);
                System.out.println("ОГРН:\t\t" + ogrn);
                System.out.println("КПП:\t\t" + kpp);
                System.out.println("Р/с:\t\t" + rs);
                System.out.println("БИК:\t\t" + bik);
                System.out.println("К/с:\t\t" + ks);
                break;
            }
            case 1: {                                   //ИП
                System.out.println("ИНН:\t\t" + inn);
                System.out.println("ОГРНИП:\t\t" + ogrn);
                System.out.println("Р/с:\t\t" + rs);
                System.out.println("БИК:\t\t" + bik);
                System.out.println("К/с:\t\t" + ks);
                break;
            }
            case 2: {                                   //физ. лицо
                System.out.println("Телефон:\t\t" + phone);
                break;
            }
        }
    }
}
