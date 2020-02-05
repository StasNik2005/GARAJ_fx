package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField price, speed, god;
    @FXML
    TextArea info;
    Vehicle vehicle;

    public void buttonCalculateClick(ActionEvent actionEvent) {
       // god.setText((Double.parseDouble(price.getText()) + Double.parseDouble(speed.getText()))+"");
        vehicle = new Vehicle(Float.parseFloat(price.getText()), Integer.parseInt(speed.getText()), Integer.parseInt(god.getText()));
        info.setText(vehicle.toString());
    }
}
