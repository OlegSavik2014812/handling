package by.epam.interpreter;

import by.epam.converter.ExpressionConverter;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InterpreterTest {
    private final static String EXPRESSION = "1+2+3*1*2*3";
    private String postfix;

    @BeforeMethod
    public void setUp() throws Exception {
        postfix = ExpressionConverter.convertToPostfix(EXPRESSION);
    }

    @Test
    public void testCalculate() throws Exception {
        Interpreter interpreter = new Interpreter();
        String result = String.format("%.2f", interpreter.calculate(postfix).doubleValue());
        Assert.assertEquals(result,"21,00");
    }

}