package by.epam.chain.impl;

import by.epam.chain.ComponentHandler;
import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;
import by.epam.entity.impl.Letter;
import by.epam.entity.impl.Lexeme;
import by.epam.entity.impl.Symbol;

public class LexemeHandler implements ComponentHandler {
    private TextComponent textComponent;
    private final static String LETTER_REGEX = "([A-Za-z]+)";
    public LexemeHandler() {
        textComponent = new Lexeme();
    }

    @Override
    public TextComponent handle(String lexeme) throws InfoHandlingException {
        for (int i = 0; i < lexeme.length(); i++) {
            String symbol = String.valueOf(lexeme.charAt(i));
            if (symbol.matches(LETTER_REGEX)) {
                textComponent.addTextComponent(new Letter(symbol));
            } else {
                textComponent.addTextComponent(new Symbol(symbol));
            }
        }
        return textComponent;
    }
}
