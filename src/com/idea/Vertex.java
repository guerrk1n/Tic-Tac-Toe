package com.idea;

import com.company.Position;

import java.util.ArrayList;

public class Vertex {
    String label;
    boolean wasVisited;
    int x;
    int y;
    int level;
    Vertex Node;
    ArrayList<Vertex> children;
    Position theGame;

    Vertex(int x, int y, int level, Vertex parent) {
        this.label = "" + x + " " + y + " " + level + " " + wasVisited;
        this.x = x;
        this.y = y;
        this.level = level;
        this.wasVisited = false;
        children = new ArrayList<>();
        this.Node = parent;
        theGame = parent.theGame;
    }

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
