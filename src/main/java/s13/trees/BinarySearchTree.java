package main.java.s13.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

     private boolean rContainss (Node currentNode, int value) {
         if (currentNode == null) return false;
         else if (currentNode.value == value) return true;
         else return rContainss(currentNode.left, value) || rContainss(currentNode.right, value) ? true : false;
     }

     public boolean rContains (int value) {
         return rContains(root, value);
     }

    private boolean rContains (Node currentNode, int value) {
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;
        else if (currentNode.value > value) return rContains(currentNode.left, value);
        else return rContains(currentNode.right, value);

    }

     public void rInsert (int value) {
         if (root == null) {
             root = new Node(value);
         }
         rInsert(root, value);
     }

    private Node rInsert (Node currentNode, int value) {
         if (currentNode == null) {
            return new Node(value);
         } else if (currentNode.value > value) {
            currentNode.left = rInsert(currentNode.left, value);
         } else if (currentNode.value <value) {
             currentNode.right = rInsert(currentNode.right, value);
         }
         return currentNode;
    }
//
//    public int minimumValue () {
//         return root != null ? minimumValue(root).value : 0;
//    }

    public int minimumValue (Node node) {
         if (node.left == null) return node.value;
         else return minimumValue(node.left);
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }

        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(root);
        return results;
    }

}
