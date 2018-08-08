package TestRequisites;


import java.io.IOException;
import java.util.Random;

public class Generate {
    public static void main(String[] args)
            throws IOException
    {
        int choice=1;
        String path;
        final Random r = new Random();

        switch (choice) {
            case 0:
                path = "src\\data\\UR_RUS.txt"; //Российские реквизиты для юр. лиц (ООО)
                break;
            case 1:
                path = "src\\data\\IP_RUS.txt"; //Российские реквизиты для ИП
                break;
            case 2:
                path = "src\\data\\F_RUS.txt"; //Российские реквизиты для физ. лиц
                break;
            case 3:
                path = "src\\data\\UR_UKR.txt"; //Украинские реквизиты для юр. лиц
                break;
            case 4:
                path = "src\\data\\IP_UKR.txt"; //Украинские реквизиты для ИП
                break;
            case 5:
                path = "src\\data\\F_UKR.txt"; //Украинские реквизиты для физ. лиц
                break;
            case 6:
                path = "src\\data\\UR_KZT.txt"; //Казахские реквизиты для юр. лиц
                break;
            case 7:
                path = "src\\data\\IP_KZT.txt"; //Казахские реквизиты для ИП
                break;
            case 8:
                path = "src\\data\\F_KZT.txt"; //Казахские реквизиты для физ. лиц
                break;
            case 9:
                path = "src\\data\\UR_BEL.txt"; //Белорусские реквизиты для юр. лиц
                break;
            case 10:
                path = "src\\data\\IP_BEL.txt"; //Белорусские реквизиты для ИП
                break;
            case 11:
                path = "src\\data\\F_BEL.txt"; //Белорусские реквизиты для физ. лиц
                break;
            case 12:
                path = "src\\data\\UR_INT.txt"; //Международные реквизиты для юр. лиц
                break;
            case 13:
                path = "src\\data\\IP_INT.txt"; //Международные реквизиты для ИП
                break;
            case 14:
                path = "src\\data\\F_INT.txt"; //Международные реквизиты для физ. лиц
                break;
            default:
                path = "src\\data\\UR_RUS.txt"; //Российские реквизиты для юр. лиц (ООО)
                break;
        }

        Requisites file = new Requisites(path);
        Firm one = new Firm(file.getFromFile(r.nextInt(1000)).split("\t"));

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
