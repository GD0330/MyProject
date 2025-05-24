package com.example.myproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    public void initialize() {
        label.setText("Hello");
        System.out.println("Close");
    }

    @FXML
    private void onCloseButtonClick() throws IOException {
        Stage Dashboard = (Stage) button.getScene().getWindow();
        Dashboard.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));

        Stage stage = new Stage();
        Scene scene1 = new Scene(fxmlLoader.load(),400,180);
        stage.setTitle("Dashboard");
        stage.setScene(scene1);
        stage.show();
    }
}
