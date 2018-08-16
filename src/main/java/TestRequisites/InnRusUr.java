package TestRequisites;

import java.io.IOException;

public class InnRusUr {

    public static void main (String [] args)
            throws IOException {

        GenRusReq.Type type = GenRusReq.Type.UR;

        GenRusReq ru = new GenRusReq(type);
        Name n = new Name(Name.Type.UR);

        ru.getReq(type);
        System.out.println(n.name);
    }
}
