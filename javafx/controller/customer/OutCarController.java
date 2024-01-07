package javafx.controller.customer;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class OutCarController {

    public void goTo(ActionEvent actionEvent) {

    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../../../javafx/fxml/homePage.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

}
