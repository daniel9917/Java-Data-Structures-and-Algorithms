package main.java.s15.hashtables;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    public static boolean itemInCommon (int [] array1, int [] array2) {
        HashTable hashTable = new HashTable();
        for (int i = 0; i < array1.length ; i++) {
            hashTable.set(""+array1[i], 1);
        }
        for (int i = 0; i < array2.length ; i++) {
            if (hashTable.get(""+array2[i]) != 0) {
                return true;
            }
        }
        return false;
    }
    private int size = 7;
    private Node [] dataMap;

    public HashTable () {
        dataMap = new Node[7];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash (String key) {
        int hash = 0;
        char [] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set (String key, int value) {
        // Getting the index on the table according to the string
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (this.dataMap[index] == null) {
            this.dataMap[index] = newNode;
        } else {
            Node pointer = this.dataMap[index];
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newNode;
        }
    }

    public int get (String key) {
        int index = hash(key);
        if (dataMap[index] == null) {
            return 0;
        } else {
            Node pointer = this.dataMap[index];
            while (pointer != null) {
                if (pointer.key == key) return pointer.value;
                else pointer = pointer.next;
            }
            return 0;
        }
    }

    public ArrayList<String> keys () {
        ArrayList<String> keys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            if (dataMap[i] != null) {
                Node pointer = dataMap[i];
                while (pointer != null) {
                    keys.add(pointer.key);
                    pointer = pointer.next;
                }
            }
        }
        return keys;
    }


}
