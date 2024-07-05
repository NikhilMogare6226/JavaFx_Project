package javaFiles.imagepage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ImagePage extends Application {

    @Override
    public void start(Stage prStage) throws Exception {
        prStage.setMaxHeight(1800);
        prStage.setMaxWidth(1000);

        Image i = new Image("/assets/image/photo.jpg");
        ImageView iv = new ImageView(i);

        iv.setFitWidth(300);
        iv.setFitWidth(200);

        iv.setPreserveRatio(true);

        // label

        Label lb = new Label("JavaFx Practical");

        // hbox
        HBox hb = new HBox(15, iv, lb);
        hb.setStyle("-fx-background-color:YELLOW");
        hb.setAlignment(Pos.CENTER);

        Group gr = new Group(hb);

        Scene sc = new Scene(gr);
        sc.setFill(Color.AQUA);

        prStage.setScene(sc);
        prStage.show();

    }

}
