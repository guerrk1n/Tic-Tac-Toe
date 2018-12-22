package com.company;

public class Main {

    public static void main(String[] args) {

        int mas[][];
        mas = new int[3][3];

        mas[0][2] = -1;

        for (int i = 0; i <= 2; i++) {
            for (int k = 0; k <= 2; k++) {
                System.out.print(mas[i][k]);
            }
            System.out.println("");
        }
    }
}
