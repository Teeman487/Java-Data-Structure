//package JavaFXcommunicationBetweenControllers134;
////----------------------------------------Main.java-------------------------------------------
//package application;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.stage.Stage;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//
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
//    //----------------------------------------Scene1.fxml----------------------------------------
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Button?>
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.control.TextField?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Scene1Controller">
//<children>
//<TextField fx:id="nameTextField" layoutX="226.0" layoutY="188.0" />
//<Button fx:id="loginButton" layoutX="274.0" layoutY="246.0" mnemonicParsing="false" onAction="#login" text="login" />
//<Label layoutX="81.0" layoutY="183.0" text="username:">
//<font>
//<Font size="20.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
//
////----------------------------------------Scene2.fxml----------------------------------------
//<?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Scene2Controller">
//<children>
//<Label fx:id="nameLabel" layoutX="14.0" layoutY="14.0" text="Hello: ">
//<font>
//<Font size="30.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
//
////---------------------------------Scene1Controller.java----------------------------------
//        package application;
//
//        import java.io.IOException;
//
//        import javafx.event.ActionEvent;
//        import javafx.fxml.FXML;
//        import javafx.fxml.FXMLLoader;
//        import javafx.scene.Node;
//        import javafx.scene.Parent;
//        import javafx.scene.Scene;
//        import javafx.scene.control.TextField;
//        import javafx.stage.Stage;
//
//public class Scene1Controller {
//
//    @FXML
//    TextField nameTextField;
//
//    private Stage stage;
//    private Scene scene;
//    private Parent root;
//
//    public void login(ActionEvent event) throws IOException {
//
//        String username = nameTextField.getText();
//
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
//        root = loader.load();
//
//        Scene2Controller scene2Controller = loader.getController();
//        scene2Controller.displayName(username);
//
//        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//
//    }
//}
////---------------------------------Scene2Controller.java----------------------------------
//package application;
//
//        import javafx.fxml.FXML;
//        import javafx.scene.control.Label;
//
//public class Scene2Controller {
//
//    @FXML
//    Label nameLabel;
//
//    public void displayName(String username) {
//        nameLabel.setText("Hello: " + username);
//    }
//
//}
////--------------------------------------------------------------------------------------------------
