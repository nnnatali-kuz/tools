package TestRequisites;

import java.io.IOException;

public class RequisiteGeneretor {
    public static void main (String [] args)
            throws IOException {

        Type type = Type.RUS_FIZ;

        RusReq payRequisites = new RusReq(type);
        Name name = new Name(type);
        Adress adress = new Adress();

        name.printName(type);
        payRequisites.printReq(type);
        adress.printAdress();
    }
}
