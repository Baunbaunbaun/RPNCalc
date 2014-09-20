package stack;

import java.util.EmptyStackException;


public class MyCalc implements IStack {
    @Override
    public boolean empty() {

        return false;
    }

    @Override
    public void push(Object o) {

    }

    @Override
    public Object pop() throws EmptyStackException {
        return null;
    }

    @Override
    public Object peek() throws EmptyStackException {
        return null;
    }
}
