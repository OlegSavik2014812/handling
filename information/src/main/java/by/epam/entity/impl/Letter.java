package by.epam.entity.impl;

import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;

import java.util.List;

public class Letter implements TextComponent {
    public String letter;

    public Letter(String letter) {
        this.letter = letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Letter letter1 = (Letter) o;

        return letter != null ? letter.equals(letter1.letter) : letter1.letter == null;
    }

    @Override
    public int hashCode() {
        return letter != null ? letter.hashCode() : 0;
    }

    @Override
    public String toString() {
        return letter + "";
    }

    @Override
    public void addTextComponent(TextComponent textComponent) throws InfoHandlingException {
        throw new InfoHandlingException();
    }

    @Override
    public void removeTextComponent(TextComponent textComponent) throws InfoHandlingException {
        throw new InfoHandlingException();
    }

    @Override
    public void clear() throws InfoHandlingException {
        throw new InfoHandlingException();
    }

    @Override
    public List<TextComponent> getList() throws InfoHandlingException {
        throw new InfoHandlingException();
    }
}



