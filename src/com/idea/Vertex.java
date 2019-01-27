package com.idea;

import com.company.Position;

import java.util.ArrayList;

public class Vertex {
    String label;
    boolean wasVisited;
    public int x;
    public int y;
    public int level;
    public Vertex Node;
    public ArrayList<Vertex> children;
    public Position theGame;


    Vertex(Vertex parent) {
        this.Node = parent;
        children = new ArrayList<>();
        theGame = parent.theGame;

    }

    Vertex(Vertex parent, String label) {
        this.label = label;
        this.Node = parent;
        children = new ArrayList<>();
        theGame = parent.theGame;

    }

    Vertex(String label) {
        this.label = label;
        wasVisited = false;
        children = new ArrayList<>();
        Node = null;
        theGame = new Position();
    }

    void displayVertex() {
        System.out.println(this.label);
    }
}
