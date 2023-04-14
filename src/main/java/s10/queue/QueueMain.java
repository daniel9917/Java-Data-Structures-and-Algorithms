package main.java.s10.queue;

public class QueueMain {
    public static void main (String args []) {
        Queue q = new Queue(1);
        q.getFirst();
        q.getLast();
        q.getLength();
        q.printQueue();
        System.out.println();System.out.println();System.out.println();System.out.println();
        q.enqueue(2);
        q.printQueue();
        System.out.println();System.out.println();System.out.println();
        System.out.println(q.dequeue().value);
        System.out.println();
        q.printQueue();
        System.out.println(q.dequeue().value);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




    }


}
