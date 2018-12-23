package com.company;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    public static void main(String[] args) {
        Graph mainGraph = new Graph();
        mainGraph.addVertex("Root");
        int level = 9; /*level of our graph. We use it for counting the unplayed moves of the the game */
        int number = 1; /*the index of the adjMat*/
        for (int i = 0; i < mainGraph.rightNow.TABLE_SIZE; i++) {
            for (int k = 0; k < mainGraph.rightNow.TABLE_SIZE; k++) {
                mainGraph.addVertex(i, k, level);
                mainGraph.addEdge(0, number++);
            }
        }
        mainGraph.printAdjMat();
        mainGraph.rightNow.makeMoveMan(1,1);
        System.out.println("");
        mainGraph.rightNow.printTable();
        //launch(args);
        /*
        while(true) {
            mainGraph.rightNow.makeMoveMan(1,1);
            mainGraph.rightNow.printTable();
            System.out.println();
            mainGraph.printAdjMat();
            mainGraph.createNewGraphs();
            if (mainGraph.rightNow.isGameOver()) break;
        }
        */


    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tictactoe.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root,650,400));
        primaryStage.show();
        primaryStage.setResizable(false);

    }
}
