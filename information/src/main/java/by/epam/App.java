package by.epam;

import by.epam.chain.impl.TextHandler;
import by.epam.entity.TextComponent;
import by.epam.exception.InfoHandlingException;
import by.epam.info_reader.TextReader;
import by.epam.info_writter.TextWriter;
import by.epam.service.changer.LexemeChanger;
import by.epam.service.counter.SentenceCounter;
import by.epam.service.sorter.SentenceSorter;

import java.io.IOException;
import java.util.List;

public class App {
    private final static String PATH_OF_INPUTFILE = "information/inputdata/text_handling.txt";

    public static void main(String[] args) throws IOException, InfoHandlingException {

        TextHandler textHandler = new TextHandler();
        TextComponent textComponent = textHandler.handle(TextReader.readText(PATH_OF_INPUTFILE));
        System.out.println(textComponent);
        /*TextWriter.write(textComponent);*/
        /*SentenceSorter sorter = new SentenceSorter();
        SentenceCounter counter = new SentenceCounter();*/

        /*counter.realize(textComponent);
        sorter.realize(textComponent);
        changer.realize(textComponent);*/

        /*System.out.println(ExpressionConverter.convertToPostfix("2+3+4+5*(5*2+3-4*(1/2))"));*/

    }
}
