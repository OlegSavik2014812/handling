package by.epam.info_reader;

import by.epam.exception.InfoHandlingException;
import by.epam.util.FileUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    public static String readText(String pathOfFile) throws InfoHandlingException, IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FileUtils.openFile(pathOfFile)));
            StringBuilder stringBuffer = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }

            return stringBuffer.toString();
        } catch (IOException e) {
            throw new InfoHandlingException(e);
        } finally {
            reader.close();
        }

    }
}
