package com.company;

public abstract class Position {
    Object[][] table = new Object[3][3];
    int x;
    int y;
    //X is a player, so let's make X will be a char X;
    //We will change '0' to Y. I think, that way we will be easier to see the difference.

    Position(Object[][] table) {
        this.table = table;
    }

    void makeMoveMan(int x, int y) {
        table[x][y] = 'X';
    }

    void makeMoveBot(int x, int y) {
        table[x][y] = 'Y';
    }

    int getNumbersMoves() {
        int ans = 0;
        for (int i = 0; i <= 2; i++) {
            for (int k = 0; k <= 2; k++) {
                if (table[i][k].equals(0)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    Position() {
        for (int i = 0; i <= 2; i++) {
            for (int k = 0; k <= 2; i++) {
                table[i][k] = 0;
            }
        }
    }

    boolean isGameOver(){
        if (table[0][0].equals('X'))
            if (table[0][1].equals('X'))
                if (table[0][2].equals('X'))
                    return true;
        if (table[0][0].equals('Y'))
            if (table[0][1].equals('Y'))
                if (table[0][2].equals('Y'))
                    return true;
        if (table[1][0].equals('X'))
            if (table[1][1].equals('X'))
                if (table[1][2].equals('X'))
                    return true;
        if (table[1][0].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[1][2].equals('Y'))
                    return true;
        if (table[2][0].equals('X'))
            if (table[2][1].equals('X'))
                if (table[2][2].equals('X'))
                    return true;
        if (table[2][0].equals('Y'))
            if (table[2][1].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;

        if (table[0][0].equals('X'))
            if (table[1][0].equals('X'))
                if (table[2][0].equals('X'))
                    return true;
        if (table[0][0].equals('Y'))
            if (table[1][0].equals('Y'))
                if (table[2][0].equals('Y'))
                    return true;
        if (table[0][1].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][1].equals('X'))
                    return true;
        if (table[0][1].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][1].equals('Y'))
                    return true;
        if (table[0][1].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][1].equals('X'))
                    return true;
        if (table[0][2].equals('Y'))
            if (table[1][2].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;

        if (table[0][0].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][2].equals('X'))
                    return true;
        if (table[0][0].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][2].equals('Y'))
                    return true;
        if (table[0][2].equals('X'))
            if (table[1][1].equals('X'))
                if (table[2][0].equals('X'))
                    return true;
        if (table[0][2].equals('Y'))
            if (table[1][1].equals('Y'))
                if (table[2][0].equals('Y'))
                    return true;
        return false;
    };
    //boolean isGoodEnd(){};

    //Vertex MoveBack(){};
    //Vertex MoveForward(){};
    //int getMoves(){};
}
