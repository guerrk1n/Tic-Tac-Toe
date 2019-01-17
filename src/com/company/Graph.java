package com.company;

import java.util.ArrayList;

public class Graph {
    final int MAX_VERTS = 1000;

    int z = 406;

    private byte adjMat[][] = new byte[z][z];

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

    void addVertex(int x, int y, int level, Position theGame) {
        vertexList.add(new Vertex(x, y, level));
    }

    void addVertex(int x, int y, int level, Object table[][]) {
        vertexList.add(new Vertex(x, y, level, table));
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
        for (int i = 0; i < z; i++) {
            for (int k = 0; k < z; k++) {
                System.out.print(adjMat[i][k] + " ");
            }
            System.out.println("");
        }
    }
    //void Move(int x, int y) {};

    void createNewGraphs() {
        int number_of_string_in_graph = 0;
        int vertex_level = 1;
        for (int level = 9; level > 0; level--) {
               for (int i = 0; i < rightNow.TABLE_SIZE; i++) {
                   for (int k = 0; k < rightNow.TABLE_SIZE; k++) {
                       for (int local_level = 0; local_level < level; local_level++) {
                           Vertex parent = null;
                           addVertex(i, k, level, parent.theGame);
                           addEdge(number_of_string_in_graph, vertex_level++);

                           if (vertexList.get(vertexList.size()).theGame.table[i][k].equals(0)) {
                               if (level % 2 == 0) {
                                   vertexList.get(vertexList.size()).theGame.makeMoveBot(i, k);
                               } else {
                                   vertexList.get(vertexList.size()).theGame.makeMoveMan(i, k);
                               }
                           }
                           vertexList.get(vertexList.size()).theGame.printTable();
                       }
                       number_of_string_in_graph++;
                   }
               }
               if(level == 0){
                   break;
               }
        }
    }
}