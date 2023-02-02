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
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;

import static com.example._7wondersarchitect.HelloController.*;

public class GameController {
    // Création des variables
    @FXML
    private ImageView cartewonder1, cartewonder2, cartewonder3, cartewonder4, cartewonder5, cartewonder6, cartewonder7, cartewonder8, cartewonder9, cartewonder10, cartewonder11, cartewonder12, cartewonder13, cartewonder14, cartewonder15, cartewonder16, cartewonder17, cartewonder18, cartewonder19, cartewonder20, cartewonder21, cartewonder22, cartewonder23, cartewonder24;
    @FXML
    private  ImageView alexandrieWonder1, babyloneWonder1, epheseWonder1, gizehWonder1, halicarnasseWonder1, olympieWonder1, rhodesWonder1;
    @FXML
    private  ImageView alexandrieWonder2, babyloneWonder2, epheseWonder2, gizehWonder2, halicarnasseWonder2, olympieWonder2, rhodesWonder2;
    @FXML
    private  ImageView alexandrieDeck1, babyloneDeck1, epheseDeck1, gizehDeck1, halicarnasseDeck1, olympieDeck1, rhodesDeck1;
    @FXML
    private  ImageView alexandrieDeck2, babyloneDeck2, epheseDeck2, gizehDeck2, halicarnasseDeck2, olympieDeck2, rhodesDeck2;

    public void initialize() {
        if (HelloController.wonderSelection [0] == 1) { // Sur la page précédente, le choix des merveilles fait apparaitre sur le plateau la merveille selectionné
            alexandrieWonder1.setVisible(true);
            alexandrieDeck1.setVisible(true);
            HelloController.wonderSelection [0] = 0;
        }
        else if (HelloController.wonderSelection [1] == 1) {
            babyloneWonder1.setVisible(true);
            babyloneDeck1.setVisible(true);
            HelloController.wonderSelection [1] = 0;
        }
        else if (HelloController.wonderSelection [2] == 1) {
            epheseWonder1.setVisible(true);
            epheseDeck1.setVisible(true);
            HelloController.wonderSelection [2] = 0;
        }
        else if (HelloController.wonderSelection [3] == 1) {
            gizehWonder1.setVisible(true);
            gizehDeck1.setVisible(true);
            HelloController.wonderSelection [3] = 0;
        }
        else if (HelloController.wonderSelection [4] == 1) {
            halicarnasseWonder1.setVisible(true);
            halicarnasseDeck1.setVisible(true);
            HelloController.wonderSelection [4] = 0;
        }
        else if (HelloController.wonderSelection [5] == 1) {
            olympieWonder1.setVisible(true);
            olympieDeck1.setVisible(true);
            HelloController.wonderSelection [5] = 0;
        }
        else if (HelloController.wonderSelection [6] == 1) {
            rhodesWonder1.setVisible(true);
            rhodesDeck1.setVisible(true);
            HelloController.wonderSelection [6] = 0;
        }
        if (HelloController.wonderSelection [0] == 1) {
            alexandrieWonder2.setVisible(true);
            alexandrieDeck2.setVisible(true);
        }
        else if (HelloController.wonderSelection [1] == 1) {
            babyloneWonder2.setVisible(true);
            babyloneDeck2.setVisible(true);
        }
        else if (HelloController.wonderSelection [2] == 1) {
            epheseWonder2.setVisible(true);
            epheseDeck2.setVisible(true);
        }
        else if (HelloController.wonderSelection [3] == 1) {
            gizehWonder2.setVisible(true);
            gizehDeck2.setVisible(true);
        }
        else if (HelloController.wonderSelection [4] == 1) {
            halicarnasseWonder2.setVisible(true);
            halicarnasseDeck2.setVisible(true);
        }
        else if (HelloController.wonderSelection [5] == 1) {
            olympieWonder2.setVisible(true);
            olympieDeck2.setVisible(true);
        }
        else if (HelloController.wonderSelection [6] == 1) {
            rhodesWonder2.setVisible(true);
            rhodesDeck2.setVisible(true);
        }
    }

    public void deplacementCarte1(MouseEvent mouseEvent) { // Déplacement des cartes du deck
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder1);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder1.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte2(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder2);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder2.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte3(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder3);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder3.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte4(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder4);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder4.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte5(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder5);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder5.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte6(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder6);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder6.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte7(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder7);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder7.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte8(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder8);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder8.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte9(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder9);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder9.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte10(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder10);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder10.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte11(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder11);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder11.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte12(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder12);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder12.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte13(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder13);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder13.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte14(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder14);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder14.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte15(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder15);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder15.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte16(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder16);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder16.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte17(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder17);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder17.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte18(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder18);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder18.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte19(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder19);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder19.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte20(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder20);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder20.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte21(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder21);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder21.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte22(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder22);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder22.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte23(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder23);
        transition.setToX(263);
        transition.setToY(0);
        Rotate rotate = new Rotate(0);
        cartewonder23.getTransforms().add(rotate);
        transition.play();
    }
    public void deplacementCarte24(MouseEvent mouseEvent) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder24);
        transition.setToX(-307);
        transition.setToY(-99);
        Rotate rotate = new Rotate(180);
        cartewonder24.getTransforms().add(rotate);
        transition.play();
    }




}
