//package JavaFX_CheckBox138;
//
////*********************************************************************************
//// JavaFX CheckBox
////*********************************************************************************
//
////***********************************Scene.fxml**********************************
//<?xml version="1.0" encoding="UTF-8"?>
//
//        <?import javafx.scene.control.CheckBox?>
//        <?import javafx.scene.control.Label?>
//        <?import javafx.scene.image.Image?>
//        <?import javafx.scene.image.ImageView?>
//        <?import javafx.scene.layout.AnchorPane?>
//        <?import javafx.scene.text.Font?>
//
//
//        <AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="371.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//        <children>
//        <CheckBox fx:id="myCheckBox" layoutX="125.0" layoutY="308.0" mnemonicParsing="false" onAction="#change" text="ON/OFF">
//        <font>
//        <Font size="22.0" />
//        </font>
//        </CheckBox>
//        <Label fx:id="myLabel" layoutX="162.0" layoutY="181.0" text="OFF">
//        <font>
//        <Font size="27.0" />
//        </font>
//        </Label>
//        <ImageView fx:id="myImageView" fitHeight="150.0" fitWidth="132.0" layoutX="120.0" layoutY="14.0" pickOnBounds="true" preserveRatio="true">
//        <image>
//        <Image url="@lightbulb2.png" />
//        </image>
//        </ImageView>
//        </children>
//        </AnchorPane>
//
////********************************Controller.java**********************************
//        package application;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//
//public class Controller {
//
//    @FXML
//    private CheckBox myCheckBox;
//    @FXML
//    private Label myLabel;
//    @FXML
//    private ImageView myImageView;
//
//    Image myImage1 = new Image(getClass().getResourceAsStream("lightbulb1.png"));
//    Image myImage2 = new Image(getClass().getResourceAsStream("lightbulb2.png"));
//
//    public void change(ActionEvent event) {
//
//        if(myCheckBox.isSelected()) {
//            myLabel.setText("ON");
//            myImageView.setImage(myImage1);
//        }
//        else {
//            myLabel.setText("OFF");
//            myImageView.setImage(myImage2);
//        }
//    }
//}
