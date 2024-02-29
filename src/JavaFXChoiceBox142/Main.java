//package JavaFXChoiceBox142;
//
//public class Controller implements Initializable{
//
//    @FXML
//    private Label myLabel;
//
//    @FXML
//    private ChoiceBox<String> myChoiceBox;
//
//    private String[] food = {"pizza","sushi","ramen"};
//
//    @Override
//    public void initialize(URL arg0, ResourceBundle arg1) {
//
//        myChoiceBox.getItems().addAll(food);
//        myChoiceBox.setOnAction(this::getFood);
//
//    }
//
//    public void getFood(ActionEvent event) {
//
//        String myFood = myChoiceBox.getValue();
//        myLabel.setText(myFood);
//    }
//
//}
//
//    <?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.ChoiceBox?>
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<children>
//<ChoiceBox fx:id="myChoiceBox" layoutX="225.0" layoutY="188.0" prefWidth="150.0" />
//<Label fx:id="myLabel" alignment="CENTER" layoutX="-2.0" layoutY="94.0" prefHeight="17.0" prefWidth="600.0" text="Select what you want to eat">
//<font>
//<Font size="28.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
//
