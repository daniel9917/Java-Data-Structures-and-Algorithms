package main.java.s10.stacks;

public class StackMain {

    public static void main (String [] args) {
        Stack a = new Stack(4);

        a.getTop();
        a.getHeight();

        a.printStack();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        a.push(3);

        a.printStack();

        System.out.println(a.pop().value);

        a.printStack();

        System.out.println(a.pop().value);

        a.printStack();


    }
}
