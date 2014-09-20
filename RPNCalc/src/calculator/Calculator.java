package calculator;

import stack.IStack;
import stack.LinkedListStack;

import java.util.EmptyStackException;

public class Calculator {

    public int evaluate(IStack<Token> tokens) throws EmptyStackException {

        LinkedListStack<Integer> rpnStack = new LinkedListStack<Integer>();

        while (!tokens.empty()) {
            tokens.pop().evaluate(rpnStack);
        }

        return rpnStack.peek();
    }

}
