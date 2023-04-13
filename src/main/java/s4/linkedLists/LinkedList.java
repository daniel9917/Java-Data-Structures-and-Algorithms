package main.java.s4.linkedLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
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

    public LinkedList reversate(LinkedList l) {
        LinkedList reversed = l == null ? new LinkedList(head, tail) :new LinkedList(l.head, l.tail);
        Node temp = reversed.head;
        reversed.head = reversed.tail;
        reversed.tail = temp;
        Node after = temp.getNext();
        Node before = null;
//        Node i = head;
        while(temp != null){
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
//            i = i.getNext();
        }

        return reversed;
    }

    public Node findMiddleNode () {
        if (this.head == null) return null;
        if (this.head.getNext() == null) return head;

        LinkedList reversedLinkedList = this.reversate(null);
        LinkedList rightList = this.reversate(reversedLinkedList);

        Node prev = rightList.head;
        Node post = reversedLinkedList.head;
        while (prev.getNext() != null) {
            if(prev.getNext().getValue() == post.getNext().getValue()) {
                return prev.getNext();
            }
        }
        return null;
    }

    public int getMinDivisor (int length) {
        for ( int i = 2; i < length; i++) {
            if (length % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public int getMaxDivisor (int length, int minDivisor) {
        return length / minDivisor;
    }

    public List<Integer> getDivisorList (int length) {
        int minDivisor = getMinDivisor(length);
        int maxDivisor = getMaxDivisor(length, minDivisor);
        List <Integer> divisors = new ArrayList<>(List.of(1));
        for (int i = minDivisor == 1 ? minDivisor + 1 : minDivisor; i <= maxDivisor; i++ ) {
            if (length % i == 0) {
                divisors.add(i);
            }
        }
        if(maxDivisor != length) {
            divisors.add(length);
        }
        return divisors;

    }

    public List <Node> getIndexes(int step) {
        List <Node> nodeList = new ArrayList<>();
        for (int i = 0; i < length; i = i + step) {
            nodeList.add(get(i));
        }
        return nodeList;
    }

    public boolean hasLoop() {
        List <Integer> divisors =  getDivisorList(length);
        boolean hasLoop = false;
        for (int divisor : divisors) {

            List <Node> nodeList = getIndexes(divisor);
            if (nodeList.size() < 1) return false;

            for (Node n : nodeList){
                int kthNode = 0;
                Node temp = nodeList.get(0);
                while (kthNode < divisor) {
                    kthNode += divisor;
                    if (n.getValue() != temp.getValue()) {
                        hasLoop = false;
                        break;
                    }
                    n = n.getNext();
                    temp = temp.getNext();
                    hasLoop = true;
                }
                if (hasLoop) {
                    return true;
                }
            }
        }
        return hasLoop;

//        if (length <= 0) {
//            return false;
//        } else if (length == 1) {
//            return false;
//        } else  {
//            List <Integer> divisors = getDivisorList(length);
//
//            for (int divisor : divisors){
//
//            }
//
//            if (divisors.size() > 2) {
//
//            }
//
//            // if lenght is even
//            if (length % 2 == 0) {
//
//            }
//            // if length is odd
//            else  {
//
//            }
//        }

    }


    public boolean hasAtLeastOneLoop () {
        boolean hasLoop = false;
        List <Integer> divisorList =  getDivisorList(length);

        for (int divisor : divisorList) {
            for (int i = 0; i < length/ divisor; i +=divisor) {
                Node baseNode = get(0);
                Node ithNode = get(i);

                int checkCount = 0;
                while (checkCount < length/divisor) {
                    if (baseNode.getValue() == ithNode.getValue()) {
                        hasLoop = true;
                        baseNode = baseNode.getNext();
                        ithNode = ithNode.getNext();
                    } else {
                        hasLoop = false;
                        break;
                    }
                    checkCount+=divisor;
                }
                if (!hasLoop) {
                    break;
                }
            }
            if (hasLoop) {
                return true;
            }
        }
        return  hasLoop;
    }


    public Node  findKthFromEnd(int k) {
        if (k <= 0 || k > length) {
            return null;
        }
        int index = length - k;
        Node temp = head;
        int count = 0;
        while (count < index) {
            temp = temp.getNext();
            count++;
        }
        return temp;
    }

    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = this.head;
        while (current != null) {
            if (values.contains(current.getValue())) {
                previous.setNext(current.getNext());
                this.length -= 1;
            } else {
                values.add(current.getValue());
                previous = current;
            }
            current = current.getNext();
        }
    }

//    public void reverseBetween (int m, int n) {
//        if (!(m < 0 || n >= this.length || m >= n)){
//            if (m == 0){
//                if (n == this.length - 1) {
//
//                } else {
//
//                }
//            } else {
//                Node newHead = this.head;
//                for (int i = 0; i <= n; i++) {
//                    newHead = newHead.getNext();
//                }
//                Node tempTail = newHead.getNext();
//                Node newTail = this.head;
//                for (int i = 0; i <= m; i++) {
//                    newTail = newTail.getNext();
//                }
//
//                int count = m;
//                while (count < n){
//                    prevTail = newTail.getNext();
//                    newTail = newTail.getNext();
//                    count++;
//                }
//            }
//        }
//    }

    public void partitionList (int x) {
        Node p = head, lowHead = null, higherHead = null, biggerPrev = null, lesserPrev = null;
        while (p != null) {
            if (p.getValue() >= x) {
                if (lesserPrev != null){
                    lesserPrev.setNext(null);
                }
                if (higherHead == null) {
                    higherHead = p;
                    biggerPrev = p;
                    p = p.getNext();
                } else {
                    biggerPrev.setNext(p);
                    biggerPrev = p;
                    p = p.getNext();
                }
            } /*if p minor than x*/
            else {
                if (biggerPrev != null){
                    biggerPrev.setNext(null);
                }
                if (lowHead == null){
                    lowHead = p;
                    lesserPrev = p;
                    p = p.getNext();
                } else {
                    lesserPrev.setNext(p);
                    lesserPrev = p;
                    p = p.getNext();
                }
            }
        }

        if (lowHead != null && higherHead != null) {
            biggerPrev.setNext(null);
            lesserPrev.setNext(higherHead);
            this.head = lowHead;
        }
    }
}
