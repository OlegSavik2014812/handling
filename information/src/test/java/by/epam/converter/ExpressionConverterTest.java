package by.epam.converter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpressionConverterTest {
    private final static String EXPRESSION = "2+3+4+5*(5*2+3-4*(1/2))";

    @Test
    public void testConvertToPostfix() throws Exception {
        Assert.assertEquals(ExpressionConverter.convertToPostfix(EXPRESSION), "2 3 + 4 + 5 5 2 * 3 + 4 1 2 / * - * +");
    }
}