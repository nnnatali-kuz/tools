package TestRequisites;


import java.io.IOException;
import java.util.Random;

public class Generate {
    public static void main(String[] args)
            throws IOException
    {
        final Random r = new Random();

        Requisites ur_rus_ooo = new Requisites("src\\data\\UR_RUS_OOO.txt");

        Firm one = new Firm(ur_rus_ooo.getFromFile(r.nextInt(1000)).split("\t"));
        System.out.println(one.getInn());
        System.out.println(one.getOgrn());
        System.out.println(one.getKpp());
        System.out.println(one.getRs());
        System.out.println(one.getBik());
        System.out.println(one.getKs());
    }
}
