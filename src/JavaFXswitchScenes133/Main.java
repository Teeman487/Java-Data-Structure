//package JavaFXswitchScenes133;
//
////-------------------------------Main.java-------------------------------------
//package application;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.stage.Stage;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        try {
//
//            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
////--------------------------------SceneController.java--------------------------------------
//package application;
//
//        import java.io.IOException;
//
//        import javafx.event.ActionEvent;
//        import javafx.fxml.FXMLLoader;
//        import javafx.scene.Node;
//        import javafx.scene.Parent;
//        import javafx.scene.Scene;
//        import javafx.stage.Stage;
//
//public class SceneController {
//
//    private Stage stage;
//    private Scene scene;
//    private Parent root;
//
//    public void switchToScene1(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public void switchToScene2(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//}
//    //----------------------------------------Scene1.fxml------------------------------------------------
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Button?>
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.SceneController">
//<children>
//<Label layoutX="143.0" layoutY="14.0" text="This is scene 1">
//<font>
//<Font size="50.0" />
//</font>
//</Label>
//<Button layoutX="210.0" layoutY="178.0" mnemonicParsing="false" onAction="#switchToScene2" text="Switch to scene 2">
//<font>
//<Font size="20.0" />
//</font>
//</Button>
//</children>
//</AnchorPane>
////----------------------------------------Scene2.fxml------------------------------------------------
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Button?>
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.SceneController">
//<children>
//<Label layoutX="143.0" layoutY="14.0" text="This is scene 2">
//<font>
//<Font size="50.0" />
//</font>
//</Label>
//<Button layoutX="210.0" layoutY="178.0" mnemonicParsing="false" onAction="#switchToScene1" text="Switch to scene 1">
//<font>
//<Font size="20.0" />
//</font>
//</Button>
//</children>
//</AnchorPane>
////------------------------------------------------------------------------------------------------------
