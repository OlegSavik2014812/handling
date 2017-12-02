package by.epam.chain;

import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;

public interface ComponentHandler {
    TextComponent handle(String line) throws InfoHandlingException;
}
