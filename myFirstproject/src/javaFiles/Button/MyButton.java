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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyButton extends Application {

    @Override
    public void start(Stage prStage) throws Exception {
        prStage.setTitle("My Button");
        prStage.setHeight(1920);
        prStage.setWidth(1200);

        TextField tf = new TextField();
        tf.setMaxWidth(200);

        PasswordField ps = new PasswordField();
        ps.setMaxHeight(200);
        ps.setMaxWidth(200);

        Label lb1 = new Label();
        Label lb2 = new Label();

        Button btn = new Button("Show");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println(tf.getText());
                System.out.println(ps.getText());

                lb1.setText(tf.getText());
                lb2.setText(ps.getText());

            }

        });

        VBox vb = new VBox(20, tf, ps, btn, lb1, lb2);
        vb.setStyle("-fx-background-color:AQUA");
        vb.setAlignment(Pos.CENTER);
        vb.setMaxHeight(200);
        vb.setMaxWidth(200);
        Scene sc = new Scene(vb, 1000, 1000);

        prStage.setScene(sc);
        prStage.show();
    }

}
