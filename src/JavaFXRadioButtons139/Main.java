//package JavaFXRadioButtons139;
//
//// ************* Controller.java *************
//package application;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//
//public class Controller {
//
//    @FXML
//    private Label myLabel;
//    @FXML
//    private RadioButton rButton1, rButton2, rButton3;
//
//    public void getFood(ActionEvent event) {
//
//        if(rButton1.isSelected()) {
//            myLabel.setText(rButton1.getText());
//        }
//        else if(rButton2.isSelected()) {
//            myLabel.setText(rButton2.getText());
//        }
//        else if(rButton3.isSelected()) {
//            myLabel.setText(rButton3.getText());
//        }
//
//    }
//}
//    // ************* Scene.fxml *************
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.control.RadioButton?>
//<?import javafx.scene.control.ToggleGroup?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="488.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<children>
//<RadioButton fx:id="rButton1" layoutX="14.0" layoutY="183.0" mnemonicParsing="false" onAction="#getFood" text="pizza">
//<font>
//<Font size="24.0" />
//</font>
//<toggleGroup>
//<ToggleGroup fx:id="food" />
//</toggleGroup>
//</RadioButton>
//<RadioButton fx:id="rButton2" layoutX="196.0" layoutY="183.0" mnemonicParsing="false" onAction="#getFood" text="sushi" toggleGroup="$food">
//<font>
//<Font size="24.0" />
//</font>
//</RadioButton>
//<RadioButton fx:id="rButton3" layoutX="364.0" layoutY="183.0" mnemonicParsing="false" onAction="#getFood" text="ramen" toggleGroup="$food">
//<font>
//<Font size="24.0" />
//</font>
//</RadioButton>
//<Label fx:id="myLabel" alignment="CENTER" layoutX="-1.0" layoutY="53.0" prefHeight="17.0" prefWidth="488.0" text="Select what you want to eat">
//<font>
//<Font size="36.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
//
//
