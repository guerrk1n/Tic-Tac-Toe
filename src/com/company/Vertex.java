package com.company;

import java.util.Date;

public class Vertex {
    char label;
    private Date date;
    public boolean wasVisited;

    Vertex(Date date) {
        this.date = date;
        this.wasVisited = false;
    }

    Vertex(char label) {
        this.date = date;
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
