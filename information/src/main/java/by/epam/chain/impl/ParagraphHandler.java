package by.epam.chain.impl;

import by.epam.chain.ComponentHandler;
import by.epam.entity.TextComponent;
import by.epam.entity.impl.Paragraph;
import by.epam.exception.InfoHandlingException;
import by.epam.parsing.ComponentParser;

import java.util.List;

public class ParagraphHandler implements ComponentHandler {
    private TextComponent paragraphComponent;
    private final static String SENTENCE_REGEX = "[^.]*[^.]*\\.";
    public ParagraphHandler() {
        paragraphComponent = new Paragraph();
    }

    @Override
    public TextComponent handle(String paragraph) throws InfoHandlingException {
        List<String> sentences = ComponentParser.parse(paragraph, SENTENCE_REGEX);
        for (String sentence : sentences) {
            paragraphComponent.addTextComponent(new SentenceHandler().handle(sentence));
        }
        return paragraphComponent;
    }
}
