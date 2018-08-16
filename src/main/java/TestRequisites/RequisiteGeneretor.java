package TestRequisites;

import java.io.IOException;

public class RequisiteGeneretor {
    public static void main (String [] args)
            throws IOException {

        int t=0;

        RusReq payRequisites = new RusReq(t);
        Name name = new Name(t);
        Adress adress = new Adress();

        name.printName(t);
        payRequisites.printReq(t);
        adress.printAdress();
    }
}
