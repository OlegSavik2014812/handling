package by.epam.interpreter.impl;

import by.epam.interpreter.AbstractMathExpression;
import by.epam.interpreter.Context;

public class TerminalExpressionMinus implements AbstractMathExpression {
    @Override
    public void interpret(Context context) {
        context.pushValue(context.popValue() - context.popValue());
    }
}
