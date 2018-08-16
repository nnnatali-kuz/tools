package TestRequisites;

import java.io.IOException;

public class RequisiteGeneretor {
    enum Type {RUS_UR, RUS_IP, RUS_FIZ}
    public static void main (String [] args)
            throws IOException {

        Type type = Type.RUS_IP;
        GenRusReq.Type req;
        Name.Type name;

        switch (type) {
            case RUS_UR: {
                req = GenRusReq.Type.UR;
                name = Name.Type.UR;
                break;
            }
            case RUS_IP: {
                req = GenRusReq.Type.IP;
                name = Name.Type.IP;
                break;
            }
            case RUS_FIZ: {
                req = GenRusReq.Type.FIZ;
                name = Name.Type.FIZ;
                break;
            }
            default: {
                req = GenRusReq.Type.UR;
                name = Name.Type.UR;
                break;
            }
        }

        GenRusReq ru = new GenRusReq(req);
        Name n = new Name(name);

        System.out.println("Название:\t" + n.name);
        ru.getReq(req);
    }
}
