package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack implements IStack {

    private ArrayList listStack;

    @Override
    public boolean empty() {
        return (0 == this.listStack.size());
    }

    @Override
    public void push(Object o) {
        this.listStack.add(o);
    }

    @Override
    public Object pop() throws EmptyStackException {


        if (this.empty()) {
            throw new EmptyStackException();
        }

        Object pop = this.listStack.get(this.listStack.size() - 1);

        this.listStack.remove(this.listStack.size() - 1);

        return pop;

    }

    @Override
    public Object peek() throws EmptyStackException {

        if (this.empty()) {
            throw new EmptyStackException();
        }

        return this.listStack.get(this.listStack.size() - 1);
    }
}


