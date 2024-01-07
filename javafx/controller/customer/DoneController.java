package javafx.controller.customer;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class DoneController {
    public void back(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../../../javafx/fxml/homePage.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));

    }

    public void goTo(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../../fxml/car/edit.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
}
