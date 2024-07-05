package javaFiles;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BUttonAssignment2 extends Application {
    int cnt = 0;

    @Override
    public void start(Stage prStage) throws Exception {
        prStage.setWidth(1000);
        prStage.setHeight(1920);

        // Month
        /*
         * Button b1 = new Button("januwary");
         * Button b2 = new Button("februwary");
         * Button b3 = new Button("March");
         * Button b4 = new Button("April");
         * Button b5 = new Button("May");
         * Button b6 = new Button("June");
         * Button b7 = new Button("July");
         * Button b8 = new Button("August");
         * Button b9 = new Button("September");
         * Button b10 = new Button("October");
         * Button b11 = new Button("November");
         * Button b12 = new Button("December");
         */
        // Square and Squareroot
        /*
         * TextField tf = new TextField();
         * tf.setMaxWidth(180);
         * Label lb1 = new Label();
         * 
         * Button b1 = new Button("Square");
         * b1.setOnAction(new EventHandler<ActionEvent>() {
         * 
         * @Override
         * public void handle(ActionEvent event) {
         * int num = Integer.parseInt(tf.getText());
         * int sq = num * num;
         * lb1.setText("Square is" + sq);
         * 
         * }
         * 
         * });
         * Button b2Button = new Button("Square root");
         * b2Button.setOnAction(new EventHandler<ActionEvent>() {
         * 
         * @Override
         * public void handle(ActionEvent event) {
         * int num = Integer.parseInt(tf.getText());
         * double sq = Math.sqrt(num);
         * lb1.setText("Square root is " + sq);
         * 
         * }
         * 
         * });
         */

        // Login Page

        /*
         * 
         * Label l1 = new Label("Login Page");
         * l1.setFont(new Font(45));
         * 
         * Label l2 = new Label();
         * l2.setFont(new Font(30));
         * l2.setTextFill(Color.AZURE);
         * 
         * TextField tf = new TextField();
         * PasswordField pf = new PasswordField();
         * 
         * Button btn = new Button("Login");
         * btn.setStyle("-fx-background-color:YELLOW");
         * btn.setOnAction(new EventHandler<ActionEvent>() {
         * 
         * @Override
         * public void handle(ActionEvent event) {
         * if (tf.getText().equals("Core2web") && pf.getText().equals("1234")) {
         * l2.setText("Welcome");
         * l2.setTextFill(Color.BLACK);
         * 
         * } else {
         * l2.setText("Error");
         * l2.setTextFill(Color.BLACK);
         * 
         * }
         * }
         * });
         */
        // Color click

        Button bn = new Button("Click");
        VBox vb = new VBox(bn);
        vb.setAlignment(Pos.CENTER);
        bn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                /*
                 * cnt++;
                 * switch (cnt) {
                 * 
                 * case 1:
                 * vb.setStyle("-fx-background-color: MAGENTA");
                 * break;
                 * case 2:
                 * vb.setStyle("-fx-background-color: MAROON");
                 * break;
                 * case 3:
                 * vb.setStyle("-fx-background-color: ORANGE");
                 * break;
                 * case 4:
                 * vb.setStyle("-fx-background-color: YELLOW");
                 * break;
                 * }
                 * if (cnt == 4) {
                 * cnt = 0;
                 */

                // logic 2

                String s[] = new String[] { "MAGENTA", "MAROON", "BLUE", "GREEN", "YELLOW", "RED" };
                vb.setStyle("-fx-background-color: " + s[cnt]);
                if (cnt == s.length) {
                    cnt = 0;
                }
                cnt += 1;
            }

        });

        Scene sc = new Scene(vb);
        prStage.setScene(sc);
        prStage.show();
    }
}
