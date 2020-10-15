package Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {

        VBox box_main = new VBox();
        box_main.setPadding(new Insets(20));
        box_main.setSpacing(10);

        Label display = new Label("0");
        display.setMinHeight(50);
        display.setStyle("-fx-font-size:45");
        box_main.getChildren().addAll(display);

        GridPane grid = new GridPane();


        ArrayList<String> buttons = new ArrayList<String>();

        box_main.getChildren().addAll(grid);

        Scene scene = new Scene(box_main);
        stage.setTitle("Calculater");
        stage.setScene(scene);
        stage.setWidth(550);
        stage.setHeight(650);
        stage.show();
    }}
