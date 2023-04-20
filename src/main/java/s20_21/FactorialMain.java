package main.java.s20_21;

public class FactorialMain {
    public static void main (String args []) {
        int n = 12;
        System.out.println("The factorial of " + n + " is: " + factorial(n));
    }

    static int factorial (int n) {
        if (n == 0 || n == 1 ){
            return 1;
        } return n * factorial(n - 1);
    }

}
