package org.example.guigui;
import symulator.Samochod;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class HelloController {

    // ====== GÓRA ======
    @FXML private ComboBox<?> carComboBox;
    @FXML private Button addCarButton;
    @FXML private Button removeCarButton;

    // ====== SAMOCHÓD ======
    @FXML private TextField modelTextField;
    @FXML private TextField registrationTextField;
    @FXML private TextField weightTextField;
    @FXML private TextField velocityTextField;

    @FXML private Button startButton;
    @FXML private Button stopButton;
    @FXML private Button extraButton;

    // ====== SKRZYNIA BIEGÓW ======
    @FXML private TextField gearNameTextField;
    @FXML private TextField gearPriceTextField;
    @FXML private TextField gearWeightTextField;
    @FXML private TextField currentGearTextField;

    @FXML private Button gearUpButton;
    @FXML private Button gearDownButton;

    // ====== SILNIK ======
    @FXML private TextField engineNameTextField;
    @FXML private TextField enginePriceTextField;
    @FXML private TextField engineWeightTextField;
    @FXML private TextField rpmTextField;

    @FXML private Button addGasButton;
    @FXML private Button removeGasButton;

    // ====== SPRZĘGŁO ======
    @FXML private TextField clutchNameTextField;
    @FXML private TextField clutchPriceTextField;
    @FXML private TextField clutchWeightTextField;
    @FXML private TextField clutchStateTextField;

    @FXML private Button clutchActionButton;

    // ====== METODY OBSŁUGI ZDARZEŃ ======

    @FXML
    private void onAddCarButton() {
        System.out.println("dodaj nowe auto");
    }

    @FXML
    private void onRemoveCarButton() {
        System.out.println("usun auto");
    }

    @FXML
    private void onStartButton() {
        System.out.println("Samochod wlaczony");
    }

    @FXML
    private void onStopButton() {
        System.out.println("Samochod wylaczony");
    }

    @FXML
    private void onExtraButton() {
        System.out.println("extrabutton");
    }

    @FXML
    private void onGearUpButton() {
        System.out.println("Zwieksz bieg");
    }

    @FXML
    private void onGearDownButton() {
        System.out.println("Zmniejsz bieg");
    }

    @FXML
    private void onAddGasButton() {
        System.out.println("Dodaj gazu");
    }

    @FXML
    private void onRemoveGasButton() {
        System.out.println("nie dodawaj gazu");
    }

    @FXML
    private void onClutchActionButton() {
        System.out.println("sprzeglo nacisniete");
    }
}
