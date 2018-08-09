package TestRequisites;


import java.io.IOException;
import java.util.Random;

public class Generate {
    public static void main(String[] args)
            throws IOException
    {
        int choice=8;
        final Random r = new Random();

        switch (choice)
        {
            case 0: {
                Requisites file = new Requisites("src\\data\\UR_RUS.txt"); //Российские реквизиты для юр. лиц (ООО)
                Firm user = new Firm(file.getFromFile(r.nextInt(1000)).split("\t"));
                user.urRus();
                break;
            }
            case 1: {
                Requisites file = new Requisites("src\\data\\IP_RUS.txt"); //Российские реквизиты для ИП
                Firm user = new Firm(file.getFromFile(r.nextInt(1000)).split("\t"));
                user.ipRus();
                break;
            }
            case 2: {
                Requisites file = new Requisites("src\\data\\F_RUS.txt"); //Российские реквизиты для физ. лиц
                Firm user = new Firm(file.getFromFile(r.nextInt(1000)).split("\t"));
                user.fRusUkr();
                break;
            }
            case 3: {
                Requisites file = new Requisites("src\\data\\UR_UKR.txt"); //Украинские реквизиты для юр. лиц
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.urUkr();
                break;
            }
            case 4: {
                Requisites file = new Requisites("src\\data\\IP_UKR.txt"); //Украинские реквизиты для ИП
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.urUkr();
                break;
            }
            case 5: {
                Requisites file = new Requisites("src\\data\\F_UKR.txt"); //Украинские реквизиты для физ. лиц
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.fRusUkr();
                break;
            }
            case 6: {
                Requisites file = new Requisites("src\\data\\UR_KZT.txt"); //Казахские реквизиты для юр. лиц
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.urKzt();
                break;
            }
            case 7: {
                Requisites file = new Requisites("src\\data\\IP_KZT.txt"); //Казахские реквизиты для ИП
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.ipKzt();
                break;
            }
            case 8: {
                Requisites file = new Requisites("src\\data\\F_KZT.txt"); //Казахские реквизиты для физ. лиц
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.fKzt();
                break;
            }
            case 9: {
                Requisites file = new Requisites("src\\data\\UR_BEL.txt"); //Белорусские реквизиты для юр. лиц
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.urBel();
                break;
            }
            case 10: {
                Requisites file = new Requisites("src\\data\\IP_BEL.txt"); //Белорусские реквизиты для ИП
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.urBel();
                break;
            }
            case 11: {
                Requisites file = new Requisites("src\\data\\F_BEL.txt"); //Белорусские реквизиты для физ. лиц
                Firm user = new Firm(file.getFromFile(r.nextInt(100)).split("\t"));
                user.fBel();
                break;
            }
            /*case 12:
                path = "src\\data\\UR_INT.txt"; //Международные реквизиты для юр. лиц
                break;
            case 13:
                path = "src\\data\\IP_INT.txt"; //Международные реквизиты для ИП
                break;
            case 14:
                path = "src\\data\\F_INT.txt"; //Международные реквизиты для физ. лиц
                break;*/
        }
    }
}
