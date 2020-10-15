package Main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.nio.BufferUnderflowException;
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


        TextField textField1 = new TextField();
        Text t1 = new Text("Grad Celsius");
        TextField textField2 = new TextField();
        Text t2 = new Text("Grad Fahrenheit");
        t1.setStyle("-fx-font-size:20;-fx-font-weight: bold");
        t2.setStyle("-fx-font-size:20;-fx-font-weight: bold");

        EventHandler<MouseEvent> btn_handler1 =  new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                int a = Integer.parseInt(textField1.getText());
                int b = (a - 32) * 5/9;
                textField2.setText(String.valueOf(b));

            }};

        EventHandler<MouseEvent> btn_handler2 =  new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

            }};

        Button b1 = new Button();
        Button b2 = new Button();
        b1.setText("Convert C -> F");
        b2.setText("Convert F -> C");
        b1.setMinWidth(25);
        b1.setMinHeight(25);
        b2.setMinWidth(25);
        b2.setMinHeight(25);
        b1.setStyle("-fx-font-size:15;-fx-font-weight: bold");
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, btn_handler1);
        b2.setStyle("-fx-font-size:15;-fx-font-weight: bold");
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, btn_handler2);

        box_main.getChildren().addAll(t1,textField1,t2,textField2,b1,b2);

        Scene scene = new Scene(box_main);
        stage.setTitle("Converter");
        stage.setScene(scene);
        stage.setWidth(395);
        stage.setHeight(300);
        stage.show();
    }}
