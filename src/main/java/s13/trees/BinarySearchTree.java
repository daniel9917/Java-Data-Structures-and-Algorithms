package main.java.s13.trees;

public class BinarySearchTree {

     public Node root;

     public BinarySearchTree () {
         root = null;
     }

     public BinarySearchTree (int value) {
         Node newNode = new Node(value);
         root = newNode;
     }

     public boolean insert (int value) {
         Node newNode = new Node(value);
         if (root == null) {
             root = newNode;
             return true;
         }
         Node pointer = root;

         while (true){
              if (value > pointer.value) {
                 if (pointer.right == null){
                     pointer.right = newNode;
                     return true;
                 } else {
                     pointer = pointer.right;
                 }
             } else if (value == pointer.value) {
                  return false;
              } else {
                  if (pointer.left == null){
                      pointer.left = newNode;
                      return true;
                  } else {
                      pointer = pointer.left;
                  }
             }
         }
     }

     public boolean contains (int value){
         if (root == null) {
             return false;
         }
         Node pointer = root;
         while (true){
             if (value > pointer.value) {
                 if (pointer.right == null){
                     return false;
                 } else {
                     pointer = pointer.right;
                 }
             } else if (value == pointer.value) {
                 return true;
             } else {
                 if (pointer.left == null){
                     return false;
                 } else {
                     pointer = pointer.left;
                 }
             }
         }
     }

     public boolean containsAlternative (int value){
         Node pointer = root;
         while (pointer != null){
             if (value > pointer.value) {
                 pointer = pointer.right;
             } else if (value < pointer.value) {
                 pointer = pointer.left;
             }
             return true;
         }
         return false;
     }

}
