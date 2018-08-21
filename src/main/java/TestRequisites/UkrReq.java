package TestRequisites;

import java.io.IOException;

public class UkrReq extends Helper {
    private String inn, rs, bik, bank;

    UkrReq(Type type)
    throws IOException {
        if (type != Type.FIZ) {
            inn = generateInn();
            bank = readOneFromFile("src\\data\\bank_ukr.txt");
            bik = generateBik();
            rs = generateRs(bik);
        }
    }

    private String generateInn(){
        long sum = 0;
        long buffer[] = new long[8];
        int mask1 [] = {7, 1, 2, 3, 4, 5, 6};
        int mask2 [] = {1, 2, 3, 4, 5, 6, 7};
        int mask3 [] = {9, 3, 4, 5, 6, 7, 8};
        int mask4 [] = {3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < (buffer.length - 1); i++) {
            buffer[i] = random.nextInt(10);
            sum += buffer[i] * Math.pow(10, (7 - i));
        }

        if(sum > 30_000_000 & sum < 60_000_000) {
            sum = 0;
            for (int i = 0; i < (buffer.length) - 1; i++) {
                sum += buffer[i] * mask1[i];
            }
            if ((sum % 11) < 10){
                buffer[7] = sum % 11;
            }
            else {
                sum = 0;
        for (int i = 0; i < (buffer.length) - 1; i++) {
            sum += buffer[i] * mask3[i];
        }
        buffer [7] = sum % 11;
    }
}
        else {
                sum = 0;
                for (int i = 0; i < (buffer.length) - 1; i++) {
        sum += buffer[i] * mask2[i];
        }
        if ((sum % 11) < 10){
        buffer[7] = sum % 11;
        }
        else {
        sum = 0;
        for (int i = 0; i < (buffer.length) - 1; i++) {
        sum += buffer[i] * mask4[i];
        }
        buffer [7] = sum % 11;
        }
        }
        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
        inn.append(buffer[i]);
        }
        return inn.toString();
    }

    private String generateBik(){
        int buffer[] = new int[6];
        int mask[] = {1, 3, 7, 1, 3, 7};
        int sum = 0;

        for (int i = 0; i < (buffer.length - 1); i++) {
            buffer[i] = random.nextInt(10);
            sum += buffer[i] * mask[i];
        }

        buffer[5] = ((sum % 10) * 7) % 10;
        StringBuilder inn = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            inn.append(buffer[i]);
        }
        return inn.toString();
    }

    private String generateRs(String bik){
        int buffer [] = new int[14];
        int maskBik[] = {1, 3, 7, 1, 3};
        int mask[] = {3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7};
        int sum = 0;

        buffer[0] = 2;
        buffer[1] = 6;
        buffer[2] = buffer[3] = 0;

        StringBuilder rs = new StringBuilder();

        for (int i = 0; i < bik.length() - 1; i++) {
            sum += ((Integer.parseInt(String.valueOf(bik.charAt(i))) * maskBik[i]) % 10);
        }

        for (int i = 0; i < 4; i++) {
            sum += (buffer[i] * mask[i]) % 10;
        }

        for (int i = 5; i < buffer.length; i++) {
            buffer[i] = random.nextInt(10);
            sum += (buffer[i] * mask[i]) % 10;
        }

        buffer[4] = (((sum + 14) % 10) * 7) % 10;

        for (int i = 0; i < buffer.length; i++) {
            rs.append(buffer[i]);
        }
        return rs.toString();
    }

    public void printReq(Type type) {

        if (type != Type.FIZ) {
            System.out.println("ЕДРПОУ:\t\t" + inn);
            System.out.println("Р/с:\t\t" + rs);
            System.out.println("МФО:\t\t" + bik);
            System.out.println("Банк:\t\t" + bank);
        }
    }
}

