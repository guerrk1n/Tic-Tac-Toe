package com.company;

import java.util.ArrayList;

public class Vertex {
    String label;
    boolean wasVisited;
    int x;
    int y;
    int level;
    Vertex parent;
    ArrayList<Vertex> children;
    Position theGame;

    Vertex(int x, int y, int level, Vertex parent) {
        this.label = "" + x + " " + y + " " + level + " " + wasVisited;
        this.x = x;
        this.y = y;
        this.level = level;
        this.wasVisited = false;
        children = new ArrayList<>();
        this.parent = parent;
        theGame = parent.theGame;
    }

    Vertex(Vertex parent) {
        this.parent = parent;
        children = new ArrayList<>();
        theGame = parent.theGame;

    }



    Vertex(String label) {
        this.label = label;
        wasVisited = false;
        children = new ArrayList<>();
        parent = null;
        theGame = new Position();
    }

    void displayAlternativeVertex() {
        System.out.println(this.label);
    }
}
