//package JavaFXColorPicker141;
//
////************************Controller.java**************************
//package application;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.geometry.Insets;
//import javafx.scene.control.ColorPicker;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//
//public class Controller {
//
//    @FXML
//    private Pane myPane;
//    @FXML
//    private ColorPicker myColorPicker;
//
//    public void changeColor(ActionEvent event) {
//
//        Color myColor = myColorPicker.getValue();
//        myPane.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
//
//    }
//
//    //*********************** Scene.fxml ***************************
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.ColorPicker?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.paint.Color?>
//
//
//<AnchorPane fx:id="myPane" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//   <children>
//      <ColorPicker fx:id="myColorPicker" layoutX="238.0" layoutY="188.0" onAction="#changeColor">
//         <value>
//            <Color />
//         </value>
//      </ColorPicker>
//   </children>
//</AnchorPane>
