package TestRequisites;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Random;

public class GenRusReq {
    public String innRusUr() {
        int n[] = new int[10];
        Random r = new Random();

        for (int i = 0; i < (n.length - 1); i++) {
            n[i] = r.nextInt(10);
        }

        int sum = n[0] * 2 + n[1] * 4 + n[2] * 10 + n[3] * 3 + n[4] * 5 + n[5] * 9 + n[6] * 4 + n[7] * 6 + n[8] * 8;
        n[9] = (sum % 11) == 10 ? 0 : sum % 11;

        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < n.length; i++)
            inn.append(n[i]);
        return inn.toString();
    }

    public String innRusIp() {
        int n[] = new int[12];
        Random r = new Random();
        for (int i = 0; i < (n.length - 2); i++)
            n[i] = r.nextInt(10);

        int sum = n[0] * 7 + n[1] * 2 + n[2] * 4 + n[3] * 10 + n[4] * 3 + n[5] * 5 + n[6] * 9 + n[7] * 4 + n[8] * 6 + n[9] * 8;
        n[10] = (sum % 11) == 10 ? 0 : sum % 11;
        sum = n[0] * 3 + n[1] * 7 + n[2] * 2 + n[3] * 4 + n[4] * 10 + n[5] * 3 + n[6] * 5 + n[7] * 9 + n[8] * 4 + n[9] * 6 + n[10] * 8;
        n[11] = (sum % 11) == 10 ? 0 : sum % 11;

        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < n.length; i++)
            inn.append(n[i]);
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
        for (int i = 0; i < n.length; i++)
            ogrn.append(n[i]);
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
        for (int i = 0; i < n.length; i++)
            ogrn.append(n[i]);
        return ogrn.toString();
    }
}
