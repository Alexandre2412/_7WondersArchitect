package com.example._7wondersarchitect;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {  //Création de la 1ère page
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("démarrage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 611, 302);
        stage.setTitle("Chargement ...");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }
}