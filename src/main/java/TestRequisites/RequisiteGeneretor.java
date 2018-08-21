package TestRequisites;

import java.io.IOException;

public class RequisiteGeneretor {
    public static void main (String [] args)
            throws IOException {

        Country country = Country.RUS;
        Type type = Type.UR;

        Name name = new Name(country, type);
        Adress adress = new Adress(country);

        name.printName(type);

        switch (country) {
            case RUS: {
                RusReq payRequisites = new RusReq(type);
                payRequisites.printReq(type);
                break;
            }
            case UKR: {
                UkrReq payRequisites = new UkrReq(type);
                payRequisites.printReq(type);
                break;
            }
        }

        adress.printAdress();
    }
}
