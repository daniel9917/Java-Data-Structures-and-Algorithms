package main.java.s17.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Graph {
    HashMap <String, ArrayList<String>> adjList = new HashMap<>();

    public boolean addVertex (String vertex) {
        if (adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge (String vertex1, String vertex2) {
        ArrayList<String> v1 = adjList.get(vertex1);
        ArrayList<String> v2 = adjList.get(vertex2);
        if (v1 != null && v2 != null ) {
            v1.add(vertex2);
            v2.add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge (String vertex1, String vertex2) {
        ArrayList<String> v1 = adjList.get(vertex1);
        ArrayList<String> v2 = adjList.get(vertex2);
        if (v1 != null && v2 != null ) {
            v1.remove(vertex2);
            v2.remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex (String vertex) {
        ArrayList<String> v1 = adjList.get(vertex);
        if (v1 != null) {
            for (String oV : adjList.get(vertex)) {
                adjList.get(oV).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
        return false;
    }


    public void printGraph () {
        System.out.println(adjList);
    }

}
