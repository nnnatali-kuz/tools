package TestRequisites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Random;

public abstract class ReadFromFile {
    public String readOneFromFile(String path)
            throws IOException {
        int i = 0;
        String buffer;
        Random random = new Random();

        FileReader fileReader = new FileReader(path);
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

        int size = 0;

        while (lineNumberReader.readLine() != null) {
            size++;
        }

        lineNumberReader.close();

        String[] bufferArray = new String[size];
        BufferedReader file = new BufferedReader(new FileReader(path));

        while ((buffer = file.readLine()) != null) {
            bufferArray[i] = buffer;
            i++;
        }

        file.close();

        return bufferArray[random.nextInt(size)];
    }
}
