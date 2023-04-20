package main.java.test;


import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Class <T> {
    private ArrayList<T> stackList = new ArrayList<>();

    /**
     * This method provides a way to get a given time into words
     * @param h  hours, its value should vary from 1 to 12
     * @param m minutes,its value should vary from 0 to 60
     * @return returns the time in text string
     */
    public static String timeInWords (int h, int m) {
        Map<Integer, String> hourString = new HashMap<>();
        hourString.put(1, "one");
        hourString.put(2, "two");
        hourString.put(3, "three");
        hourString.put(4, "four");
        hourString.put(5, "five");
        hourString.put(6, "six");
        hourString.put(7, "seven");
        hourString.put(8, "eight");
        hourString.put(9, "nine");
        hourString.put(10, "ten");
        hourString.put(11, "eleven");
        hourString.put(12, "twelve");
        hourString.put(13, "thirteen");
        hourString.put(14, "fourteen");
        hourString.put(15, "quarter");
        hourString.put(16, "sixteen");
        hourString.put(17, "seventeen");
        hourString.put(18, "eighteen");
        hourString.put(19, "nineteen");


        Map<Integer, String> prefixes = new HashMap<>();
        prefixes.put(2,"twenty");
        prefixes.put(3,"thirty");
        prefixes.put(4,"fourty");
        prefixes.put(5,"fifty");

        if (m == 0) {
            return hourString.get(h) + " o' clock";
        } else if (m == 1) {
            return "one minute past " + hourString.get(h);
        } else if (m == 15) {
            return "quarter past " + hourString.get(h);
        }  else if (m == 30) {
            return "half past " + hourString.get(h);
        }  else if (m == 45) {
            return "quarter to " + ((h == 12) ? hourString.get(1) : hourString.get(h + 1));
        } else if (m > 1 && m < 30) {
            if (m < 19) {
                return hourString.get(m) + " minutes past " + hourString.get(h);
            } else {
                List <Integer> parts = List.of(String.valueOf(m).split(""))
                        .stream()
                        .map(s -> Integer.parseInt(s))
                        .collect(Collectors.toList());
                return parts.get(1) == 0 ?
                        prefixes.get(parts.get(0)) + " minutes past " + hourString.get(h) :
                        prefixes.get(parts.get(0)) + " " + hourString.get(parts.get(1)) + " minutes past " + hourString.get(h);
            }
        } else if (m > 30) {
            String nextHour = ((h == 12) ? hourString.get(1) : hourString.get(h + 1));
            if (60 - m == 1) {
                return hourString.get(60 - m) + " minute to " + nextHour;
            }
            else if (60 - m < 19) {
                return hourString.get(60 - m) + " minutes to " + nextHour;
            } else {
                List<Integer> parts = List.of(String.valueOf(60 - m).split(""))
                        .stream()
                        .map(s -> Integer.parseInt(s))
                        .collect(Collectors.toList());
                return prefixes.get(parts.get(0)) + " " + hourString.get(parts.get(1)) + " minutes to " + nextHour ;
            }
        } else {
            return "couldnt make conversion";
        }
    }

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
