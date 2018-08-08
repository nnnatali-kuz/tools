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
        System.out.println("Название:\t" + one.getName());
        System.out.println("ИНН:\t\t" + one.getInn());
        System.out.println("ОГРН:\t\t" + one.getOgrn());
        System.out.println("КПП:\t\t" + one.getKpp());
        System.out.println("Р/с:\t\t" + one.getRs());
        System.out.println("БИК:\t\t" + one.getBik());
        System.out.println("Банк:\t\t" + one.getBank());
        System.out.println("К/с:\t\t" + one.getKs());
        System.out.println("Индекс:\t\t" + one.getPostindex());
        System.out.println("Нас. п.:\t" + one.getCity());
        System.out.println("Улица:\t\t" + one.getStreet());
        System.out.println("Дом:\t\t" + one.getHouse());
    }
}
