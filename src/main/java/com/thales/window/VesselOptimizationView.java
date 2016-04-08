package com.thales.window;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * Created by Administrator on 8/04/2016.
 */
public class VesselOptimizationView extends HBox{

    //TODO
    final Pane deckView = new Pane();

    final Pane generationView = new Pane();

    final Pane fitnessView = new Pane();

    final Pane manifestView = new Pane();

    public VesselOptimizationView()
    {
        VBox leftBox = new VBox();

        leftBox.getChildren().addAll(generationView, fitnessView, manifestView);

        this.getChildren().addAll(leftBox, deckView);
    }

}
