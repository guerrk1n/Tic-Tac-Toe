package com.company;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertexList = new ArrayList<>();
    private Vertex parent;
    private int SIZE;
    int counter = 0;


    Graph(int size) {
        this.SIZE = size;
        addVertex("Root", null);
        this.parent = vertexList.get(0);
    }

    Graph() {
        vertexList = new ArrayList<>();
    }

    void addVertex(String label, Vertex parent) {
        vertexList.add(new Vertex(label));
    }

    void addVertex(int x, int y, int level, Vertex parent) {
        vertexList.add(new Vertex(x, y, level, parent));
    }

    void addVertex(Vertex parent) {
        vertexList.add(parent);
    }

    void addConnection(Vertex parent, Vertex child) {
        child.parent = parent;
        parent.children.add(child);
    }


    void createCon(int number_of_them) {
        for (int i = 0; i < number_of_them; i++) {
            addVertex(parent);
            addConnection(parent, vertexList.get(vertexList.size() - 1));
            counter++;
        }
    }

    Vertex parentUp() {
        parent = parent.parent;
        return parent;
    }

    Vertex getChild(int index_of_child) {
        parent = parent.children.get(index_of_child);
        return parent;
    }


    void level4(int level) {
            createCon(level);
        System.out.println(counter + "!");
    }

    void level3(int level) {
        //level 3 available moves
        parent = parent.parent.children.get(0);
        createCon(3);
        parent = parent.parent.children.get(1);
        createCon(3);
        parent = parent.parent.children.get(2);
        createCon(3);
        parent = parent.parent.children.get(3);
        createCon(3);

    }


    void level2() {
        {
            parent = parent.parent.children.get(0).children.get(0);
            createCon(2);
            parent = parent.parent.children.get(1);
            createCon(2);
            parent = parent.parent.children.get(2);
            createCon(2);
            parent = parent.parent.parent.children.get(1).children.get(0);
            createCon(2);
            parent = parent.parent.children.get(1);
            createCon(2);
            parent = parent.parent.children.get(2);
            createCon(2);
            parent = parent.parent.parent.children.get(2).children.get(0);
            createCon(2);
            parent = parent.parent.children.get(1);
            createCon(2);
            parent = parent.parent.children.get(2);
            createCon(2);
            parent = parent.parent.parent.children.get(3).children.get(0);
            createCon(2);
            parent = parent.parent.children.get(1);
            createCon(2);
            parent = parent.parent.children.get(2);
            createCon(2);


        }
    }

    void level1() {
        System.out.println(counter +" = ");
        // we get the first parent of level 2
        parent = parent.parent.parent.children.get(0).children.get(0).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);//+
        parent = parent.parent.parent.children.get(1).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1); //+
        createCon(1);
        parent = parent.parent.parent.children.get(2).children.get(0);
        createCon(1); //5
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.parent/*root*/.children.get(1).children.get(0).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.children.get(1).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.children.get(2).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.parent/*root*/.children.get(2).children.get(0).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.children.get(1).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.children.get(2).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.parent/*root*/.children.get(3).children.get(0).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.children.get(1).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);
        parent = parent.parent.parent.children.get(2).children.get(0);
        createCon(1);
        parent = parent.parent.children.get(1);
        createCon(1);


        System.out.println("Finished");

    }


    void make() {
        level4(4);
        level3(3);
        level2();
        level1();
        System.out.println("I am working = " + counter) ;

    }


    //level

}
