package com.company;

import java.util.ArrayList;

public class AlternativeVertex {
    String label;
    boolean wasVisited;
    int x;
    int y;
    int level;
    AlternativeVertex parent;
    ArrayList<AlternativeVertex> children;
    Position theGame;

    AlternativeVertex(int x, int y, int level, AlternativeVertex parent) {
        this.label = "" + x + " " + y + " " + level + " " + wasVisited;
        this.x = x;
        this.y = y;
        this.level = level;
        this.wasVisited = false;
        children = new ArrayList<>();
        this.parent = parent;
        theGame = parent.theGame;
    }

    AlternativeVertex(AlternativeVertex parent) {
        this.parent = parent;
        children = new ArrayList<>();
        theGame = parent.theGame;

    }



    AlternativeVertex(String label) {
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
