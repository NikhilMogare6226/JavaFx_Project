package javaFiles;

import javafx.event.EventHandler;

import javax.swing.text.StyledEditorKit.BoldAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ButtonAssingnment2 extends Application {

    @Override
    public void start(Stage prStage) throws Exception {
        prStage.setWidth(1920);
        prStage.setHeight(1000);

        TextField tField = new TextField();

        // btn
        Button btn1 = new Button("OS");
        Button btn2 = new Button("C");

        Button btn4 = new Button("cpp");
        Button btn5 = new Button("Java");
        Button btn6 = new Button("DSA");
        Button btn3 = new Button("Python");

        /*
         * btn1.setOnAction(new EventHandler<ActionEvent>() {
         * 
         * @Override
         * public void handle(ActionEvent event) {
         * System.out.println("JAVA 2024");
         * }
         * 
         * });
         * 
         * Button btn2 = new Button("Core@web SuperX");
         * 
         * btn2.setOnAction(new EventHandler<ActionEvent>() {
         * 
         * @Override
         * public void handle(ActionEvent event) {
         * System.out.println("Super x 2024");
         * }
         * 
         * });
         * 
         * Button btn3 = new Button("Core 2web DSA");
         * 
         * btn3.setOnAction(new EventHandler<ActionEvent>() {
         * 
         * @Override
         * public void handle(ActionEvent event) {
         * System.out.println("DSA 2024");
         * }
         * 
         * });
         */
        btn1.setStyle("-fx-background-color:BLUE");
        btn2.setStyle("-fx-background-color:BLUE");
        btn4.setStyle("-fx-background-color:BLUE");
        btn5.setStyle("-fx-background-color:BLUE");
        btn1.setStyle("-fx-background-color:BLUE");
        btn6.setStyle("-fx-background-color:BLUE");
        btn3.setStyle("-fx-background-color:BLUE");

        Label lb = new Label("Core2Web.in");
        lb.setFont(new Font(45));

        HBox hb = new HBox(20, btn1, btn2, btn3);
        hb.setAlignment(Pos.BASELINE_CENTER);
        HBox hb2 = new HBox(20, btn4, btn5, btn6);
        hb2.setAlignment(Pos.CENTER);

        VBox vb = new VBox(20, lb, hb, hb2);
        vb.setAlignment(Pos.CENTER);

        Scene sc = new Scene(vb);
        vb.setStyle("-fx-background-color:YELLOW");

        prStage.setScene(sc);

        prStage.show();
    }

}
