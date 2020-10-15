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



        EventHandler<MouseEvent> btn_handler =  new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Object node = e.getSource();
                Button btn = (Button) node;
                String s = btn.getText();

            }};

        GridPane grid = new GridPane();

        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("Convert C -> F");
        buttons.add("Convert F -> C");


        for (String s : buttons)
        {
            Button b = new Button();
            int index = buttons.indexOf(s);
            grid.add(b, index % 3, index / 3);
            b.setText(s);
            b.setMinWidth(100);
            b.setMaxHeight(100);
            b.setStyle("-fx-font-size:20;-fx-font-weight: bold");
            b.addEventHandler(MouseEvent.MOUSE_CLICKED, btn_handler);
        }


        TextField textField1 = new TextField();
        Text t1 = new Text("Grad Celsius");
        TextField textField2 = new TextField();
        Text t2 = new Text("Grad Fahrenheit");
        t1.setStyle("-fx-font-size:20;-fx-font-weight: bold");
        t2.setStyle("-fx-font-size:20;-fx-font-weight: bold");

        box_main.getChildren().addAll(t1,textField1,t2,textField2,grid);

        Scene scene = new Scene(box_main);
        stage.setTitle("Calculater");
        stage.setScene(scene);
        stage.setWidth(395);
        stage.setHeight(300);
        stage.show();
    }}
