package org.example.symulator_gui;
package symulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import symulator.Samochod;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button carOn;

    @FXML
    private Button carOff;
    @FXML
    private Button gearUp;
    @FXML
    private Button gearDown;
    @FXML
    private Button addGasEngine;
    @FXML
    private Button removeGasEngine;



    @FXML
    private void offCaroff()
    {
        System.out.println("Samochod wylaczony");
    }

    @FXML
    private void onCarOn()
    {
        System.out.println("Samochod wlaczony");
    }

    @FXML
    public void onGearUp() {
        System.out.println("Gear up");
    }

    @FXML
    public void onGearDown() {
        System.out.println("Gear down");
    }
    @FXML
    public void addGasEngine() {
        System.out.println("Adding gas");
    }
    @FXML
    public void removeGasEngine() {
        System.out.println("Removing gas");
    }
}
