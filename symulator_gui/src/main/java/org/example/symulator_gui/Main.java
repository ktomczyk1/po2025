package org.example.symulator_gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // --- LEWY PANEL ---
        VBox leftPanel = new VBox(15);
        leftPanel.setPadding(new Insets(10));
        leftPanel.setPrefWidth(250);
        leftPanel.setStyle("-fx-background-color: #eeeeee;");

        // Sekcja: Samochód
        TitledPane samochodPane = new TitledPane();
        samochodPane.setText("Samochód");

        GridPane samochodGrid = new GridPane();
        samochodGrid.setVgap(5);
        samochodGrid.setHgap(5);

        samochodGrid.add(new Label("Model"), 0, 0);
        samochodGrid.add(new TextField(), 0, 1);

        samochodGrid.add(new Label("Nr rejestracyjny"), 0, 2);
        samochodGrid.add(new TextField(), 0, 3);

        samochodGrid.add(new Label("Waga"), 0, 4);
        samochodGrid.add(new TextField(), 0, 5);

        samochodGrid.add(new Label("Prędkość"), 0, 6);
        samochodGrid.add(new TextField(), 0, 7);

        HBox samochodButtons = new HBox(5,
                new Button("Włącz"),
                new Button("Wyłącz"),
                new Button("Button")
        );

        samochodGrid.add(samochodButtons, 0, 8);
        samochodPane.setContent(samochodGrid);

        // Sekcja: Skrzynia Biegów
        TitledPane skrzyniaPane = new TitledPane();
        skrzyniaPane.setText("Skrzynia Biegów");

        VBox skrzyniaBox = new VBox(5);
        skrzyniaBox.getChildren().addAll(
                new Label("Nazwa"), new TextField(),
                new Label("Cena"), new TextField(),
                new Label("Waga"), new TextField(),
                new Label("Bieg"), new TextField(),
                new HBox(5, new Button("Zwiększ bieg"), new Button("Zmniejsz bieg"))
        );
        skrzyniaPane.setContent(skrzyniaBox);

        // Sekcja: Silnik
        TitledPane silnikPane = new TitledPane();
        silnikPane.setText("Silnik");

        VBox silnikBox = new VBox(5);
        silnikBox.getChildren().addAll(
                new Label("Nazwa"), new TextField(),
                new Label("Cena"), new TextField(),
                new Label("Waga"), new TextField(),
                new Label("Obroty"), new TextField(),
                new HBox(5, new Button("Dodaj gazu"), new Button("Ujmij gazu"))
        );
        silnikPane.setContent(silnikBox);

        // Sekcja: Sprzęgło
        TitledPane sprzegloPane = new TitledPane();
        sprzegloPane.setText("Sprzęgło");

        VBox sprzegloBox = new VBox(5);
        sprzegloBox.getChildren().addAll(
                new Label("Nazwa"), new TextField(),
                new Label("Cena"), new TextField(),
                new Label("Waga"), new TextField(),
                new Label("Stan"), new TextField(),
                new Button("Napnij")
        );
        sprzegloPane.setContent(sprzegloBox);

        leftPanel.getChildren().addAll(samochodPane, skrzyniaPane, silnikPane, sprzegloPane);

        // --- PRAWY PANEL (MAPA) ---
        Pane mapPane = new Pane();
        mapPane.setStyle("-fx-background-color: #99ff99;");

        Label mapaLabel = new Label("Mapa");
        mapaLabel.setLayoutX(20);
        mapaLabel.setLayoutY(20);

        Label carLabel = new Label("Car 🚗");
        carLabel.setLayoutX(20);
        carLabel.setLayoutY(50);

        mapPane.getChildren().addAll(mapaLabel, carLabel);

        // --- GÓRNY PASEK ---
        HBox topBar = new HBox(10);
        topBar.setPadding(new Insets(10));
        topBar.setAlignment(Pos.CENTER_LEFT);

        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().addAll("Samochód 1", "Samochód 2");

        Button btnAdd = new Button("Dodaj nowy");
        Button btnDel = new Button("Usuń");

        topBar.getChildren().addAll(new Label("Samochód:"), combo, btnAdd, btnDel);

        // --- UKŁAD CAŁOŚCI ---
        BorderPane root = new BorderPane();
        root.setLeft(leftPanel);
        root.setCenter(mapPane);
        root.setTop(topBar);

        Scene scene = new Scene(root, 1200, 650);
        stage.setScene(scene);
        stage.setTitle("Symulator");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
