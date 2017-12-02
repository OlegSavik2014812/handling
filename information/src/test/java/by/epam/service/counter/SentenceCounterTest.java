package by.epam.service.counter;

import by.epam.chain.impl.TextHandler;
import by.epam.entity.TextComponent;
import by.epam.info_reader.TextReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SentenceCounterTest {
    private final static String PATH_OF_INPUTFILE = "information/inputdata/text_handling.txt";
    private TextComponent textComponent;

    @BeforeMethod
    public void setUp() throws Exception {
        TextHandler textHandler = new TextHandler();
        textComponent = textHandler.handle(TextReader.readText(PATH_OF_INPUTFILE));
    }

    @Test
    public void testRealize() throws Exception {
        SentenceCounter sentenceCounter = new SentenceCounter();
        Integer count = sentenceCounter.realize(textComponent);
        Assert.assertEquals(count.intValue(), 4);
    }

}