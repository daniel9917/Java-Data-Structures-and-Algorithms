package main.java.s4.linkedLists;

public class MainLL {

    public static void main (String [] args) {

//        LinkedList myLinkedList = new LinkedList(4);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();

        //

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.makeEmpty();
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();

//        /**
//         * REMOVE LAST!!!!!!!!
//         */
//
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().getValue());
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().getValue());
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());

//        /**
//         * PREPEND
//         */
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(3);
//
//        System.out.println("Before prepend():");
//        System.out.println("-----------------");
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
//
//        myLinkedList.prepend(1);
//
//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();


//        /**
//         * REMOVE FIRSST
//         */
//
//
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(1);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().getValue());
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().getValue());
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());


//        /**
//         * Get element at a given index
//         */
//
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//        System.out.print("The list is: ");
//        myLinkedList.printList();
//        System.out.println(myLinkedList.get(4) == null ?
//                myLinkedList.get(4) :
//                myLinkedList.get(4).getValue());
        /**
         * Set element of index to a value
         */


//
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//        System.out.println("Linked List before set():");
//        myLinkedList.printList();
//
//        myLinkedList.set(2, 99);
//        myLinkedList.set(1, 4);
//        myLinkedList.set(2, 98);
//
//        System.out.println("\nLinked List after set():");
//        myLinkedList.printList();
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Linked List before set():
//            0
//            1
//            2
//            3
//
//            Linked List after set():
//            0
//            1
//            99
//            3
//
//        */


//        /**
//         * Insertion of an element to the linked list
//          */
//
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(3);
//
//        System.out.println("LL before insert():");
//        myLinkedList.printList();
//
//        myLinkedList.insert(1, 2);
//
//        System.out.println("\nLL after insert(2) in middle:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(0, 0);
//
//        System.out.println("\nLL after insert(0) at beginning:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(4, 4);
//
//        System.out.println("\nLL after insert(4) at end:");
//        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4

        */



        // Remove i element


//
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);
//
//        System.out.println("LL before remove():");
//        myLinkedList.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myLinkedList.remove(2).getValue());
//        System.out.println("LL after remove() in middle:");
//        myLinkedList.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myLinkedList.remove(0).getValue());
//        System.out.println("LL after remove() of first node:");
//        myLinkedList.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myLinkedList.remove(2).getValue());
//        System.out.println("LL after remove() of last node:");
//        myLinkedList.printList();
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            LL before remove():
//            1
//            2
//            3
//            4
//            5
//
//            Removed node:
//            3
//            LL after remove() in middle:
//            1
//            2
//            4
//            5
//
//            Removed node:
//            1
//            LL after remove() of first node:
//            2
//            4
//            5
//
//            Removed node:
//            5
//            LL after remove() of last node:
//            2
//            4
//
//        */

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//
//        System.out.println("LL before reverse():");
//        myLinkedList.printList();
//
//        myLinkedList.reverse();
//
//        System.out.println("\nLL after reverse():");
//        myLinkedList.printList();
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            LL before reverse():
//            1
//            2
//            3
//            4
//
//            LL after reverse():
//            4
//            3
//            2
//            1
//
//        */


        /**
         * MIDDLE NODE
         */

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);
//
//
//        System.out.println("Middle Node:");
//        System.out.println( myLinkedList.findMiddleNode().getValue());
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Middle Node:
//            3
//
//        */

        int number = 10;
        System.out.println("Divisors for the number " + number + " are: ");
        LinkedList l = new LinkedList(3);
        l.append(5);
        l.append(8);
        l.append(10);
        l.append(2);
        l.append(1);
//        l.append(7);
//        l.append(8);
//        l.append(1);
//        l.append(10);
//        System.out.println();
//        System.out.print("[");
//        l.getDivisorList(number).forEach(integer -> System.out.print( " "+ integer));
//        System.out.print("]");
//        System.out.println();
//        int k = 5;
//        System.out.println("The value of the kth element with k: " + k + " is:" + l.findKthFromEnd(k).getValue());
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
        System.out.println("The linked list before sorting is");
        l.printList();
        int n = 5;
        System.out.println("The linked list after sorting with number " + n + " is:");
        l.partitionList(n);
        l.printList();
//        l.removeDuplicates();
//        System.out.println("The linked list after removing the duplicates is ");
//        l.printList();
//        l.reverseBetween(1, 3);



    }

}
