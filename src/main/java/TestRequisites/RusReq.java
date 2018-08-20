package TestRequisites;

import java.io.IOException;

public class RusReq extends Helper {

    private String inn, ogrn, kpp, bik, rs, ks, bank;

    RusReq(Type type)
            throws IOException {
        switch (type) {
            case UR: {
                inn = generateInnRusUr();
                ogrn = generateOgrnRusUr();
                kpp = generateRandomStringNumber(9);
                bik = "04" + generateRandomStringNumber(7);
                rs = generateRsRus(bik);
                ks = generateKsRus(bik);
                bank = readOneFromFile("src\\data\\bank_rus.txt");
                break;
            }
            case IP: {
                inn = generateInnRusIp();
                ogrn = generateOgrnRusIp();
                bik = "04" + generateRandomStringNumber(7);
                rs = generateRsRus(bik);
                ks = generateKsRus(bik);
                bank = readOneFromFile("src\\data\\bank_rus.txt");
                break;
            }
        }
    }

    private String generateInnRusUr() {
        int buffer[] = new int[10];
        int mask[] = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < (buffer.length - 1); i++) {
            buffer[i] = random.nextInt(10);
            sum += buffer[i] * mask[i];
        }

        buffer[9] = (sum % 11) == 10 ? 0 : sum % 11;

        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            inn.append(buffer[i]);
        }
        return inn.toString();
    }

    private String generateInnRusIp() {
        int buffer[] = new int[12];
        int mask1[] = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int mask2[] = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < (buffer.length - 2); i++) {
            buffer[i] = random.nextInt(10);
            sum1 += buffer[i] * mask1[i];
            sum2 += buffer[i] * mask2[i];
        }

        buffer[10] = (sum1 % 11) == 10 ? 0 : sum1 % 11;
        sum2 += buffer[10] * mask2[10];
        buffer[11] = (sum2 % 11) == 10 ? 0 : sum2 % 11;

        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            inn.append(buffer[i]);
        }
        return inn.toString();
    }

    private String generateOgrnRusUr() {

        long sum = 0;
        long buffer[] = new long[13];

        for (int i = 0; i < (buffer.length - 1); i++) {
            buffer[i] = random.nextInt(10);
            sum += buffer[i] * Math.pow(10, (11 - i));
        }
        if ((sum % 11) > 9)
            buffer[12] = (sum % 11) - 10;
        else
            buffer[12] = sum % 11;

        StringBuilder ogrn = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            ogrn.append(buffer[i]);
        }
        return ogrn.toString();
    }

    private String generateOgrnRusIp() {

        long sum = 0;
        long buffer[] = new long[15];

        for (int i = 0; i < (buffer.length - 1); i++) {
            buffer[i] = random.nextInt(10);
            sum += buffer[i] * Math.pow(10, (13 - i));
        }
        if ((sum % 13) > 9)
            buffer[14] = (sum % 13) - 10;
        else
            buffer[14] = sum % 13;

        StringBuilder ogrn = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            ogrn.append(buffer[i]);
        }
        return ogrn.toString();
    }

    private String generateRsRus(String bik) {
        int buffer[] = new int[20];
        int mask[] ={7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1};
        StringBuilder rs = new StringBuilder();

        int sum = Integer.parseInt(String.valueOf(bik.charAt(6))) * 7
                + Integer.parseInt(String.valueOf(bik.charAt(7)))
                + Integer.parseInt(String.valueOf(bik.charAt(8))) * 3;

        for (int i = 0; i < buffer.length; i++) {
            if (i != 8) {
                buffer[i] = random.nextInt(10);
            }
            else {
                buffer[i] = 0;
            }
            sum += buffer[i] * mask[i];
        }

        if ((sum % 100) > 9)
            buffer[8] = (sum % 100) % 10;
        else
            buffer[8] = sum % 100;

        buffer[8] = (buffer[8] * 3) % 10;
        for (int i = 0; i < buffer.length; i++) {
            rs.append(buffer[i]);
        }
        return rs.toString();
    }

    private String generateKsRus(String bik) {
        int buffer[] = new int[20];
        int mask[] ={7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1};
        StringBuilder ks = new StringBuilder("301");        // Первые цифры К/с

        buffer[17] = Integer.parseInt(String.valueOf(bik.charAt(6)));
        buffer[18] = Integer.parseInt(String.valueOf(bik.charAt(7)));
        buffer[19] = Integer.parseInt(String.valueOf(bik.charAt(8)));

        int sum = buffer[17] * 3 + buffer[18] * 7 + buffer[19] + 3*7 + 3
                + Integer.parseInt(String.valueOf(bik.charAt(4)))
                + Integer.parseInt(String.valueOf(bik.charAt(5))) * 3;

        for (int i = 3; i < buffer.length-3; i++) {
            if (i != 8) {
                buffer[i] = random.nextInt(10);
            }
            else {
                buffer[i] = 0;
            }
            sum += buffer[i] * mask[i];
        }

        if ((sum % 100) > 9)
            buffer[8] = (sum % 100) % 10;
        else
            buffer[8] = sum % 100;

        buffer[8] = (buffer[8] * 3) % 10;
        for (int i = 3; i < buffer.length; i++) {
            ks.append(buffer[i]);
        }
        return ks.toString();
    }

    public void printReq(Type type) {
        switch (type) {
            case UR: {                                   //юр. лицо
                System.out.println("ИНН:\t\t" + inn);
                System.out.println("ОГРН:\t\t" + ogrn);
                System.out.println("КПП:\t\t" + kpp);
                System.out.println("Р/с:\t\t" + rs);
                System.out.println("БИК:\t\t" + bik);
                System.out.println("Банк:\t\t" + bank);
                System.out.println("К/с:\t\t" + ks);
                break;
            }
            case IP: {                                   //ИП
                System.out.println("ИНН:\t\t" + inn);
                System.out.println("ОГРНИП:\t\t" + ogrn);
                System.out.println("Р/с:\t\t" + rs);
                System.out.println("БИК:\t\t" + bik);
                System.out.println("Банк:\t\t" + bank);
                System.out.println("К/с:\t\t" + ks);
                break;
            }
        }
    }
}
