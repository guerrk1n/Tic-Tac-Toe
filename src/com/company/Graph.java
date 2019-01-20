package com.company;

import java.util.ArrayList;

public class Graph {
    final int MAX_VERTS = 1000;

    int z = 406;

    private byte adjMat[][] = new byte[z][z];

    private ArrayList<Vertex> vertexList;
    private Vertex[] parents;

    private Queue<Integer> theQueue;
    private Stack<Integer> theStack;


    Position rightNow;

    Graph() {
        vertexList = new ArrayList<>();
        parents = new Vertex[10];
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

    void addEdge(int start, int end, boolean b) {
        if (b) {
            adjMat[start][end] = 1;
            adjMat[end][start] = 1;
        } else {
            adjMat[start][end] = 2;
            adjMat[end][start] = 2;
        }
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
        for (int i = 0; i < 81; i++) {
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

        Vertex parent = null;
        Vertex now = null;

        for (int level = 9; level > 0; level--) {
            for (int i = 0; i < rightNow.TABLE_SIZE; i++) {
                for (int k = 0; k < rightNow.TABLE_SIZE; k++) {
                    if (level == 9) {
                        //parent = new Vertex(0, 0, 0);
                        now = new Vertex(0, 0, 0);
                        ;
                    } else {
                        //parent = now;
                    }
                    for (int local_level = 0; local_level < level; local_level++) {
                        //System.out.println("Let's print the table");
                        //now.theGame.printTable();
                        //System.out.println("");
                        //byte m = adjMat[vertex_level][number_of_string_in_graph - 1];

                        boolean b = true;
                        if (level % 2 == 0) {
                            b = false;
                        } else b = true;
                        addEdge(number_of_string_in_graph, vertex_level++, b);
                           /*
                           if (now.theGame.table[i][k].equals(0)) {
                               if (level % 2 == 0) {
                                   vertexList.get(vertexList.size() - 1).theGame.makeMoveBot(i, k);
                                   now.theGame.makeMoveBot(i, k);
                               } else {
                                   vertexList.get(vertexList.size() - 1).theGame.makeMoveMan(i, k);
                                   now.theGame.makeMoveMan(i, k);
                               }
                           }
                           vertexList.get(vertexList.size() - 1).theGame.printTable();
                           //now = new Vertex(i, k, level - 1, parent.theGame.table);
                           */
                    }
                    number_of_string_in_graph++;
                }
            }
            if (level == 0) {
                break;
            }
        }
        printAdjMat();
    }
}