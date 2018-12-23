package com.company;

import java.util.ArrayList;

public class Graph {
    final int MAX_VERTS = 1000;

    private int adjMat[][] = new int[1000][1000];
    private ArrayList<Vertex> vertexList;

    private Queue<Integer> theQueue;
    private Stack<Integer> theStack;


    Position rightNow;

    Graph() {
        vertexList = new ArrayList<>();
        rightNow = new Position();
        theQueue = new Queue<>();
        theStack = new Stack<>();
    }

    void addVertex(String label) {
        vertexList.add(new Vertex());
    }

    void addVertex(int x, int y, int level) {
        vertexList.add(new Vertex(x, y, level));
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

        while (!theQueue.isEmpty()) {
            int v1 = theQueue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList.get(v2).wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        for (int i = 0; i < MAX_VERTS; i++) {
            vertexList.get(i).wasVisited = false;
        }
    }

    void dfs() {
        vertexList.get(0).wasVisited = true;
        displayVertex(0);
        theStack.push(0);

        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList.get(v).wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }

        }

        for (Vertex aVertexList : vertexList) {
            aVertexList.wasVisited = false;
        }
    }

    int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < vertexList.size(); j++) {
            if (adjMat[v][j] == 1 && !vertexList.get(j).wasVisited) {
                return j;
            }
        }
        return -1;
    }

    void printAdjMat() {
        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < 20; k++) {
                System.out.print(adjMat[i][k] + " ");
            }
            System.out.println("");
        }
    }
    //void Move(int x, int y) {};

    void createNewGraphs() {
        while(true) {
            for (int level = rightNow.TABLE_SIZE * rightNow.TABLE_SIZE - 1; level > 0 ; level--) {
                for (int i = 0; i < rightNow.TABLE_SIZE; i++) {
                    for (int k = 0; k < rightNow.TABLE_SIZE; k++) {
                        if (rightNow.table[i][k].equals(0)) {
                            for (int m = 0; m < level; m++) { //m < level to be changed
                                addVertex(i, k, level);
                                //addEdge();
                            }
                        }
                    }
                }
            }
        }
    };


}
