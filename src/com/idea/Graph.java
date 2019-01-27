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
        while (Node.children != null) {
            Node = Node.children.get(0);
        }
    }


    public void inOrder(int level, Vertex Node) {
        Node.theGame.printTable(Node);

        if (level >= 0) {

            Node.children.add(new Vertex(Node));
            if (Node != vertexList.get(0)) {
                Node.theGame.makeMove(Node, level, Node.children.size() - 1);
            }
            level--;

            inOrder(level, Node.children.get(Node.children.size() - 1));

            level++;
            Node.theGame.printTable(Node);
            if (Node.children.size() < level) {
                inOrder(level, Node);
            }
        }

    }

    public void create() {
        inOrder(SIZE * SIZE, NodeStatic);
    }
}
