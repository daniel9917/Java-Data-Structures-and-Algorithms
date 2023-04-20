package main.java.s15.hashtables;

import java.util.*;
import java.util.stream.Collectors;

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

    public static List <Integer> findDuplicates (int [] array) {
        HashMap <Integer, Boolean> numbers = new HashMap<>();
        List <Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
            if (numbers.containsKey(array[i]) && !duplicates.contains(array[i])) duplicates.add(array[i]);
            numbers.put(array[i], true);
        }
        return duplicates;
    }

    public static Character firstNonRepeatingString (String s) {
        List <String> characters = List.of(s.split(""));
        HashMap<String, Integer> letters = new HashMap<>();
        for (int i = 0; i < characters.size() ; i++) {
            String ch =  characters.get(i);
            Integer times = letters.get(ch);
            if (times != null && times > 0) {
                letters.put(ch, times + 1 );
            } else {
                letters.put(ch, 1 );
            }
        }

        for (int i = 0; i < characters.size() ; i++) {
            String ch =  characters.get(i);
            int times = letters.get(ch);
            if (times == 1) {
                return ch.toCharArray()[0];
            }
        }
        return null;
    }

    public static List<List<String>> groupAnagrams (String [] string) {

        HashMap <Integer, List<String>> groupedAnagrams = new HashMap<>();
        for (int i = 0; i < string.length; i++) {
            String s = string[i];
            char [] sChars = s.toCharArray();
            int squaredSum = 0;
            for (int j = 0; j < sChars.length; j++){
                squaredSum += Math.pow(sChars[j], 2);
            }
            List <String> anagrams = groupedAnagrams.get(squaredSum);
            if (anagrams == null) {
                groupedAnagrams.put(squaredSum, new ArrayList<>(List.of(s)));
            } else {
                anagrams.add(s);
                groupedAnagrams.put(squaredSum, anagrams);
            }
        }
        return groupedAnagrams.values().stream().collect(Collectors.toList());
    }



    public static int [] twoSum (int [] values, int target) {
        HashMap<Integer, List<Integer>> candidates = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i] <= target) {
                List<Integer> e = candidates.get(values[i]);
                if (e == null) {
                    candidates.put(values[i], new ArrayList<>(List.of(i)));
                } else {
                    e.add(i);
                    candidates.put(values[i], e);
                }
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : candidates.entrySet()) {
            int remainder = target - entry.getKey();
            if (candidates.containsKey(remainder)) {
                List<Integer> indexes = candidates.get(remainder);
                if (entry.getKey() == remainder && indexes.size() > 1) {
                    return new int[]{entry.getValue().get(0), indexes.get(1)};
                } else if (entry.getKey() != remainder) {
                    return new int[]{entry.getValue().get(0), indexes.get(0)};
                }
            }
        }
        return new int[]{};
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
