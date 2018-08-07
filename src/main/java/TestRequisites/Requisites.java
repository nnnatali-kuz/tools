package TestRequisites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Requisites {

    private String filePath;

    Requisites(String p){
        filePath = p;
    }

    public String getFromFile(int n)
    throws IOException
    {
        int i = 0;
        String buffer;
        String[] requisite = new String[1000];

        BufferedReader file = new BufferedReader(new FileReader(filePath));

        while((buffer = file.readLine())!= null){
            requisite[i] = buffer;
            i++;
        }
        file.close();

        return requisite[n];
    }
}
