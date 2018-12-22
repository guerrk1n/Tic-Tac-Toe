package com.company;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    public static void main(String[] args) {

        launch(args);

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


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tictactoe.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root,650,400));
        primaryStage.show();
        primaryStage.setResizable(false);

    }
}
