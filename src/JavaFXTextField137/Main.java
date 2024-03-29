//package JavaFXTextField137;
//
////**********************************************************************************
//// JavaFX TextField validate user input
////**********************************************************************************
//
////***********************************Scene.fxml**********************************
//<?xml version="1.0" encoding="UTF-8"?>
//
//        <?import javafx.scene.control.Button?>
//        <?import javafx.scene.control.Label?>
//        <?import javafx.scene.control.TextField?>
//        <?import javafx.scene.layout.AnchorPane?>
//        <?import javafx.scene.text.Font?>
//
//        <AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="349.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//        <children>
//        <TextField fx:id="myTextField" layoutX="51.0" layoutY="174.0" prefHeight="53.0" prefWidth="248.0" promptText="ex. 21">
//        <font>
//        <Font size="17.0" />
//        </font>
//        </TextField>
//        <Button fx:id="myButton" layoutX="130.0" layoutY="250.0" mnemonicParsing="false" onAction="#submit" prefHeight="53.0" prefWidth="90.0" text="submit" />
//        <Label alignment="CENTER" contentDisplay="TOP" layoutX="94.0" layoutY="109.0" prefHeight="53.0" prefWidth="163.0" text="Enter your age">
//        <font>
//        <Font size="22.0" />
//        </font>
//        </Label>
//        <Label fx:id="myLabel" alignment="CENTER" layoutX="40.0" layoutY="14.0" prefHeight="69.0" prefWidth="270.0" text="Welcome!">
//        <font>
//        <Font size="21.0" />
//        </font>
//        </Label>
//        </children>
//        </AnchorPane>
////********************************Controller.java**********************************
//        package application;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//
//public class Controller {
//
//    @FXML
//    private Label myLabel;
//    @FXML
//    private TextField myTextField;
//    @FXML
//    private Button myButton;
//
//    int age;
//
//    public void submit(ActionEvent event) {
//
//        try {
//            age = Integer.parseInt(myTextField.getText());
//
//            if(age >= 18) {
//                myLabel.setText("You are now signed up!");
//            }
//            else {
//                myLabel.setText("You must be 18+");
//            }
//        }
//        catch (NumberFormatException e){
//            myLabel.setText("enter only numbers plz");
//        }
//        catch (Exception e) {
//            myLabel.setText("error");
//        }
//    }
//}
////**********************************************************************************
