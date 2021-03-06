package by.epam.chain.impl;

import by.epam.entity.TextComponent;
import by.epam.info_reader.TextReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SentenceHandlerTest {
    private final static String PATH_OF_INPUTFILE = "information/inputdata/text_handling.txt";
    private String line;

    @BeforeMethod
    public void setUp() throws Exception {
        line = TextReader.readText(PATH_OF_INPUTFILE);
    }

    @Test
    public void testHandle() throws Exception {
        TextComponent textComponent;
        SentenceHandler sentenceHandler = new SentenceHandler();
        textComponent = sentenceHandler.handle(line);
        Assert.assertTrue(textComponent.getClass().getSimpleName().equals("Sentence"));
    }
}