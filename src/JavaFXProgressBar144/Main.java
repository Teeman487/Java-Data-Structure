//package JavaFXProgressBar144;
//
//package application;
//
//import java.math.BigDecimal;
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.ProgressBar;
//import javafx.scene.control.Slider;
//
//public class Controller implements Initializable{
//
//    @FXML
//    private ProgressBar myProgressBar;
//
//    @FXML
//    private Button myButton;
//
//    @FXML
//    private Label myLabel;
//
//    //The BigDecimal class gives its user complete control over rounding behavior
//    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));
//
//    @Override
//    public void initialize(URL arg0, ResourceBundle arg1) {
//
//        myProgressBar.setStyle("-fx-accent: #00FF00;");
//
//    }
//
//    public void increaseProgress() {
//
//        if(progress.doubleValue() < 1) {
//            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
//            //System.out.println(progress.doubleValue());
//            myProgressBar.setProgress(progress.doubleValue());
//            myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 100)) + "%");
//        }
//    }
//}
//
//    <?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.geometry.Insets?>
//<?import javafx.scene.control.Button?>
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.control.ProgressBar?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="459.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<padding>
//<Insets right="10.0" />
//</padding>
//<children>
//<ProgressBar fx:id="myProgressBar" layoutX="37.0" layoutY="173.0" prefHeight="54.0" prefWidth="386.0" progress="0.0" />
//<Button fx:id="myButton" layoutX="204.0" layoutY="292.0" mnemonicParsing="false" onAction="#increaseProgress" text="Button" />
//<Label fx:id="myLabel" alignment="CENTER" layoutX="185.0" layoutY="83.0" text="Label">
//<font>
//<Font size="38.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
