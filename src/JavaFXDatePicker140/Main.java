//package JavaFXDatePicker140;
//
//// ************ Controller.java ************
//package application;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.DatePicker;
//import javafx.scene.control.Label;
//
//public class Controller {
//
//    @FXML
//    private DatePicker myDatePicker;
//    @FXML
//    private Label myLabel;
//
//    public void getDate(ActionEvent event) {
//
//        LocalDate myDate = myDatePicker.getValue();
//        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
//        myLabel.setText(myFormattedDate);
//    }
//}
//
//    <?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.DatePicker?>
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<children>
//<DatePicker fx:id="myDatePicker" layoutX="213.0" layoutY="142.0" onAction="#getDate" promptText="Enter a date" />
//<Label fx:id="myLabel" alignment="CENTER" layoutY="47.0" prefHeight="17.0" prefWidth="600.0" text="Label">
//<font>
//<Font size="34.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
