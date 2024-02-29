package JavaFXEventHandlingUsingSceneBuilder131;

//----------------------Main.java----------------------
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//
//
//    //----------------------Main.fxml----------------------
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Button?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.shape.Circle?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<children>
//<Button layoutX="285.0" layoutY="14.0" mnemonicParsing="false" onAction="#up" text="UP" />
//<Button layoutX="534.0" layoutY="188.0" mnemonicParsing="false" onAction="#right" text="RIGHT" />
//<Button layoutX="274.0" layoutY="361.0" mnemonicParsing="false" onAction="#down" text="DOWN" />
//<Button layoutX="14.0" layoutY="188.0" mnemonicParsing="false" onAction="#left" text="LEFT" />
//<Circle fx:id="myCircle" fill="DODGERBLUE" layoutX="301.0" layoutY="201.0" radius="100.0" stroke="BLACK" strokeType="INSIDE" />
//</children>
//</AnchorPane>
//
//
////----------------------Controller.java----------------------
//        package application;
//
//        import javafx.event.ActionEvent;
//        import javafx.fxml.FXML;
//        import javafx.scene.shape.Circle;
//
//
//public class Controller {
//
//    @FXML
//    private Circle myCircle;
//    private double x;
//    private double y;
//
//    public void up(ActionEvent e) {
//        //System.out.println("UP");
//        myCircle.setCenterY(y-=10);
//    }
//    public void down(ActionEvent e) {
//        //System.out.println("DOWN");
//        myCircle.setCenterY(y+=10);
//    }
//    public void left(ActionEvent e) {
//        //System.out.println("LEFT");
//        myCircle.setCenterX(x-=10);
//    }
//    public void right(ActionEvent e) {
//        //System.out.println("RIGHT");
//        myCircle.setCenterX(x+=10);
//    }
//
//}

