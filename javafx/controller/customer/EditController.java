package javafx.controller.customer;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class EditController {


    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../../../javafx/fxml/car/doneList.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void submit(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../../../javafx/fxml/car/doneList.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
}
