package com.company;

public class Position {
    public final int TABLE_SIZE = 3;
    Object[][] table = new Object[TABLE_SIZE][TABLE_SIZE];
    int x;
    int y;
    //X is a player, so let's make X will be a char X;
    //We will change '0' to Y. I think, that way we will be easier to see the difference.

    public Position(Object[][] table) {
        this.table = table;
    }

    public void makeMoveMan(int x, int y) {
        table[x][y] = 'X';
    }

    public void makeMoveBot(int x, int y) {
        table[x][y] = 'Y';
    }

    public int getNumbersMoves() {
        int ans = 0;
        for (int i = 0; i < TABLE_SIZE; i++) {
            for (int k = 0; k < TABLE_SIZE; k++) {
                if (table[i][k].equals(0)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public Position() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            for (int k = 0; k < TABLE_SIZE; k++) {
                table[i][k] = 0;
            }
        }
    }

    boolean isGameOver() {
        if (table[0][0].equals('X'))
            if (table[0][1].equals('X'))
                if (table[0][2].equals('X'))
                    return true;
        //1
        if (table[0][0].equals('Y'))
            if (table[0][1].equals('Y'))
                if (table[0][2].equals('Y'))
                    return true;
        if (table[1][0].equals('X'))
            if (table[1][1].equals('X'))
                if (table[1][2].equals('X'))
                    return true;
        //2
        if (table[1][0].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[1][2].equals('Y'))
                    return true;
        if (table[2][0].equals('X'))
            if (table[2][1].equals('X'))
                if (table[2][2].equals('X'))
                    return true;
        //3
        if (table[2][0].equals('Y'))
            if (table[2][1].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;

        if (table[0][0].equals('X'))
            if (table[1][0].equals('X'))
                if (table[2][0].equals('X'))
                    return true;
        //4
        if (table[0][0].equals('Y'))
            if (table[1][0].equals('Y'))
                if (table[2][0].equals('Y'))
                    return true;
        if (table[0][1].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][1].equals('X'))
                    return true;
        //5
        if (table[0][1].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][1].equals('Y'))
                    return true;
        if (table[0][1].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][1].equals('X'))
                    return true;
        //6
        if (table[0][2].equals('Y'))
            if (table[1][2].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;

        if (table[0][0].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][2].equals('X'))
                    return true;
        //7
        if (table[0][0].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;
        if (table[0][2].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][0].equals('X'))
                    return true;
        //8
        if (table[0][2].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][0].equals('Y'))
                    return true;
        return false;
    }

    public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            for (int k = 0; k < TABLE_SIZE; k++) {
                System.out.print(table[i][k] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public boolean isGoodEnd(){
        if (table[0][0].equals('Y'))
            if (table[0][1].equals('Y'))
                if (table[0][2].equals('Y'))
                    return true;
        if (table[1][0].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[1][2].equals('Y'))
                    return true;
        if (table[2][0].equals('Y'))
            if (table[2][1].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;
        if (table[0][0].equals('Y'))
            if (table[1][0].equals('Y'))
                if (table[2][0].equals('Y'))
                    return true;
        if (table[0][1].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][1].equals('Y'))
                    return true;
        if (table[0][2].equals('Y'))
            if (table[1][2].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;
        if (table[0][0].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;
        if (table[0][2].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][0].equals('Y'))
                    return true;
        return false;

    }

    //Vertex MoveBack(){};
    //Vertex MoveForward(){};

}
