package by.epam.service.sorter;

import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;

import java.util.Comparator;

public class SentenceComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        try {
            int firstSize = o1.getList().size();
            int secondSize = o2.getList().size();
            return Integer.compare(firstSize, secondSize);
        } catch (InfoHandlingException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
