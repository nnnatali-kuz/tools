package TestRequisites;


import java.io.IOException;

public class Generate {
    public static void main(String[] args)
            throws IOException
    {
       Requisites ur_rus_ooo = new Requisites("src\\data\\UR_RUS_OOO.txt");

       Firm one = new Firm(ur_rus_ooo.getFromFile(0).split("\t"));
       System.out.println(one.getKs());
    }
}
