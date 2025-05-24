package com.example.myproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML
    private Label label;

    @FXML
    public void initialize() {
        label.setText("Hello");
        System.out.println("DashboardController initialized");
    }
}
