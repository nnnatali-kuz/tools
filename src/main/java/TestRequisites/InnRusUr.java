package TestRequisites;

public class InnRusUr {
    public static void main (String [] args) {

        GenRusReq ru = new GenRusReq();
        String bik = ru.bikRus();
        //System.out.println("ИНН ИП: " + ru.innRusIp());
        //System.out.println("ИНН юр. лица: " + ru.innRusUr());
        //System.out.println("ОГРН юр. лица: " + ru.ogrnRusUr());
        //System.out.println("ОГРНИП: " + ru.ogrnRusIp());
        //System.out.println("КПП: " + ru.kppRus());
        System.out.println("БИК: " + bik);
        System.out.println("Р/с: " + ru.rsRus(bik));
    }
}
