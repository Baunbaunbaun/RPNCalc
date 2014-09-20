package stack;

import java.util.ArrayList;

public class Main {

    public static void Main(String[] args) {

        ArrayList calc = new ArrayList();

        Object test1 = new Object();
        Object test2 = new Object();
        Object test3 = new Object();

        MyStack TestStack = new MyStack();

        calc.add(test1);
        calc.add(test3);
        calc.add(test2);

        System.out.println(TestStack.empty());
        System.out.println(TestStack.peek());


    }
}
