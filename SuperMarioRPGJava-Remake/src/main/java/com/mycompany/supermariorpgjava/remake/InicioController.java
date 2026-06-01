/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.supermariorpgjava.remake;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javaClases.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import modulos.*;
/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class InicioController implements Initializable {

    Image imgIni;
    Image imgFlecha;
    AudioClip sfxElegir;
    Media fileIntro; 
    MediaPlayer audioIntro;
    final String ver = "v0.3";
    
    private static ArrayList<Jugador> jugadores;
    
    @FXML
    private ImageView imgInicio;
    @FXML
    private ImageView imgFlecha1;
    @FXML
    private ImageView imgFlecha2;
    @FXML
    private ImageView imgFlecha3;
    @FXML
    private ImageView imgFlecha4;
    @FXML
    private ImageView imgFlecha5;
    @FXML
    private Button btnJugar;
    @FXML
    private Button btnHOF;
    @FXML
    private Button btnInstr;
    @FXML
    private Button btnCred;
    @FXML
    private Button btnSalir;
    @FXML
    private Label version;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        version.setText(ver);
        imgIni = new Image(getClass().getResource("/img/titulo.png").toExternalForm());
        imgFlecha = new Image(getClass().getResource("/img/flecha.png").toExternalForm());
        sfxElegir = new AudioClip(getClass().getResource("/sfx/elegir.mp3").toExternalForm());
        sfxElegir.setVolume(1.0);
        fileIntro = new Media(getClass().getResource("/sonidos/intro.mp3").toExternalForm());
        audioIntro = new MediaPlayer(fileIntro);
        audioIntro.setVolume(0.75);
        audioIntro.play();
        
        imgInicio.setImage(imgIni);
        imgFlecha1.setImage(null);
        imgFlecha2.setImage(null);
        imgFlecha3.setImage(null);
        imgFlecha4.setImage(null);
        imgFlecha5.setImage(null);
        
    }
    
    
    public static void datosEntrada(ArrayList<Jugador> jug){
        jugadores = jug;
    }

    @FXML
    private void desaparecerFlecha1(MouseEvent event) {
        imgFlecha1.setImage(null);
    }

    @FXML
    private void aparecerFlecha1(MouseEvent event) {
        sfxElegir.play();
        imgFlecha1.setImage(imgFlecha);
    }

    @FXML
    private void desaparecerFlecha2(MouseEvent event) {
        imgFlecha2.setImage(null);
    }

    @FXML
    private void aparecerFlecha2(MouseEvent event) {
        sfxElegir.play();
        imgFlecha2.setImage(imgFlecha);
    }

    @FXML
    private void desaparecerFlecha3(MouseEvent event) {
        imgFlecha3.setImage(null);
    }

    @FXML
    private void aparecerFlecha3(MouseEvent event) {
        sfxElegir.play();
        imgFlecha3.setImage(imgFlecha);
    }

    @FXML
    private void desaparecerFlecha4(MouseEvent event) {
        imgFlecha4.setImage(null);
    }

    @FXML
    private void aparecerFlecha4(MouseEvent event) {
        sfxElegir.play();
        imgFlecha4.setImage(imgFlecha);
    }

    @FXML
    private void desaparecerFlecha5(MouseEvent event) {
        imgFlecha5.setImage(null);
    }

    @FXML
    private void aparecerFlecha5(MouseEvent event) {
        sfxElegir.play();
        imgFlecha5.setImage(imgFlecha);
    }

    @FXML
    private void jugar(ActionEvent event) {
    }

    @FXML
    private void abrirHOF(ActionEvent event) throws IOException {
        HallOfFameController.datosEntrada(jugadores);
        App.abrirNuevaPantalla("HallOfFame");
    }

    @FXML
    private void abrirInstr(ActionEvent event) throws IOException {
        App.abrirNuevaPantalla("Instrucciones");
    }

    @FXML
    private void abrirCreditos(ActionEvent event) throws IOException {
        App.abrirNuevaPantalla("Creditos");
    }

    @FXML
    private void salir(ActionEvent event) {
        App.guardarDatos();
        System.exit(0);
    }
    
}
