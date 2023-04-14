package main.java.s10.stacks;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop () {
        System.out.println("Top: "+this.top.value);

    }
    public void getHeight () {
        System.out.println("Height: "+this.height);
    }
    public void printStack () {
        Node temp = top;
        System.out.print("[");
        while (temp != null) {
            System.out.print(" "+temp.value);
            temp = temp.next;
        }
        System.out.print(" ]");
        System.out.println("");

    }

    public void push (int value) {
        Node newNode = new Node (value);
        if (height < 1){
            top = newNode;
        }
         else {
            newNode.next = top;
            top = newNode;
        }
        height ++;
    }

    public Node pop () {
        Node nodeToPop = null;
        if (height < 1){
            return nodeToPop;
        }
         else {
            Node temp = top;
            top = temp.next;
            temp.next = null;
            height --;
            return temp;
        }

    }
}
