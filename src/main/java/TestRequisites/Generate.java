package TestRequisites;


import java.io.IOException;

public class Generate {
    public static void main(String[] args)
            throws IOException
    {
        int choice=8;

        switch (choice)
        {
            case 0: {
                Firm user = new Firm("src\\data\\UR_RUS.txt"); //Российские реквизиты для юр. лиц (ООО)
                user.urRus();
                break;
            }
            case 1: {
                Firm user = new Firm("src\\data\\IP_RUS.txt"); //Российские реквизиты для ИП
                user.ipRus();
                break;
            }
            case 2: {
                Firm user = new Firm("src\\data\\F_RUS.txt"); //Российские реквизиты для физ. лиц
                user.fRusUkr();
                break;
            }
            case 3: {
                Firm user = new Firm("src\\data\\UR_UKR.txt"); //Украинские реквизиты для юр. лиц
                user.urUkr();
                break;
            }
            case 4: {
                Firm user = new Firm("src\\data\\IP_UKR.txt"); //Украинские реквизиты для ИП
                user.urUkr();
                break;
            }
            case 5: {
                Firm user = new Firm("src\\data\\F_UKR.txt"); //Украинские реквизиты для физ. лиц
                user.fRusUkr();
                break;
            }
            case 6: {
                Firm user = new Firm("src\\data\\UR_KZT.txt"); //Казахские реквизиты для юр. лиц
                user.urKzt();
                break;
            }
            case 7: {
                Firm user = new Firm("src\\data\\IP_KZT.txt"); //Казахские реквизиты для ИП
                user.ipKzt();
                break;
            }
            case 8: {
                Firm user = new Firm("src\\data\\F_KZT.txt"); //Казахские реквизиты для физ. лиц
                user.fKzt();
                break;
            }
            case 9: {
                Firm user = new Firm("src\\data\\UR_BEL.txt"); //Белорусские реквизиты для юр. лиц
                user.urBel();
                break;
            }
            case 10: {
                Firm user = new Firm("src\\data\\IP_BEL.txt"); //Белорусские реквизиты для ИП
                user.urBel();
                break;
            }
            case 11: {
                Firm user = new Firm("src\\data\\F_BEL.txt"); //Белорусские реквизиты для физ. лиц
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
