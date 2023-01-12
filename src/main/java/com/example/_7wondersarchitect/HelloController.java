package com.example._7wondersarchitect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {
    

    @FXML
    public void initialize() {
        Game.option.startNewGame();

    }


    public void onHelloButtonClick(Stage stage) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load(), 462, 366);
        stage.setTitle("Menu");
        stage.setScene(scene1);
        stage.show();
    }

    public void onHelloButtonClick(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
            Scene scene1 = new Scene(fxmlLoader1.load(), 462, 366);
            stage.setTitle("Menu");
            stage.setScene(scene1);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}