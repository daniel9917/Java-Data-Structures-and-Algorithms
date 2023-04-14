package main.java.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Class <T> {
    private ArrayList<T> stackList = new ArrayList<>();

    public static String reverseString (String s){
        if (s != null && !s.equals("")) {
            ArrayList<String> letters = new ArrayList<> (List.of(s.split("")));
            String reversed = "";
            while ((letters.size() > 0)) {
                reversed += letters.remove(letters.size() - 1);
            }
            return reversed;
        }
        else {
            return "";
        }
    }

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> additionalStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }

            additionalStack.push(temp);
        }

        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue (int value) {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(value);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int dequeue () {
        return stack1.isEmpty() ? null : stack1.pop();
    }

    public static boolean isBalancedParentheses(String parentheses) {
        Stack <Character> stack = new Stack();
        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }



    public T pop() {
        if (stackList.size() <= 0) return null;
        return stackList.remove(stackList.size() - 1);
    }

}
