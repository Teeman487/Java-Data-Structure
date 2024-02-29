//package JavaFXSlider143;
//
//public class Controller implements Initializable{
//
//    @FXML
//    private Label myLabel;
//
//    @FXML
//    private Slider mySlider;
//
//    int myTemperature;
//
//    @Override
//    public void initialize(URL url, ResourceBundle resources) {
//
//        myTemperature = (int) mySlider.getValue();
//        myLabel.setText(Integer.toString(myTemperature) + "°C");
//
//        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldNumber, Number newNumber) {
//
//                myTemperature = (int) mySlider.getValue();
//                myLabel.setText(Integer.toString(myTemperature) + "°C");
//
//            }
//        });
//    }
//}
//
//    <?xml version="1.0" encoding="UTF-8"?>
//
//<?import javafx.scene.control.Label?>
//<?import javafx.scene.control.Slider?>
//<?import javafx.scene.layout.AnchorPane?>
//<?import javafx.scene.text.Font?>
//
//<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="459.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.Controller">
//<children>
//<Slider fx:id="mySlider" layoutX="223.0" layoutY="32.0" majorTickUnit="10.0" minorTickCount="10" orientation="VERTICAL" prefHeight="336.0" prefWidth="14.0" showTickLabels="true" showTickMarks="true" value="50.0" />
//<Label fx:id="myLabel" layoutX="301.0" layoutY="174.0" prefHeight="53.0" prefWidth="110.0" text="Label">
//<font>
//<Font size="29.0" />
//</font>
//</Label>
//</children>
//</AnchorPane>
//
