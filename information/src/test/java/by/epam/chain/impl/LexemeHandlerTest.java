package by.epam.chain.impl;

import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;
import by.epam.info_reader.TextReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LexemeHandlerTest {
    private final static String PATH_OF_INPUTFILE = "information/inputdata/text_handling.txt";
    private String line;

    @BeforeMethod
    public void setUp() throws IOException, InfoHandlingException {
        line = TextReader.readText(PATH_OF_INPUTFILE);
    }

    @Test
    public void testHandle() throws Exception {
        TextComponent textComponent;
        LexemeHandler lexemeHandler = new LexemeHandler();
        textComponent = lexemeHandler.handle(line);
        Assert.assertTrue(textComponent.getClass().getSimpleName().equals("Lexeme"));
    }
}