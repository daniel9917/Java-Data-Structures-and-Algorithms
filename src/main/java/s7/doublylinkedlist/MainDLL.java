package main.java.s7.doublylinkedlist;

public class MainDLL {

    public static void main (String [] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList(7);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.printList();

        int n = 1;
        System.out.println("List adding value :"+n);

        linkedList.append(n);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.printList();

        System.out.println("List after removing last :");

        linkedList.removeLast();
        linkedList.printList();

        System.out.println("List after removing last :");

        linkedList.removeLast();
        linkedList.printList();

        System.out.println("List after removing last :");

        linkedList.removeLast();
        linkedList.printList();

        System.out.println("List after removing last :");

        linkedList.removeLast();
        linkedList.printList();

        System.out.println("List after adding elements :");

        System.out.println();
        linkedList.prepend(1);
        linkedList.printList();

        System.out.println();
        linkedList.prepend(3);
        linkedList.printList();

        System.out.println();
        linkedList.prepend(4);
        linkedList.printList();


        System.out.println();
        linkedList.prepend(5);
        linkedList.printList();

        System.out.println();
        linkedList.prepend(6);
        linkedList.printList();

        System.out.println();
        linkedList.prepend(7);
        linkedList.printList();

        int el = 4;
        System.out.println("List finding elemnt at index :"+el);
        System.out.println(linkedList.get(el).value);
        linkedList.printList();

        int set = 3;
        System.out.println("List setting elemnt at index :"+el+" to value: "+set);
        System.out.println(linkedList.set(el,set));
        linkedList.printList();
//
//        System.out.println("List after removing first :");
//
//        linkedList.removeFirst();
//        linkedList.printList();
//
//        System.out.println("List after removing first :");
//
//        linkedList.removeFirst();
//        linkedList.printList();
//
//        System.out.println("List after removing first :");
//
//        linkedList.removeFirst();
//        linkedList.printList();
//
//        System.out.println("List after removing first :");
//
//        linkedList.removeFirst();
//        linkedList.printList();
//
//        System.out.println("List after removing first :");
//
//        linkedList.removeFirst();
//        linkedList.printList();
//
//        System.out.println("List after removing first :");
//
//        linkedList.removeFirst();
//        linkedList.printList();
//
//        System.out.println("List after removing first :");
//
//        linkedList.removeFirst();

        int index = 3;
        System.out.println("List adding element at index: "+ index);
        linkedList.insert(1, 4);
        linkedList.printList();
//
//        int indexR = 2;
//
//        System.out.println("List removing element at index: "+ indexR);
//        linkedList.remove(indexR);
//        linkedList.printList();
//
//        System.out.println("List removing element at index: "+ indexR);
//        linkedList.remove(indexR);
//        linkedList.printList();
//
//        System.out.println("List removing element at index: "+ indexR);
//        linkedList.remove(indexR);
//        linkedList.printList();
//
//        System.out.println("List removing element at index: "+ indexR);
//        linkedList.remove(indexR);
//        linkedList.printList();
//
//        System.out.println("List removing element at index: "+ indexR);
//        linkedList.remove(indexR);
//        linkedList.printList();
//
//        System.out.println("List removing element at index: "+ indexR);
//        linkedList.remove(indexR);
//        linkedList.printList();

        linkedList.getLength();
        System.out.println(linkedList.get(7).value);

        System.out.println("List before reversing");
        System.out.println(" ");
        linkedList.printList();

        System.out.println("List after reversing");
        System.out.println(" ");
        linkedList.reverse();
        linkedList.printList();

        System.out.println("List after removing last");
        linkedList.removeLast();
        linkedList.printList();

        System.out.println("List after swapping f and l");
        System.out.println(" ");
        linkedList.swapFirstAndLast();
        linkedList.printList();

        System.out.println("List after swapping adyacent nodes");
        System.out.println(" ");
        linkedList.swapPairs();
        linkedList.printList();

    }
}
