package javaFiles.Home;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage prStage) {

        prStage.setTitle("myFirstProject");
        prStage.setHeight(1000);
        prStage.setWidth(1000);

        prStage.getIcons().add(new Image("assets/image/photo.jpg"));

        Text txt = new Text(10, 20, "Good evening");
        txt.setFont(new Font(30));
        txt.setFill(Color.WHITE);

        Text gd = new Text(1000, 30, "Have a nice day");
        gd.setFont(new Font(30));
        gd.setFill(Color.YELLOW);

        Text java = new Text("Java");
        java.setFont(new Font(40));
        java.setFill(Color.YELLOW);

        Text python = new Text("Python");
        python.setFont(new Font(40));
        python.setFill(Color.BLUE);

        Text cpp = new Text("CPP");
        cpp.setFont(new Font(40));
        cpp.setFill(Color.BLACK);

        Text web = new Text("Web");
        web.setFont(new Font(40));
        web.setFill(Color.AQUA);

        Text backend = new Text("Backend");
        backend.setFont(new Font(40));

        Text app = new Text("App");
        app.setFont(new Font(40));

        VBox vb1 = new VBox(20, java, python, cpp);
        vb1.setLayoutX(50);
        vb1.setLayoutY(100);

        VBox vb2 = new VBox(20, web, backend, app);
        vb2.setLayoutX(50);
        vb2.setLayoutY(100);

        HBox hb = new HBox(10, vb1, vb2);
        hb.setLayoutX(400);
        hb.setLayoutY(100);

        Group gr = new Group(hb, txt, gd);

        Scene scene = new Scene(gr, 1000, 1000, Color.RED);
        prStage.setScene(scene);

        prStage.show();
    }
}
