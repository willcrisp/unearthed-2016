package com.thales.window;

import com.thales.window.deckView.DeckView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 8/04/2016.
 */
public class VesselOptimizationView extends HBox{

    //TODO
    final Pane deckView = new DeckView();

    final Pane generationView = new Pane();

    final FitnessView fitnessView = new FitnessView();

    final Pane manifestView = new Pane();

    final Executor executor = Executors.newSingleThreadExecutor();

    public VesselOptimizationView()
    {
        VBox leftBox = new VBox();

        leftBox.getChildren().addAll(generationView, fitnessView, manifestView);

        executor.execute(() -> {
            while(true){
            fitnessView.addDataToQueue(20);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        });



        this.getChildren().addAll(leftBox, deckView);
    }

}
