package com.company;

public class Position {
    public final int TABLE_SIZE = 3;
    char[][] table = new char[TABLE_SIZE][TABLE_SIZE];
    //X is a player, so let's make X will be a char X;
    //We will change '0' to Y. I think, that way we will be easier to see the difference.

    public Position(char[][] table) {
        this.table = table;
    }

    public void makeMove(com.idea.Vertex Node, int level, int index) {

        for (int i = 0; i < TABLE_SIZE; i++) {
            for (int k = 0; k < TABLE_SIZE; k++) {
                if (Node.Node.theGame.table[i][k] == '0') {

                    if (index == 0) {
                        if (level % 2 != 0) {
                            Node.theGame.table[i][k] = 'X';
                            return;
                        } else {
                            Node.theGame.table[i][k] = 'Y';
                            return;
                        }
                    }
                    index--;
                }
            }
        }
    }


    public Position() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            for (int k = 0; k < TABLE_SIZE; k++) {
                table[i][k] = '0';
            }
        }
    }

    boolean isGameOver() {
        if (table[0][0] == 'X')
            if (table[0][1] == 'X')
                if (table[0][2] == 'X')
                    return true;
        //1
        if (table[0][0] == 'Y')
            if (table[0][1] == 'Y')
                if (table[0][2] == 'Y')
                    return true;
        if (table[1][0] == 'X')
            if (table[1][1] == 'X')
                if (table[1][2] =='X')
                    return true;
        //2
        if (table[1][0] == 'Y')
            if (table[1][1] == 'Y')
                if (table[1][2] == 'Y')
                    return true;
        if (table[2][0] == 'X')
            if (table[2][1] == 'X')
                if (table[2][2] == 'X')
                    return true;
        //3
        if (table[2][0] == 'Y')
            if (table[2][1] == 'Y')
                if (table[2][2] == 'Y')
                    return true;

        if (table[0][0] == 'X')
            if (table[1][0] == 'X')
                if (table[2][0] == 'X')
                    return true;
        //4
        if (table[0][0] == 'Y')
            if (table[1][0] == 'Y')
                if (table[2][0] == 'Y')
                    return true;
        if (table[0][1] == 'X')
            if (table[1][1] == 'X')
                if (table[2][1] == 'X')
                    return true;
        //5
        if (table[0][1] == 'Y')
            if (table[1][1] == 'Y')
                if (table[2][1] == 'Y')
                    return true;
        if (table[0][1] == 'X')
            if (table[1][1] =='X')
                if (table[2][1] == 'X')
                    return true;
        //6
        if (table[0][2] == 'Y')
            if (table[1][2] =='Y')
                if (table[2][2] == 'Y')
                    return true;

        if (table[0][0] == 'X')
            if (table[1][1] == 'X')
                if (table[2][2] == 'X')
                    return true;
        //7
        if (table[0][0] == 'Y')
            if (table[1][1] == 'Y')
                if (table[2][2] == 'Y')
                    return true;
        if (table[0][2] == 'X')
            if (table[1][1] == 'X')
                if (table[2][0] == 'X')
                    return true;
        //8
        if (table[0][2] == 'Y')
            if (table[1][1] == 'Y')
                if (table[2][0] == 'Y')
                    return true;
        return false;
    }


    public void printTable(com.idea.Vertex Node) {
        for (int i = 0; i < TABLE_SIZE; i++) {
            for (int k = 0; k < TABLE_SIZE; k++) {
                System.out.print(Node.theGame.table[i][k] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
