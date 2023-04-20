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
        int n = 21;
        System.out.println("Does the tree contain " + n + "? : " +myBST.rContains(n));
        System.out.println("Does the tree contain " + n + "? : " +myBST.rContains(n));
        System.out.println("Does the tree contain " + (n + 1) + "? : " +myBST.rContains(n + 1));
        System.out.println("Does the tree contain " + (n + 1) + "? : " +myBST.rContains(n + 1));

        BinarySearchTree myNewBST = new BinarySearchTree();

        myNewBST.rInsert(2);
        myNewBST.rInsert(1);
        myNewBST.rInsert(3);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Root: " + myNewBST.root.value);
        System.out.println("Root.left: " + myNewBST.root.left.value);
        System.out.println("Root.right: " + myNewBST.root.right.value);

    }
}
