package by.epam.info_writter;

import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
    private final static String PATH_OF_OUTPUTFILE = "information/inputdata/text_handling_out.txt";

    public static void write(TextComponent textComponent) throws InfoHandlingException, IOException {
        File file = new File(PATH_OF_OUTPUTFILE);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(textComponent.toString());
        } catch (IOException e) {
            throw new InfoHandlingException(e);
        } finally {
            writer.close();
        }
    }
}
