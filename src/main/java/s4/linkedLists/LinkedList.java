package main.java.s4.linkedLists;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // Node is a value and a pointer

    /**
     * Created a new node
     * @param value
     */
    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    /**
     * Creates a new node and add it to the end.
     * @param value
     */
    public void append (int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            setTail(newNode);
        }
        length ++;

    }

    /**
     * Creates a new node and add it to the beginning.
     * @param value of the new node
     */
    public void prepend (int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
        length ++;
        if (length == 1) {
            tail = newNode;
        }
    }

    /**
     * Creates a new node and insert it at a particular index
     *
     * @param index
     * @param value
     */
    public boolean insert (int index, int value) {
        if (!(index < 0  || index > length)) {
            if (index == 0) {
                this.prepend(value);
                return true;
            } else if (index == length) {
                this.append(value);
                return true;
            } else {
                Node temp = head;
                Node newNode = new Node(value);
                for (int i = 0; i < index; i++) {
                    if (i == index -1) {
                        newNode.setNext(temp.getNext());
                        temp.setNext(newNode);
                        break;
                    }
                    temp = temp.getNext();

                }
                length ++;
                return true;
            }
        }
        return false;
    }

    public Node remove(int index) {
        if (!(index < 0  || index > length)) {
            if (index == 0) {
                return this.removeFirst();
            } else if (index == length) {
                return this.removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < index; i++) {
                    if (i == index -1) {
                        Node removeNode = temp.getNext();
                        temp.setNext(removeNode.getNext());
                        length --;
                        return removeNode;
                    }
                    temp = temp.getNext();
                }
            }
        }
        return null;
    }

    /**
     * Removes the last element of a linked list
     *
     * @return removed node
     */
    public Node removeLast () {
        Node removed = null;
        if (length > 0) {
            if (length > 1) {
                Node temp = head;
                while (temp.getNext().getNext() != null) {
                    temp = temp.getNext();
                }
                removed = temp.getNext();
                temp.setNext(null);
                tail = temp;
            } else {
                removed = head;
                head = null;
                tail = null;
            }
            length--;

        }
        return removed;

    }

    /**
     * Removes the first element of a linked list
     *
     * @return removed node
     */
    public Node removeFirst () {
        Node removed = head;
        if (length > 1) {
            Node newHead = head.getNext();
            head = newHead;
            length --;
        } else  if (length == 1) {
            head = null;
            tail = null;
            length = 0;
        }
        return removed;
    }

    public void reverse () {
        LinkedList reversedLinkedList = new LinkedList(0);
        Node it = head;
        while (it != null){
            reversedLinkedList.prepend(it.getValue());
            it = it.getNext();
        }
        reversedLinkedList.removeLast();
        this.head = reversedLinkedList.head;
        this.tail = reversedLinkedList.tail;
    }

    public Node get(int index) {
        if (index < 0 || index >= length){
            return null;
        }
        Node element = head;
        for (int i = 0; i < index; i++) {
            element = element.getNext();
        }
        return element;
    }

    public boolean set (int index, int value) {
        if (length <= 0) return false;
        if (index < 0 || index >= length) return false;
        Node element = head;
        for (int i = 0; i < index; i++) {
            element = element.getNext();
        }
        element.setValue(value);
        return true;
    }

    public void printList() {
        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(" " + temp.getValue() + " " );
            temp = temp.getNext();
        }
        System.out.print("]");
        System.out.println("");

    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.getValue());
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.getValue());
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
