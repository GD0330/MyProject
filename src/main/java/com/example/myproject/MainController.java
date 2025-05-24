package com.example.myproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button button;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private Label welcomeLabel;
    @FXML
    private Label usernameLabel;
    @FXML
    private Label passwordLabel;

    @FXML
    public void initialize() {
        System.out.println("Open");
    }
    @FXML
    protected void onEnterButtonClick() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("GD")&&password.equals("123four")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle("Dashboard");
            stage.show();

            Stage Main = (Stage) button.getScene().getWindow();
            Main.close();
        } else {
            welcomeLabel.setText("Wrong username or password!");
        }
    }
}