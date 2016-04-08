package com.thales.window;/**
 * Created by Administrator on 8/04/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainWindow extends Application {

    final Pane mainPane = new StackPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("APP");

        Scene scene = new Scene(mainPane, 1280, 800, true);

        mainPane.getChildren().add(new VesselOptimizationView());
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
