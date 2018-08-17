package TestRequisites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Random;

public abstract class ReadFromFile {
    public Random random = new Random();

    public String readOneFromFile(String path)
            throws IOException {
        int i = 0;
        String buffer;

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

    public String generateRandomStringNumber(int size) {
        int buffer[] = new int[size];
        StringBuilder stringNumber = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = random.nextInt(10);
            stringNumber.append(buffer[i]);
        }
        return stringNumber.toString();
    }
}
