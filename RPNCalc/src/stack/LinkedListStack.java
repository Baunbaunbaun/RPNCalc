package stack;

import java.util.EmptyStackException;


public class LinkedListStack<TypeOfValue> implements IStack<TypeOfValue> {

    private Node firstNode;

    @Override
    public boolean empty() {
        return (null == this.firstNode);
    }

    @Override
    public void push(TypeOfValue o) {

        this.firstNode = new Node(o, this.firstNode);
    }

    @Override
    public TypeOfValue pop() throws EmptyStackException {

        if (null == this.firstNode) {
            throw new EmptyStackException();
        }

        TypeOfValue pop = (TypeOfValue) this.firstNode.getObject();

        this.firstNode = this.firstNode.getNextNode();

        return pop;
    }

    @Override
    public TypeOfValue peek() throws EmptyStackException {

        if (null == this.firstNode) {
            throw new EmptyStackException();
        }

        return (TypeOfValue) firstNode.getObject();
    }

    private class Node {

        private Node nextNode;
        private Object object;

        private Node(Object o, Node n) {
            this.object = o;
            this.nextNode = n;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public Object getObject() {
            return object;
        }
    }
}