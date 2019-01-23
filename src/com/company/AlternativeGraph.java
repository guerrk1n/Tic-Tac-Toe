package com.company;

import java.util.ArrayList;

public class AlternativeGraph {
    final int MAX_VERTS = 1000;
    //private int adj_Mat[][] = new int[MAX_VERTS][MAX_VERTS];
    private ArrayList<AlternativeVertex> alternativeVertexList = new ArrayList<>();
    //Position rightNow;

    AlternativeVertex parent;

    AlternativeGraph(int a) {

        addAlternativeVertex("Root", null);
        this.parent = alternativeVertexList.get(0);
    }


    AlternativeGraph() {
        alternativeVertexList = new ArrayList<>();
        //rightNow = new Position();
    }

    void addAlternativeVertex(String label, AlternativeVertex parent) {
        alternativeVertexList.add(new AlternativeVertex(label));
    }

    void addAlternativeVertex(int x, int y, int level, AlternativeVertex parent) {
        alternativeVertexList.add(new AlternativeVertex(x, y, level, parent));
    }

    void addAlternativeVertex(AlternativeVertex parent) {
        alternativeVertexList.add(parent);
    }

    int i = 0;

    void addConnection(AlternativeVertex parent, AlternativeVertex child) {
        System.out.println(parent.label + " " + i);
        i++;
        child.parent = parent;
        parent.children.add(child);
    }


    void createCon(int number_of_them) {
        for (int i = 0; i < number_of_them; i++) {
            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));
        }
    }



    void level4(int level) {
        //parent = root
        createCon(level);
    }

    void level3(int level) {
        //level 3 available moves
        for (int i = 0; i < 4; i++) {
            parent = parent.parent.children.get(i);
            createCon(level);
        }
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
        // we get the first parent of level 2
        parent = parent.parent.parent.children.get(0).children.get(0).children.get(0);
        /*1*/createCon(1);
        parent = parent.parent.children.get(1);
        /*2*/createCon(1);//+
        parent = parent.parent.parent.children.get(1).children.get(0);
        /*3*/createCon(1);
        parent = parent.parent.children.get(1); //+
        /*4*/createCon(1);
        parent = parent.parent.parent.children.get(2).children.get(0);
        /*5*/createCon(1); //5
        parent = parent.parent.children.get(1);
        /*6*/createCon(1);
        parent = parent.parent.parent.parent/*root*/.children.get(1).children.get(0).children.get(0);
        /*1*/createCon(1);
        parent = parent.parent.children.get(1);
        /*2*/createCon(1);
        parent = parent.parent.parent.children.get(1).children.get(0);
        /*3*/createCon(1);
        parent = parent.parent.children.get(1);//here
        /*4*/createCon(1); //10
        parent = parent.parent.parent.children.get(2).children.get(0);
        /*5*/createCon(1);
        parent = parent.parent.children.get(1);
        /*6*/createCon(1);
        parent = parent.parent.parent.parent/*root*/.children.get(2).children.get(0).children.get(0);
        /*1*/createCon(1);
        parent = parent.parent.children.get(1);
        /*2*/createCon(1);
        parent = parent.parent.parent.children.get(1).children.get(0);
        /*3*/createCon(1);
        parent = parent.parent.children.get(1);
        /*4*/createCon(1);
        parent = parent.parent.parent.children.get(2).children.get(0);
        /*5*/createCon(1); //15
        parent = parent.parent.children.get(1);
        /*6*/createCon(1);
        parent = parent.parent.parent.parent/*root*/.children.get(3).children.get(0).children.get(0);
        /*1*/createCon(1);
        parent = parent.parent.children.get(1);
        /*2*/createCon(1);
        parent = parent.parent.parent.children.get(1).children.get(0);
        /*3*/createCon(1);
        parent = parent.parent.children.get(1);
        /*4*/createCon(1); //20
        parent = parent.parent.parent.children.get(2).children.get(0);
        /*5*/createCon(1);
        parent = parent.parent.children.get(1);
        /*6*/createCon(1);//22
        //two are missing. FIND IT!

        System.out.println("Finished");

    }


    void make() {
        level4(4);
        level3(3);
        level2();
        level1();

    }


    //level

}
