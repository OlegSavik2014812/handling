package by.epam.service.changer;

import by.epam.chain.impl.TextHandler;
import by.epam.entity.TextComponent;
import by.epam.info_reader.TextReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LexemeChangerTest {
    private final static String PATH_OF_INPUTFILE = "information/inputdata/text_handling.txt";
    private final static String TEST_SENTENCE = "unchanged. has survived - not only five centuries, but also the leap into 13+i++ electronictypesetting, remaining 3+5, essentially 6+9*(3-4) It";
    private TextComponent textComponent;

    @BeforeMethod
    public void setUp() throws Exception {
        TextHandler textHandler = new TextHandler();
        textComponent = textHandler.handle(TextReader.readText(PATH_OF_INPUTFILE));
    }

    @Test
    public void testRealize() throws Exception {
        LexemeChanger lexemeChanger = new LexemeChanger();
        List<TextComponent> list = lexemeChanger.realize(textComponent);
        Assert.assertEquals(list.get(1).toString(), TEST_SENTENCE);
    }
}