package main.java.test;


public class ClassMain {
    public static void main (String [] args) {

        System.out.println();
        System.out.println();
        System.out.println();
//        String palabra = "palabra";
//        System.out.println("La palabra es: "+palabra);
//        System.out.println("La palabra reversada es: "+Class.reverseString(palabra));

        Class <String> c = new Class<>();
//
//        c.enqueue(3);
//        System.out.println(c.peek());
//
//        c.enqueue(4);
//        System.out.println(c.peek());
//
//        c.enqueue(2);
//        System.out.println(c.peek());
//
//        c.enqueue(6);
//        System.out.println(c.peek());
//
//        c.enqueue(8);
//        System.out.println(c.peek());
//
//        c.enqueue(1);
//        System.out.println(c.peek());
        int hours = 1;
        int minutes = 0;

//        System.out.println("The hour " + hours + ":" + minutes + "");
//        System.out.println("The hour in string is: " + Class.timeInWords(hours, minutes));
//
        while ( hours < 13) {
            while (minutes < 60) {
                System.out.println("The hour " + hours + ":" + minutes + " in string is: " + Class.timeInWords(hours, minutes));
                minutes++;
            }
            minutes = 0;
            hours++;
        }
//        System.out.println("The hour " + hours + ":" + minutes + " in string is: " + Class.timeInWords(hours, minutes));

    }
}
