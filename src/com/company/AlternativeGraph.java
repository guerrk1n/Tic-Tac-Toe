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
    int i =0;
    void addConnection(AlternativeVertex parent, AlternativeVertex child) {
        System.out.println(parent.label +" " + i);
        i++;
        child.parent = parent;
        parent.children.add(child);
    }

    void level4() {

        //parent = root

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));


    }

    void level3() {
        parent = parent.parent.children.get(0);
        //level 3 available moves
        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        parent = parent.parent.children.get(1);

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        parent = parent.parent.children.get(2);

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        parent = parent.parent.children.get(3);

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        addAlternativeVertex(parent);
        addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

        parent = parent.parent.children.get(0).children.get(0);
    }


    void level2() {
        {
            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(2);


            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));


            parent = parent.parent.parent.children.get(1).children.get(0);


            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(2);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(2).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(2);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(3).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(2);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(0).children.get(0).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(1).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(2).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.parent.children.get(1).children.get(0).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(1).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.parent.children.get(2).children.get(0).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(1).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(2).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.parent.children.get(3).children.get(0).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(1).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.parent.children.get(2).children.get(0);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            parent = parent.parent.children.get(1);

            addAlternativeVertex(parent);
            addConnection(parent, alternativeVertexList.get(alternativeVertexList.size() - 1));

            System.out.println("Finished");


        }
    }


    void make() {
        level4();
        level3();
        level2();

    }


    //level

}
