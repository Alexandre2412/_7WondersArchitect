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

    @FXML
    private ImageView cartewonder1, cartewonder2;
    @FXML
    private  ImageView alexandrieWonder1, babyloneWonder1, epheseWonder1, gizehWonder1, halicarnasseWonder1, olympieWonder1, rhodesWonder1;
    @FXML
    private  ImageView alexandrieWonder2, babyloneWonder2, epheseWonder2, gizehWonder2, halicarnasseWonder2, olympieWonder2, rhodesWonder2;
    @FXML
    private  ImageView alexandrieDeck1, babyloneDeck1, epheseDeck1, gizehDeck1, halicarnasseDeck1, olympieDeck1, rhodesDeck1;
    @FXML
    private  ImageView alexandrieDeck2, babyloneDeck2, epheseDeck2, gizehDeck2, halicarnasseDeck2, olympieDeck2, rhodesDeck2;

    public void initialize() {
        if (HelloController.wonderSelection [0] == 1) {
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

    public void deplacementCarte1(MouseEvent mouseEvent) {
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


}
