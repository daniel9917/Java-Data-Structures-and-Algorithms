package main.java.s15.hashtables;

import java.util.*;
import java.util.stream.Collectors;

public class HTMain {

    public static List<Integer> removeDuplicates (List<Integer> myList) {
        Set<Integer> noDuplicates = new HashSet<>(myList);
        return noDuplicates.stream().collect(Collectors.toList());
    }

    public static boolean hasAtLeastOneUniqueChar (String s) {
        ArrayList <Character> repeatedChars = new ArrayList<>();
        Set<Character> nonRepeatedChars = new HashSet<>();
        char [] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            char c =  sChars[i];
            if (nonRepeatedChars.add(Character.valueOf(c)) == false) {
                repeatedChars.add(Character.valueOf(c));
            }
        }

        nonRepeatedChars.removeAll(repeatedChars);
        return nonRepeatedChars.size() > 0 ? true : false;
    }

    public static boolean hasUniqueChars (String s) {
        Set<Character> nonRepeatedChars = new HashSet<>();
        char [] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            char c =  sChars[i];
            if (nonRepeatedChars.add(Character.valueOf(c)) == false) {
                return false;
            }
        }

        return true;
    }

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

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = myHashTable.findDuplicates(nums);
        System.out.println(duplicates);

        System.out.println(myHashTable.firstNonRepeatingString("leetcode"));


        System.out.println("1st set:");
        System.out.println(myHashTable.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{1, 8, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{}, 0)));

        System.out.println("");
        System.out.println("");
        System.out.println("");



//        System.out.println("The string hola has unique characters: "+hasUniqueChars("hola"));
        System.out.println("The string abcdefg has unique characters: "+hasUniqueChars("abcdefg"));
        System.out.println("The string hello has unique characters: "+hasUniqueChars("hello"));
        System.out.println("The string \"\" has unique characters: "+hasUniqueChars(""));
        System.out.println("The string 0123456789 has unique characters: "+hasUniqueChars("0123456789"));
        System.out.println("The string abacadaeaf has unique characters: "+hasUniqueChars("abacadaeaf"));

    }
}
