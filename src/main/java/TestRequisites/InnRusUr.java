package TestRequisites;

import java.io.IOException;

public class InnRusUr {
    public static void main (String [] args)
            throws IOException {

        int type = 2;
        GenRusReq ru = new GenRusReq(type);
        Name n = new Name(type);
        ru.getReq(type);
        System.out.println(n.name);
    }
}
