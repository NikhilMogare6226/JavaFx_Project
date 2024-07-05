import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyWindow extends Application {

    @Override
    public void start(Stage prStage) throws Exception {

        prStage.setHeight(600);
        prStage.setWidth(800);

        Image i1 = new Image("assets/icons Language/java-script.png");
        Image i2 = new Image("assets/icons Language/python.png");
        Image i3 = new Image("assets/icons Language/java.png");

        ImageView iv1 = new ImageView(i1);
        iv1.setFitHeight(100);
        iv1.setFitWidth(100);

        ImageView iv2 = new ImageView(i2);
        iv2.setFitHeight(100);
        iv2.setFitWidth(100);

        ImageView iv3 = new ImageView(i3);
        iv3.setFitHeight(100);
        iv3.setFitWidth(100);

        Text lb1 = new Text("JavaScript");
        Label lb2 = new Label("Python");
        Label lb3 = new Label("Java");

        HBox hb1 = new HBox(10, iv1, lb1);
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb1.setStyle("-fx-background-color:BLUE");
        HBox hb2 = new HBox(10, iv2, lb2);
        hb2.setAlignment(Pos.CENTER_LEFT);
        HBox hb3 = new HBox(10, iv3, lb3);
        hb3.setAlignment(Pos.CENTER_LEFT);

        VBox vb1 = new VBox(20, hb1, hb2, hb3);
        vb1.setMaxWidth(500);
        vb1.setMaxHeight(300);

        Image i4 = new Image("assets/icons Language/nodejs.png");
        Image i5 = new Image("assets/icons Language/ReactJs.png");
        Image i6 = new Image("assets/icons Language/SpringBoot.png");

        ImageView iv4 = new ImageView(i4);
        iv4.setFitHeight(100);
        iv4.setFitWidth(100);

        ImageView iv5 = new ImageView(i5);
        iv5.setFitHeight(100);
        iv5.setFitWidth(100);

        ImageView iv6 = new ImageView(i6);
        iv6.setFitHeight(100);
        iv6.setFitWidth(100);

        Text lb4 = new Text("Node Js");
        Label lb5 = new Label("React Js");
        Label lb6 = new Label("SpringBoot");

        HBox hb4 = new HBox(10, iv4, lb4);
        hb1.setAlignment(Pos.CENTER_LEFT);
        HBox hb5 = new HBox(10, iv5, lb5);
        HBox hb6 = new HBox(10, iv6, lb6);

        VBox vb2 = new VBox(20, hb4, hb5, hb6);
        vb2.setMaxWidth(500);
        vb2.setMaxHeight(300);

        HBox parentVBox = new HBox(20, vb1, vb2);
        parentVBox.setAlignment(Pos.CENTER);

        Scene sc = new Scene(parentVBox);

        prStage.setScene(sc);
        prStage.show();
    }

}
