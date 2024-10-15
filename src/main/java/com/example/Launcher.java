package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LauncherGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField usernameField = new TextField();
        usernameField.setPromptText("Ingresa tu nombre");

        TextField versionField = new TextField();
        versionField.setPromptText("Selecciona la versión (Vanilla, Forge, Fabric)");

        Button launchButton = new Button("Lanzar Minecraft");
        launchButton.setOnAction(e -> {
            String username = usernameField.getText();
            String version = versionField.getText();
            launchMinecraft(username, version); // Lógica para lanzar Minecraft
        });

        VBox layout = new VBox(10, usernameField, versionField, launchButton);
        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("Minecraft Launcher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void launchMinecraft(String username, String version) {
        // Implementa la lógica para lanzar Minecraft aquí
        System.out.println("Lanzando Minecraft como " + username + " en " + version);
    }

    public static void main(String[] args) {
        launch(args);
    }
}