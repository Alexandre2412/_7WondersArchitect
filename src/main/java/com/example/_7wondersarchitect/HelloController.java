package com.example._7wondersarchitect;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;


public class HelloController {

    @FXML
    private static Slider numberplayers;
    static int nombrejoueurs;
    private int compteur = 2;
    @FXML
    private TextField namePlayer;
    @FXML
    private CheckBox alexandrieCheckBox, babyloneCheckBox, epheseCheckBox, gizehCheckBox, halicarnasseCheckBox, olympieCheckBox, rhodesCheckBox;
    @FXML
    private Button joueur2ID, lancementBoutonID;
    @FXML
    private ImageView cartewonder1, cartewonder2;
    @FXML
    private ImageView alexandrie1, babylone1, ephese1, gizeh1, halicarnasse1, olympie1, rhodes1;
    @FXML
    private ImageView alexandrieWonder1, babyloneWonder1, epheseWonder1, gizehWonder1, halicarnasseWonder1, olympieWonder1, rhodesWonder1;
    @FXML
    private ImageView alexandrieWonder2, babyloneWonder2, epheseWonder2, gizehWonder2, halicarnasseWonder2, olympieWonder2, rhodesWonder2;
    @FXML
    private ImageView alexandrieDeck1, babyloneDeck1, epheseDeck1, gizehDeck1, halicarnasseDeck1, olympieDeck1, rhodesDeck1;
    @FXML
    private ImageView alexandrieDeck2, babyloneDeck2, epheseDeck2, gizehDeck2, halicarnasseDeck2, olympieDeck2, rhodesDeck2;
    /*
    =============================================================================================================
    */

    public void onHelloButtonClick(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 462, 366);
            stage.setTitle("Menu");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joueur1(ActionEvent event) {

        try {
                Stage stage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu2.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 1000, 500);
                stage.setTitle("Joueur 1");
                stage.setScene(scene);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();

        }       catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joueur2() {
        if (alexandrieCheckBox.isSelected()) {
            alexandrieCheckBox.setVisible(false);
            alexandrie1.setVisible(false);
        }
        if (babyloneCheckBox.isSelected()) {
            babyloneCheckBox.setVisible(false);
            babylone1.setVisible(false);
        }
        if (epheseCheckBox.isSelected()) {
            epheseCheckBox.setVisible(false);
            ephese1.setVisible(false);
        }
        if (gizehCheckBox.isSelected()) {
            gizehCheckBox.setVisible(false);
            gizeh1.setVisible(false);
        }
        if (halicarnasseCheckBox.isSelected()) {
            halicarnasseCheckBox.setVisible(false);
            halicarnasse1.setVisible(false);
        }
        if (olympieCheckBox.isSelected()) {
            olympieCheckBox.setVisible(false);
            olympie1.setVisible(false);
        }
        if (rhodesCheckBox.isSelected()) {
            rhodesCheckBox.setVisible(false);
            rhodes1.setVisible(false);
        }
        if (compteur==1){
               lancementBoutonID.setVisible(true);
               joueur2ID.setVisible(false);
               namePlayer.setEditable(false);
               namePlayer.setText("");
        }
        else{
            compteur--;
            namePlayer.setText("");
        }
    }

    public void lancementBouton(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("plateau2joueurs.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 645, 800);
            stage.setTitle("Plateau de jeu");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
            if (alexandrieCheckBox.isSelected()) {
                alexandrieWonder1.setVisible(true);
                alexandrieDeck1.setVisible(true);
            }
            if (babyloneCheckBox.isSelected()) {
                babyloneWonder1.setVisible(true);
                babyloneDeck1.setVisible(true);
            }
            if (epheseCheckBox.isSelected()) {
                epheseWonder1.setVisible(true);
                epheseDeck1.setVisible(true);
            }
            if (gizehCheckBox.isSelected()) {
                gizehWonder1.setVisible(true);
                gizehDeck1.setVisible(true);
            }
            if (halicarnasseCheckBox.isSelected()) {
                halicarnasseWonder1.setVisible(true);
                halicarnasseDeck1.setVisible(true);
            }
            if (olympieCheckBox.isSelected()) {
                olympieWonder1.setVisible(true);
                olympieDeck1.setVisible(true);
            }
            if (rhodesCheckBox.isSelected()) {
                rhodesWonder1.setVisible(true);
                rhodesDeck1.setVisible(true);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lancementBoutonbis(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("plateau7joueurs.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 975, 840);
            stage.setTitle("Plateau de jeu");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deplacementCarte1() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder1);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder1.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte2() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder2);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder2.getTransforms().add(rotate);
        transition.play();
    }

    @FXML
    public void initialize() {
        Game.option.startNewGame();

    }

}