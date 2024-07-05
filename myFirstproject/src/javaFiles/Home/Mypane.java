package javaFiles.Home;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Mypane extends Application {

    @Override
    public void start(Stage prStage) throws Exception {

        Label lb = new Label("Good Morning");
        lb.setCenterShape(true);
        lb.setAlignment(Pos.TOP_CENTER);
        lb.setTextFill(Color.ORANGE);
        lb.setStyle("-fx-background-color:red;");

        // Stackpane
        /*
         * StackPane sp = new StackPane();
         * Label l1 = new Label(" Good Morining");
         * l1.setAlignment(Pos.TOP_CENTER);
         * l1.setFont(new Font(35));
         * /*
         * Pane pane = new Pane(lb);
         * pane.setCenterShape(true);
         * 
         * /*
         * Label l2 = new Label("-------------");
         * l2.setFont(new Font(35));
         */

        /*
         * sp.getChildren().addAll(l1);
         * // Stackpane end
         * 
         * // BorderPane start
         * BorderPane bp = new BorderPane();
         * 
         * Label top = new Label("Top");
         * top.setFont(new Font(35));
         * 
         * Label left = new Label("Left");
         * left.setFont(new Font(35));
         * 
         * Label right = new Label("right");
         * right.setFont(new Font(35));
         * 
         * Label center = new Label("Center");
         * center.setFont(new Font(35));
         * 
         * Label topRight = new Label("Good Morning");
         * topRight.setFont(new Font(35));
         * 
         * // Setting direction
         * 
         * bp.setTop(top);
         * bp.setRight(right);
         * bp.setLeft(left);
         * 
         * // BorderPane end
         * 
         * Group gr = new Group(pane);
         */

        Scene scene = new Scene(lb);
        scene.setFill(Color.RED);

        prStage.setScene(scene);

        prStage.setTitle(" MyPane");

        prStage.setHeight(1000);
        prStage.setWidth(1000);
        prStage.show();
    }

}
