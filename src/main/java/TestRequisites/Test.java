package TestRequisites;

public class Test {
    public static void main(String args[]) {
        int buffer [] = {2,6,0,0,5,9,6,2,4,8,2,2,7,6};
        String bik = "334851";
        int maskBik[] = {1, 3, 7, 1, 3};
        int mask[] = {3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7};
        int sum = 0;

//        buffer[0] = 2;
//        buffer[1] = 6;
//        buffer[2] = buffer[3] = 0;


        for (int i = 0; i < bik.length() - 1; i++) {
            sum += ((Integer.parseInt(String.valueOf(bik.charAt(i))) * maskBik[i]) % 10);
        }

        sum += buffer[0] * mask [0] +
                buffer[1] * mask [1] +
                buffer[2] * mask [2] +
                buffer[3] * mask [3];

        for (int i = 5; i < buffer.length; i++) {
            sum += (buffer[i] * mask[i]) % 10;
        }

        buffer[4] = (((sum + 14) % 10) * 7) % 10;

        System.out.println(buffer[4]);
    }
}
