package TestRequisites;

public class ReqUkr extends Helper {
    private String inn, rs, bik, bank;

    public String generateInn(){
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
}
