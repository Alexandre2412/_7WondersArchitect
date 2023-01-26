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
    @FXML
    private TextField namePlayer;
    static String nomJoueurs;
    @FXML
    private CheckBox alexandrieCheckBox, babyloneCheckBox, epheseCheckBox, gizehCheckBox, halicarnasseCheckBox, olympieCheckBox, rhodesCheckBox;
    @FXML
    private Button joueur2ID, lancementBoutonID;
    @FXML
    private ImageView cartewonder1, cartewonder2, cartewonder3, cartewonder4, cartewonder5, cartewonder6, cartewonder7;
    @FXML
    private ImageView alexandrie1, babylone1, ephese1, gizeh1, halicarnasse1, olympie1, rhodes1;
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
private int compteur=2;
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
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
            stage.setTitle("Plateau de jeu");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
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
        transition.setToX(297);
        transition.setToY(345);
        Rotate rotate = new Rotate(270);
        cartewonder1.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte2() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder2);
        transition.setToX(294);
        transition.setToY(94);
        Rotate rotate = new Rotate(270);
        cartewonder2.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte3() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder3);
        transition.setToX(343);
        transition.setToY(-216);
        Rotate rotate = new Rotate(330);
        cartewonder3.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte4() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder4);
        transition.setToX(119);
        transition.setToY(-279);
        Rotate rotate = new Rotate(0);
        cartewonder4.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte5() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder5);
        transition.setToX(-125);
        transition.setToY(-258);
        Rotate rotate = new Rotate(30);
        cartewonder5.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte6() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder6);
        transition.setToX(-326);
        transition.setToY(-84);
        Rotate rotate = new Rotate(75);
        cartewonder6.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte7() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder7);
        transition.setToX(-353);
        transition.setToY(123);
        Rotate rotate = new Rotate(90);
        cartewonder7.getTransforms().add(rotate);
        transition.play();
    }

    @FXML
    public void initialize() {
        Game.option.startNewGame();

    }

}