package stack;

import calculator.BinaryAdd;
import calculator.Calculator;
import calculator.Token;
import calculator.Value;

public class Main {

    public static void main(String[] args) {

        LinkedListStack<Token> tokenStack = new LinkedListStack<Token>();

        Calculator cal = new Calculator();

        tokenStack.push(new BinaryAdd());
        tokenStack.push(new Value(2));
        tokenStack.push(new Value(888));

        System.out.println(cal.evaluate(tokenStack));
    }
}
