package main.java.s7.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(" " + temp.value + " " );
            temp = temp.next;
        }
        System.out.print("]");
        System.out.println("");

    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.tail = newNode;
            this.head = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast () {
        Node tempTail = tail;
        if (length < 1) {
            return null;
        }
        else if (length == 1) {
            this.head = null;
            this.tail = null;

        } else  {
            tail = tempTail.prev;
            tail.next = null;
            tempTail.prev = null;
        }
        length--;

        return tempTail;
    }

    public Node prepend (int value) {
        Node newNode = new Node(value);
        if (length < 1) {
            this.head = newNode;
            this.tail = newNode;

        } else  {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;

        return newNode;
    }

    public Node removeFirst () {
        Node tempHead = head;
        if (length < 1) {
            return null;
        }
        else if (length == 1) {
            this.head = null;
            this.tail = null;

        } else  {
            head = tempHead.next;
            head.prev = null;
            tempHead.next = null;
        }
        length--;

        return tempHead;
    }

    public Node get (int index) {
        Node node = null;
        if (index == 0){
            return head;
        } else if (index == length - 1) {
            return tail;
        } else if (index < 0 || index >= length){
            return null;
        } else if (index - 0 <= length - index){
            Node h = head;
            for (int i = 0; i < length; i++) {
                if (i == index) return h;
                else h = h.next;
            }
        } else  {
            Node t = tail;
            for (int i = length; i > 0; i--) {
                if (i == index) return t;
                else t = t.prev;
            }

        }
        return node;
    }



    public boolean set (int index, int value) {
        Node node = null;
        if (index < 0 || index >= length){
            return false;
        } else if (index - 0 <= length - index){
            Node h = head;
            for (int i = 0; i < length; i++) {
                if (i == index) {
                    node = h;
                    break;
                }
                else h = h.next;
            }
        } else  {
            Node t = tail;
            for (int i = length; i > 0; i--) {
                if (i == index) {
                    node = t;
                    break;
                }
                else t = t.prev;
            }

        }
        if (node != null) {
            node.value =value;
            return true;
        }
        return false;
    }

    public boolean insert (int index, int value){
        if (index < 0 || index > length){
            return false;
        } else if (index == 0){
            prepend(value);
            return true;
        } else  if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node after = get(index);
        Node before = after.prev;
        newNode.next = after;
        newNode.prev = before;
        after.prev = newNode;
        before.next = newNode;
        length++;
        return true;

    }
//
    public Node remove (int index){
        Node removeNode;
        if (index < 0 || index >= length){
            return null;
        } else if (index == 0){
            return removeFirst();
        } else  if (index == length - 1){
            return removeLast();
        }
        removeNode = get(index);
        Node after = removeNode.next;
        Node before = removeNode.prev;
        after.prev = before;
        before.next = after;
        removeNode.next = null;
        removeNode.prev = null;
        length--;
        return removeNode;
    }

    public void reverse () {
        if (length > 1) {
            Node temp = tail;
            while (temp != null) {
                Node prevNode = temp.next;
                temp.next = temp.prev;
                temp.prev = prevNode;
                temp = temp.next;
            }
            Node newHead = tail;
            Node newTail = head;
            head = newHead;
            tail = newTail;
        }
    }

    public void swapFirstAndLast () {
        if (length > 1){
            int tempVal = head.value;
            head.value = tail.value;
            tail.value = tempVal;
        }
    }

    public boolean isPalindrome () {
        if (length <= 0) return false;
        Node i = head;
        Node j = tail;
        while (i != null && j != null) {
            if (i.value != j.value) {
                return false;
            }
            i = i.next;
            j = j.prev;
        }
        return true;
    }

    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = this.head;
        Node prev = dummy;

        while (this.head != null && this.head.next != null) {
            Node firstNode = this.head;
            Node secondNode = this.head.next;

            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = prev;
            firstNode.prev = secondNode;
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            this.head = firstNode.next;
            prev = firstNode;
        }

        this.head = dummy.next;
    }


}
