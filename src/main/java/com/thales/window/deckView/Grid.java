package com.thales.window.deckView;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;

/**
 * Created by Administrator on 8/04/2016.
 */
public class Grid extends Xform {

    public Grid(double width, double height, double cellWidth, double cellHeight)
    {
        int cellsWide = (int) Math.round(width / cellWidth);

        int cellsHigh = (int) Math.round(height / cellHeight);

        for (int i = 0; i < cellsWide; i++)
        {
            for (int j = 0; j < cellsHigh; j++)
            {
                Box cell = new Box(width, height, 0);
                cell.setDrawMode(DrawMode.LINE);

                final PhongMaterial gridColor = new PhongMaterial(Color.GREY);

                cell.setMaterial(gridColor);

                cell.setTranslateX(i * cellWidth);
                cell.setTranslateY(j * cellHeight);

                this.getChildren().add(cell);

            }
        }
    }
}
