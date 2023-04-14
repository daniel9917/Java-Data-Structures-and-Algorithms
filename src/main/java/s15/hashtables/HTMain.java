package main.java.s15.hashtables;

public class HTMain {

    public static void main (String [] args) {
        HashTable myHashTable =  new HashTable();
        myHashTable.printTable();

        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println( myHashTable.keys() );



        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(myHashTable.itemInCommon(array1, array2));

    }
}
