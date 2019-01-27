package com.rubbish;

import com.company.Position;

public class Vertex {
    String label;
    int x; int y; int level;
    Position theGame;

    public boolean wasVisited;


    Vertex(int x, int y, int level) {
        this.x = x;
        this.y = y;
        this.level = level;
        this.wasVisited = false;
        theGame = new Position();

    }

    Vertex(int x, int y, int level, char table[][]) {
        this.x = x;
        this.y = y;
        this.level = level;
        this.wasVisited = false;
        this.theGame = new Position(table);

    }
    Vertex(String label) {
        this.label = label;
        this.wasVisited = false;
    }

    Vertex() {
        this.wasVisited = false;
    }

}

