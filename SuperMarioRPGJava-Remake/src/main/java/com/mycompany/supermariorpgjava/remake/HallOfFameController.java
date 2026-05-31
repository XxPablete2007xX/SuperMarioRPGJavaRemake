/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.supermariorpgjava.remake;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javaClases.Jugador;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class HallOfFameController implements Initializable {

    Image imgF;
    Image imgD1;
    Image imgD2;
    Image imgFlcha;
    AudioClip sfxElegir;
    
    private static ArrayList<Jugador> jugadores;
    ObservableList<Jugador> observableList;
    
    @FXML
    private ImageView imgFondo;
    @FXML
    private TableView<Jugador> tableHallOfFame;
    @FXML
    private TableColumn<Jugador, String> colNombre;
    @FXML
    private TableColumn<Jugador, Long> colTiempo;
    @FXML
    private TableColumn<Jugador, LocalDate> colFecha;
    @FXML
    private TableColumn<Jugador, Integer> colMonedas;
    @FXML
    private TableColumn<Jugador, Integer> colMonedasRana;
    @FXML
    private ImageView imgDecor1;
    @FXML
    private ImageView imgDecor2;
    @FXML
    private Button btnVolver;
    @FXML
    private ImageView imgFlecha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        imgF = new Image(getClass().getResource("/gif/fondoHOF.gif").toExternalForm());
        imgFlcha = new Image(getClass().getResource("/img/flecha.png").toExternalForm());
        sfxElegir = new AudioClip(getClass().getResource("/sfx/elegir.mp3").toExternalForm());
        
        imgFondo.setFitHeight(720.0);
        imgFondo.setFitWidth(1290.0);
        imgFondo.setImage(imgF);
        imgFlecha.setImage(null);
        sfxElegir.setVolume(1.0);
        
        
        //visualizar tabla
        colNombre.setCellValueFactory(celldata->new javafx.beans.property.SimpleObjectProperty(celldata.getValue().getNombre()));
        colTiempo.setCellValueFactory(celldata->new javafx.beans.property.SimpleObjectProperty(celldata.getValue().getTiempo()));
        colFecha.setCellValueFactory(celldata->new javafx.beans.property.SimpleObjectProperty(celldata.getValue().getFecha()));
        colMonedas.setCellValueFactory(celldata->new javafx.beans.property.SimpleObjectProperty(celldata.getValue().getMonedas()));
        colMonedasRana.setCellValueFactory(celldata->new javafx.beans.property.SimpleObjectProperty(celldata.getValue().getMonedasRana()));
        
        observableList = FXCollections.observableArrayList(jugadores);
        tableHallOfFame.setItems(observableList);
    }    
    
    
    public static void datosEntrada(ArrayList<Jugador> jug){
        jugadores = jug;
    }

    @FXML
    private void volver(ActionEvent event) {
        Stage stage = (Stage) this.btnVolver.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void desaparecerFlecha(MouseEvent event) {
        imgFlecha.setImage(null);
    }

    @FXML
    private void aparecerFlecha(MouseEvent event) {
        sfxElegir.play();
        imgFlecha.setImage(imgFlcha);
    }
    
}
