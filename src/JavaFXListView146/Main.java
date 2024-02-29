//package JavaFXListView146;
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
//import javafx.scene.control.ListView;
//import javafx.scene.control.Spinner;
//import javafx.scene.control.SpinnerValueFactory;
//import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
//
//public class Controller implements Initializable{
//
//    @FXML
//    private ListView<String> myListView;
//
//    @FXML
//    private Label myLabel;
//
//    String[] food = {"pizza","sushi","ramen"};
//
//    String currentFood;
//
//    @Override
//    public void initialize(URL arg0, ResourceBundle arg1) {
//
//        myListView.getItems().addAll(food);
//
//        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//
//            @Override
//            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
//
//                currentFood = myListView.getSelectionModel().getSelectedItem();
//
//                myLabel.setText(currentFood);
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
//<?import javafx.scene.control.ListView?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="459.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<padding>
//<Insets right="10.0" />
//</padding>
//<children>
//<ListView fx:id="myListView" layoutX="130.0" layoutY="100.0" prefHeight="200.0" prefWidth="200.0" />
//<Label fx:id="myLabel" alignment="CENTER" layoutY="33.0" prefHeight="43.0" prefWidth="459.0" text="Select a food">
//<font>
//<Font size="29.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
//
//
