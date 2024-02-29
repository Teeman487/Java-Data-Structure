//package JavaFXMediaView153;
//
//package application;
//
//import java.io.File;
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//import javafx.util.Duration;
//
//public class Controller implements Initializable{
//
//    @FXML
//    private MediaView mediaView;
//
//    @FXML
//    private Button playButton, pauseButton, resetButton;
//
//    private File file;
//    private Media media;
//    private MediaPlayer mediaPlayer;
//
//    @Override
//    public void initialize(URL arg0, ResourceBundle arg1) {
//
//        file = new File("MarioKart.mp4");
//        media = new Media(file.toURI().toString());
//        mediaPlayer = new MediaPlayer(media);
//        mediaView.setMediaPlayer(mediaPlayer);
//
//    }
//
//    public void playMedia() {
//
//        mediaPlayer.play();
//    }
//
//    public void pauseMedia() {
//
//        mediaPlayer.pause();
//    }
//
//    public void resetMedia() {
//
//        if(mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
//            mediaPlayer.seek(Duration.seconds(0.0));
//        }
//    }
//}
//
//    <?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.geometry.Insets?>
//<?import javafx.scene.control.Button?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.media.MediaView?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="500.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<padding>
//<Insets right="10.0" />
//</padding>
//<children>
//<MediaView fx:id="mediaView" fitHeight="300.0" fitWidth="500.0" />
//<Button fx:id="pauseButton" layoutX="224.0" layoutY="327.0" mnemonicParsing="false" onAction="#pauseMedia" text="PAUSE" />
//<Button fx:id="playButton" layoutX="133.0" layoutY="327.0" mnemonicParsing="false" onAction="#playMedia" text="PLAY" />
//<Button fx:id="resetButton" layoutX="318.0" layoutY="327.0" mnemonicParsing="false" onAction="#resetMedia" text="RESET" />
//</children>
//</AnchorPane>
//
//
