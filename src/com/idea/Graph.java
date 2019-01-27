package com.idea;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertexList = new ArrayList<>();
    private Vertex NodeStatic;
    private int SIZE;
    int counter = 0;

    public Graph(int SIZE) {
        this.SIZE = SIZE;
        this.counter = 0;
        vertexList.add(new Vertex("Root"));
        this.NodeStatic = vertexList.get(0);

    }

    private void createGames(int level, Vertex Node) {
        //if (level)
    }


    public void inOrder(int level, Vertex Node) {
        if (level >= 0) {
            Node.children.add(new Vertex(Node));
            level--;
            inOrder(level, Node.children.get(Node.children.size() - 1));

            level++;
            System.out.println(level + " " +  (++counter));
            if (Node.children.size() < level) {
                inOrder(level, Node);
            }
        }
    }

    public void create() {
        inOrder(SIZE * SIZE, NodeStatic);
    }
}
