package java6_2.View;

import java6_2.Controller.ConverterController;
import java6_2.Model.Converter;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class CurrencyView extends Application {
    private Label resultLabel = new Label("");
    private ConverterController controller;
    public TextField amountTwo = new TextField();
    private TextField amountOne = new TextField();


    public void showMessage(String text) {
        resultLabel.setText(text);
    }

    public void updateAmountTwo(int text) { // changed this to int for a neater result
        amountTwo.setText(String.valueOf(text));
    }
    public void updateAmountOne(int text) {
        amountOne.setText(String.valueOf(text));
    }

    public void start(Stage window) {
        this.controller = new ConverterController(this, new Converter());

        Button clearBtn = new Button("Clear");
        Button convertButton = new Button("Convert");
        convertButton.setPrefWidth(315);

        amountOne.setPromptText("Enter amount");
        amountTwo.setPromptText("Enter amount");

        amountOne.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().matches("\\d*(\\.\\d*)?")) {
                return change;
            }
            return null;
        }));
        amountTwo.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().matches("\\d*(\\.\\d*)?")) {
                return change;
            }
            return null;
        }));

        ComboBox<String> comboBox1 = new ComboBox<>();
        ComboBox<String> comboBox2 = new ComboBox<>();
        comboBox1.getItems().addAll("USD", "EUR", "GBP");
        comboBox1.setValue("USD");
        comboBox2.getItems().addAll("USD", "EUR", "GBP");
        comboBox2.setValue("EUR");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(15);
        gridPane.setVgap(10);

        gridPane.add(amountOne, 0, 1);
        gridPane.add(comboBox1, 0, 2);
        gridPane.add(amountTwo, 1, 1);
        gridPane.add(comboBox2, 1, 2);
        gridPane.add(resultLabel, 0, 5);


        GridPane.setColumnSpan(convertButton, 6);
        clearBtn.setOnAction(event -> {
            amountOne.setText("");
            amountTwo.setText("");
        });
        convertButton.setOnAction(event -> {
            if (!amountOne.getText().isEmpty()) {
                controller.handleConvert(
                        Double.parseDouble(amountOne.getText()),
                        comboBox1.getValue(),
                        comboBox2.getValue()
                );
            } else if (!amountTwo.getText().isEmpty()) {
                controller.handleConvert(
                        Double.parseDouble(amountTwo.getText()),
                        comboBox1.getValue(),
                        comboBox2.getValue()
                );
            }
        });

        gridPane.add(convertButton, 0, 4);
        gridPane.add(clearBtn, 5, 4);

        Scene scene = new Scene(gridPane, 430, 300);
        window.setTitle("Currency Converter");
        window.setScene(scene);
        window.show();

    }
}
