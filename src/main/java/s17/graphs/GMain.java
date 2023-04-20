package main.java.s17.graphs;

public class GMain {

    public static void main (String [] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");

        myGraph.printGraph();
        System.out.println("");

        myGraph.removeVertex("D");

        myGraph.printGraph();
//
//        myGraph.removeEdge("A", "C");
//        myGraph.printGraph();

    }
}
