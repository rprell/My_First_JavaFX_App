import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.ProgressBar;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ChoiceBox;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        // HERNANDEZ DEFAULT (3 of them)
        Label label1 = new Label("Look at thes JvaFX");
        Label label2 = new Label("This is so weird");
        Label label3 = new Label("We'll start with Labels.");
        Label label4 = new Label("We'll start with Button.");
        label1.setFont(new Font("Arial", 24));
        Button pressMe = new Button("Press Me!");
        pressMe.setOnAction(actionEvent ->  {
            label2.setText("We did it!");
        });
        TextField typeHere = new TextField("Please type here!");
        typeHere.setOnAction(actionEvent ->  {
            label3.setText(typeHere.getText());
        });


        // PROGRESS BAR
        ProgressBar progressBar = new ProgressBar(0);

        // Create a button to increment the progress
        Button button = new Button("XP");
        button.setOnAction(event -> {
            progressBar.setProgress(progressBar.getProgress() + 0.1);
        });
        // Create a layout and add the progress bar and button
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(progressBar, button);


        // COLOR PICKER
        ColorPicker colorPicker = new ColorPicker();
            Color value = colorPicker.getValue();
            VBox vBox3 = new VBox(colorPicker);
            //HBox hBox = new HBox(button1, button2);


        //SLIDER
        Slider slider = new Slider(0, 100, 0);
        VBox vBox4 = new VBox(slider);

        //DATE PICKER
        DatePicker datePicker = new DatePicker();
        HBox hbox1 = new HBox(datePicker);

        //RADIO BUTTON
        RadioButton radioButton1 = new RadioButton("Left");
        HBox hbox2 = new HBox(radioButton1);


        //MENU BUTTON
        MenuItem menuItem1 = new MenuItem("Easy Mode");
        MenuItem menuItem2 = new MenuItem("Medium Mode");
        MenuItem menuItem3 = new MenuItem("Hard Mode");
        MenuButton menuButton = new MenuButton("Difficulty", null, menuItem1, menuItem2, menuItem3);
        HBox hbox3 = new HBox(menuButton);

        //CHOICE BOX
        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().add("Medium");
        choiceBox.getItems().add("Rare");
        choiceBox.getItems().add("Medium Rare");

        HBox hbox4 = new HBox(choiceBox);

        //LAYOUT CODE
        VBox vBox1 = new VBox(label2, label3, label4);
        vBox1.setAlignment(Pos.BASELINE_CENTER);
        vBox1.setSpacing(20);
        VBox vBox2 = new VBox(label1, pressMe, typeHere);
        HBox myHbox = new HBox(40, vBox2, vBox1, layout, vBox3, vBox4, hbox1, hbox2, hbox3, hbox4);
        Scene scene = new Scene(myHbox, 1000, 1000);




        primaryStage.setTitle("My First JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}