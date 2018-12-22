package com.company;

import java.util.ArrayList;

public class Graph {
    final int MAX_VERTS = 20;

    private int adjMat[][];
    private ArrayList<Vertex> vertexList;

    private Queue<Integer> theQueue;
    private Stack<Integer> theStack;


    Position rigntNow;

    Graph() {
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        vertexList = new ArrayList<>();
        for(int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }

        theQueue = new Queue<>();
        theStack = new Stack<>();
    }

    void addVertex(char label) {
        vertexList.add(new Vertex(label));
    }

    void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    void displayVertex(int v) {
        System.out.print(vertexList.get(v).label);
    }

    void bfs() {
        vertexList.get(0).wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        int v2;

        while( !theQueue.isEmpty() )
        {
            int v1 = theQueue.remove();
            while( (v2 = getAdjUnvisitedVertex(v1)) != -1 ) {
                vertexList.get(v2).wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        for (int i = 0; i < MAX_VERTS; i++)
        {
            vertexList.get(i).wasVisited = false;
        }
    }

    void dfs() {
        vertexList.get(0).wasVisited = true;
        displayVertex(0);
        //theStack.
    }

    int getAdjUnvisitedVertex(int v) {
        for(int j = 0; j< vertexList.size(); j++) {
            if (adjMat[v][j] == 1 && vertexList.get(j).wasVisited == false) {
                return j;
            }
        }
        return -1;
    }


    //void Move(int[] a) {};

    //Graph createNewGraph(int a) {};


}