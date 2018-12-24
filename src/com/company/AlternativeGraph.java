package com.company;

import java.util.ArrayList;

public class AlternativeGraph {
    final int MAX_VERTS = 1000;
    private int adj_Mat[][] = new int[MAX_VERTS][MAX_VERTS];
    private ArrayList<AlternativeVertex> alternativeVertexList;
    Position rightNow;

    AlternativeGraph() {
        alternativeVertexList = new ArrayList<>();
        rightNow = new Position();
    }

    void addAlternativeVertex(String label, AlternativeVertex parent) {
        alternativeVertexList.add(new AlternativeVertex(label));
    }

    void addAlternativeVertex(int x, int y, int level, AlternativeVertex parent) {
        alternativeVertexList.add(new AlternativeVertex(x, y, level, parent));
    }

    void addEdge(int start, int end) {
        adj_Mat[start][end] = 1;
        adj_Mat[end][start] = 1;
    }

    void addConnection(AlternativeVertex parent, AlternativeVertex child) {
        child.parent = parent;
        parent.children.add(child);
    }

    void printAdj_Mat() {
        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < 20; k++) {
                System.out.print(adj_Mat[i][k] + " ");
                System.out.println("");
            }
        }
    }

    void countAll() {
        int level = 9;
        //the first X
        addAlternativeVertex("Root", null);

        for (int free = level; free > 0; free--) {
           for (int i = 0; i < rightNow.TABLE_SIZE; i++) {
               for  (int k = 0; k < rightNow.TABLE_SIZE; k++) {
                   addAlternativeVertex(i, k, level, alternativeVertexList.get(0));
                   addConnection(alternativeVertexList.get(
                           alternativeVertexList.size()),
                           alternativeVertexList.get(0));
               }
           }
        }
        level--;

    }
}
