package com.company;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javafx.scene.image.Image;


public class Main extends Application {

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Image image = new Image(getClass().getResourceAsStream("cross.png"), 20, 20, true, true);


    public static void main(String[] args) {

        //Graph mainGraph = new Graph();
        //mainGraph.addVertex("Root");

        ////mainGraph.createNewGraphs();

        //AlternativeGraph extraGraph = new AlternativeGraph();
        //extraGraph.make();
        //extraGraph.treeBuilding();

        AlternativeGraph doubleGraph = new AlternativeGraph(1);
        doubleGraph.make();



        //launch(args);


    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tictactoe.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root, 650, 400));
        primaryStage.show();
        primaryStage.setResizable(false);


    }

    private int counter[] = new int[9]; // checking of was the button pressed?

    public void ButtonClick(ActionEvent actionEvent) {


        Graph mainGraph = new Graph();
/**
 *firstly, we must make a move, but we must check, if a cell is empty
 *if cell is empty we make a move and counter[]++
 *then computer must creat new graph and take a move
 * !! we must register move of computer and !!!remember it!!! ( not implemented in this version )
 */
        if (actionEvent.getSource() == button1) {

            if (counter[0] == 0) {
                button1.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(0, 0);
                // mainGraph.createNewGraphs();
                counter[0]++;
            } else {
                System.out.println("Button has already been pressed");
            }

        }
        if (actionEvent.getSource() == button2) {
            if (counter[1] == 0) {
                button2.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(0, 1);
                // mainGraph.createNewGraphs();
                counter[1]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }
        if (actionEvent.getSource() == button3) {
            if (counter[2] == 0) {
                button3.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(0, 2);
                // mainGraph.createNewGraphs();
                counter[2]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }
        if (actionEvent.getSource() == button4) {
            if (counter[3] == 0) {
                button4.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(1, 0);
                // mainGraph.createNewGraphs();
                counter[3]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }
        if (actionEvent.getSource() == button5) {
            if (counter[4] == 0) {
                button5.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(1, 1);
                // mainGraph.createNewGraphs();
                counter[4]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }
        if (actionEvent.getSource() == button6) {
            if (counter[5] == 0) {
                button6.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(1, 2);
                // mainGraph.createNewGraphs();
                counter[5]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }
        if (actionEvent.getSource() == button7) {
            if (counter[6] == 0) {
                button7.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(2, 0);
                // mainGraph.createNewGraphs();
                counter[6]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }

        if (actionEvent.getSource() == button8) {
            if (counter[7] == 0) {
                button8.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(2, 1);
                // mainGraph.createNewGraphs();
                counter[7]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }
        if (actionEvent.getSource() == button9) {
            if (counter[8] == 0) {
                button9.setGraphic(new ImageView(image));
                mainGraph.rightNow.makeMoveMan(2, 2);
                // mainGraph.createNewGraphs();
                counter[8]++;
            } else {
                System.out.println("Button has already been pressed");
            }


        }


    }
}
