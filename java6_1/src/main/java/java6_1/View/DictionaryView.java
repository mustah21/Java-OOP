package java6_1.View;

import java6_1.Controller.DictionaryController;
import java6_1.Model.Dictionary;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class DictionaryView extends Application {

    private Label resultLabel;
    private DictionaryController controller;

    public void updateResult(String text) {
        resultLabel.setText(text);

    }

    public void showMessage(String text) {
        resultLabel.setText(text);
    }


    public void start(Stage window) {
        Dictionary dictionary = new Dictionary();
        controller = new DictionaryController(this, dictionary);  // this would create a new dictionary everytime
        resultLabel = new Label("");
        Button addButton = new Button("Add");
        Button searchButton = new Button("Search");
        FlowPane componentGroup = new FlowPane();
        TextField search = new TextField();
        TextField addWord = new TextField();
        TextField addMeaning = new TextField();
        addWord.setPromptText(" Add word");
        addMeaning.setPromptText(" Add word meaning..");
        search.setPromptText(" Search word");
        componentGroup.setPadding(new Insets(20)); // 20px all around

        addWord.clear();
        addMeaning.clear();
        search.clear();

        componentGroup.setHgap(15);
        componentGroup.setVgap(15);
        componentGroup.getChildren().add(addWord);
        componentGroup.getChildren().add(addMeaning);

        componentGroup.getChildren().add(search);
        componentGroup.getChildren().add(addButton);
        componentGroup.getChildren().add(searchButton);
        addButton.setOnAction(event -> controller.handleAdd(addWord.getText(), addMeaning.getText()));
        searchButton.setOnAction(event -> controller.handleSearch(search.getText()));
        componentGroup.getChildren().add(resultLabel);
        resultLabel.setStyle( "-fx-font-weight: bold;" + "-fx-text-fill: green;" + "-fx-font-size: 16px;" + "-fx-border-radius: 5;"
                + "-fx-border-color: green;" + "-fx-border-width: 2;" + "-fx-padding: 5;"
        );


        Scene scene = new Scene(componentGroup, 200, 200);
        window.setTitle("Mustafa's dictionary");
        window.setScene(scene);
        window.show();

    }
}