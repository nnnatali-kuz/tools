package TestRequisites;

import java.io.IOException;

public class RequisiteGeneretor {
    public static void main (String [] args)
            throws IOException {

        int t=1;

        RusReq payRequisites = new RusReq(t);
        Name name = new Name(t);

        name.printName(t);
        payRequisites.printReq(t);
    }
}
