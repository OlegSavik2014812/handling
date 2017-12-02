package by.epam.chain.impl;

import by.epam.chain.ComponentHandler;
import by.epam.entity.TextComponent;
import by.epam.entity.impl.Text;
import by.epam.exception.InfoHandlingException;
import by.epam.parsing.ParagraphParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class TextHandler implements ComponentHandler {
    private TextComponent textComponent;
    private final static String PARAGRAPH_REGEX = "\t";
    private final static Logger LOGGER = LogManager.getLogger();

    public TextHandler() {
        textComponent = new Text();
    }

    @Override
    public TextComponent handle(String line) throws InfoHandlingException {
        List<String> paragraphs = ParagraphParser.parse(line, PARAGRAPH_REGEX);
        for (String paragraph : paragraphs) {
            textComponent.addTextComponent(new ParagraphHandler().handle(paragraph));
        }
        /*LOGGER.info("\n" + textComponent);*/
        System.out.println(textComponent);
        return textComponent;
    }
}
