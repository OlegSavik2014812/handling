package by.epam.service.changer;

import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;
import by.epam.service.BaseAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class LexemeChanger extends BaseAction {
    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public List<TextComponent> realize(TextComponent textComponent) throws InfoHandlingException {
        List<TextComponent> sentences = getAllSentences(textComponent);
        for (TextComponent sentence : sentences) {
            if (sentence.getList().size() > 1) {
                TextComponent temp1 = sentence.getList().get(0);
                TextComponent temp2 = sentence.getList().get(sentence.getList().size() - 1);
                sentence.getList().remove(0);
                sentence.getList().remove(sentence.getList().size() - 1);
                sentence.getList().add(0, temp2);
                sentence.getList().add(sentence.getList().size(), temp1);
            } else {
                break;
            }
        }

        return sentences;
    }
}
