package com.company;

import java.util.Date;

public class Vertex {
    String label;
    int x; int y; int level;
    private Date date;
    public boolean wasVisited;

    Vertex(Date date) {
        this.date = date;
        this.wasVisited = false;
    }
    Vertex(int x, int y, int level) {
        this.x = x;
        this.y = y;
        this.level = level;
        this.wasVisited = false;
    }
    Vertex(String label) {
        this.label = label;
        this.wasVisited = false;
    }

    Vertex() {
        this.date = new Date();
        this.wasVisited = false;
    }

    void displayVertex() {
        System.out.println(date);
    }
}
