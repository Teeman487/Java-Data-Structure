//package JavaFXLogout_exitButton135;
//
////--------------------------------------------------------------------------------------------------
//// JavaFX Logout button
//// -------------------------------------------------------------------------------------------------
//package application;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.stage.Stage;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.Alert.AlertType;
//
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        try {
//
//            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//
//            stage.setOnCloseRequest(event -> {
//                event.consume();
//                logout(stage);
//            });
//
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void logout(Stage stage){
//
//        Alert alert = new Alert(AlertType.CONFIRMATION);
//        alert.setTitle("Logout");
//        alert.setHeaderText("You're about to logout!");
//        alert.setContentText("Do you want to save before exiting?");
//
//        if (alert.showAndWait().get() == ButtonType.OK){
//            System.out.println("You successfully logged out");
//            stage.close();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//    //----------------------------------------Scene.fxml-----------------------------------------
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Button?>
//<?import javafx.scene.layout.AnchorPane?>
//
//
//<AnchorPane fx:id="scenePane" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<children>
//<Button fx:id="logoutButton" layoutX="274.0" layoutY="188.0" mnemonicParsing="false" onAction="#logout" text="Logout" />
//</children>
//</AnchorPane>
////-------------------------------------Controller.java----------------------------------------
//        package application;
//
//        import javafx.event.ActionEvent;
//        import javafx.fxml.FXML;
//        import javafx.scene.control.Alert;
//        import javafx.scene.control.Alert.AlertType;
//        import javafx.scene.control.Button;
//        import javafx.scene.control.ButtonType;
//        import javafx.scene.layout.AnchorPane;
//        import javafx.stage.Stage;
//
//public class Controller {
//
//    @FXML
//    private Button logoutButton;
//    @FXML
//    private AnchorPane scenePane;
//
//    Stage stage;
//
//    public void logout(ActionEvent event) {
//
//        Alert alert = new Alert(AlertType.CONFIRMATION);
//        alert.setTitle("Logout");
//        alert.setHeaderText("You're about to logout!");
//        alert.setContentText("Do you want to save before exiting?: ");
//
//        if(alert.showAndWait().get() == ButtonType.OK){
//            stage = (Stage) scenePane.getScene().getWindow();
//            System.out.println("You successfully logged out!");
//            stage.close();
//        }
//
//    }
//}
//--------------------------------------------------------------------------------------------------

