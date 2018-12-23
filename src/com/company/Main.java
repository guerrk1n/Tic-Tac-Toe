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
        for (int i = 1; i < 11; i++) {
            mainGraph.addVertex("i");
            mainGraph.addEdge(0, i);
        }
        mainGraph.printAdjMat();

        //launch(args);

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
