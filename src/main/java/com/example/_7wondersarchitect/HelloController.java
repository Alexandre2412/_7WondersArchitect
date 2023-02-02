package com.example._7wondersarchitect;


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
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    // Création de variables
    @FXML
    private static Slider numberplayers;
    static int nombrejoueurs;
    private int compteur = 2;
    @FXML
    private TextField namePlayer;
    @FXML
    static ImageView cartewonder1, cartewonder2;
    @FXML
    private CheckBox alexandrieCheckBox, babyloneCheckBox, epheseCheckBox, gizehCheckBox, halicarnasseCheckBox, olympieCheckBox, rhodesCheckBox;
    @FXML
    private Button joueur2ID, lancementBoutonID;
    @FXML
    private ImageView alexandrie1, babylone1, ephese1, gizeh1, halicarnasse1, olympie1, rhodes1;
    public static int [] wonderSelection = new int []{0, 0 ,0 ,0 ,0 ,0 ,0};
    @FXML
    public void initialize() {
        Game.startNewGame();

    }

    /*
    =============================================================================================================
    */

    public void onHelloButtonClick(ActionEvent event) { // Création de la 2ème page pour choisir le nombre de joueurs
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

    public void joueur1(ActionEvent event) {     //Création de la 3ème page choix de la merveille

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
    // Chaque checkbox correspondant au merveille peut etre selectionné
    @FXML
    void alexandrieCheck(ActionEvent event) {
        alexandrieCheckBox.setSelected(true);
    }
    @FXML
    void babyloneCheck(ActionEvent event) {
        babyloneCheckBox.setSelected(true);
    }
    @FXML
    void epheseCheck(ActionEvent event) {
        epheseCheckBox.setSelected(true);
    }
    @FXML
    void gizehCheck(ActionEvent event) {
        gizehCheckBox.setSelected(true);
    }
    @FXML
    void halicarnasseCheck(ActionEvent event) {
        halicarnasseCheckBox.setSelected(true);
    }
    @FXML
    void olympieCheck(ActionEvent event) {
        olympieCheckBox.setSelected(true);
    }
    @FXML
    void rhodesCheck(ActionEvent event) {
        rhodesCheckBox.setSelected(true);
    }
    public void joueur2() {
        if (alexandrieCheckBox.isSelected()) { //Quand une checkbox est selectionné elle disparait ainsi que l'image associé
            alexandrieCheckBox.setVisible(false);
            alexandrie1.setVisible(false);
            wonderSelection[0] = 1 ;

        }
        if (babyloneCheckBox.isSelected()) {
            babyloneCheckBox.setVisible(false);
            babylone1.setVisible(false);
            wonderSelection[1] = 1 ;

        }
        if (epheseCheckBox.isSelected()) {
            epheseCheckBox.setVisible(false);
            ephese1.setVisible(false);
            wonderSelection[2] = 1 ;

        }
        if (gizehCheckBox.isSelected()) {
            gizehCheckBox.setVisible(false);
            gizeh1.setVisible(false);
            wonderSelection[3] = 1 ;

        }
        if (halicarnasseCheckBox.isSelected()) {
            halicarnasseCheckBox.setVisible(false);
            halicarnasse1.setVisible(false);
            wonderSelection[4] = 1 ;

        }
        if (olympieCheckBox.isSelected()) {
            olympieCheckBox.setVisible(false);
            olympie1.setVisible(false);
            wonderSelection[5] = 1 ;

        }
        if (rhodesCheckBox.isSelected()) {
            rhodesCheckBox.setVisible(false);
            rhodes1.setVisible(false);
            wonderSelection[6] = 1 ;

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

    public void lancementBouton(ActionEvent event) { // Création du plateau de jeu à 2 joueurs
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("plateau2joueurs.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 645, 800);
            stage.setTitle("Plateau de jeu");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void lancementBoutonbis(ActionEvent event) { // Création du plateau de jeu à 7 joueurs
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




}