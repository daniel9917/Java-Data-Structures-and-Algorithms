package main.java.s10.queue;

public class Queue {

    Node first;
    Node last;
    int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void getFirst () {
        System.out.println("First: "+this.first.value);
    }
    public void getLast () {
        System.out.println("Last: "+this.last.value);
    }
    public void getLength () {
        System.out.println("Length: "+this.length);
    }

    public void printQueue () {
        Node temp = first;
        while ( temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue (int value) {
        Node newN = new Node (value);
        if (length < 1) {
            first = newN;
            last = newN;
        } else {
            last.next = newN;
            last = newN;
        }
        length++;
    }

    public Node dequeue () {
        Node node2dequeue = first;
        if (length < 1) {
            return node2dequeue;
        }
        else if (length == 1){
            node2dequeue.next = null;
            first = null;
            last = null;
            length--;
            return node2dequeue;

        }
        else {
            first = first.next;
            node2dequeue.next = null;
            length--;
            return node2dequeue;

        }
    }
}
