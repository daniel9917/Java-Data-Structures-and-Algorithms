package main.java.s13.trees;

public class BSTMain {
    public static void main (String [] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("root :" + myBST.root);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        System.out.println(myBST.root.left.right.value);
        int n = 28;
        System.out.println("Does the tree contain " + n + "? : " +myBST.contains(n));
        System.out.println("Does the tree contain " + n + "? : " +myBST.containsAlternative(n));
        System.out.println("Does the tree contain " + (n + 1) + "? : " +myBST.contains(n + 1));
        System.out.println("Does the tree contain " + (n + 1) + "? : " +myBST.containsAlternative(n + 1));

    }
}
