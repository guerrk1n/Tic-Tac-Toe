package com.company;

import java.util.ArrayList;

public class Graph {
    final int MAX_VERTS = 20;

    private int adjMat[][];
    private ArrayList<Vertex> vertexList;

    private int nVerts;
    private Queue<Integer> theQueue;


    Position rigntNow;


    Graph() {
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        vertexList = new ArrayList<>();
        nVerts = 0;
        for(int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }

        theQueue = new Queue();
    }

    void addVertex(char label) {
        vertexList.add(new Vertex(label));
    }


    void Move(int[] a) {};

    Graph createNewGraph(int a) {
        return new Graph();
    };


}
