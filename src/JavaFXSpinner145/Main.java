//package JavaFXSpinner145;
//
//package application;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Label;
//import javafx.scene.control.Spinner;
//import javafx.scene.control.SpinnerValueFactory;
//import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
//
//public class Controller implements Initializable{
//
//    @FXML
//    private Spinner<Integer> mySpinner;
//
//    @FXML
//    private Label myLabel;
//
//    int currentValue;
//
//    @Override
//    public void initialize(URL arg0, ResourceBundle arg1) {
//
//        SpinnerValueFactory<Integer> valueFactory =
//                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
//
//        valueFactory.setValue(1);
//
//        mySpinner.setValueFactory(valueFactory);
//
//        currentValue = mySpinner.getValue();
//
//        myLabel.setText(Integer.toString(currentValue));
//
//        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
//
//                currentValue = mySpinner.getValue();
//
//                myLabel.setText(Integer.toString(currentValue));
//
//            }
//        });
//    }
//}
//
//    <?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.geometry.Insets?>
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.control.Spinner?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="459.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<padding>
//<Insets right="10.0" />
//</padding>
//<children>
//<Spinner fx:id="mySpinner" editable="true" layoutX="155.0" layoutY="188.0" />
//<Label fx:id="myLabel" alignment="CENTER" layoutX="1.0" layoutY="97.0" prefHeight="45.0" prefWidth="459.0" text="Label">
//<font>
//<Font size="30.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
