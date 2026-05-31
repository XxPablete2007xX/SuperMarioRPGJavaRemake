package com.mycompany.supermariorpgjava.remake;

import java.io.File;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modulos.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javaClases.Equipo;
import javaClases.Item;
import javaClases.Jugador;
import javaClases.ObjetoEsp;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static ArrayList<Jugador> jugadores;
    private static File ficheroJugadores = new File("src/main/java/ficheros/jugadores.dat");
    
    private static ArrayList<ObjetoEsp> objetosEspeciales;
    private static ArrayList<Item> items;
    private static ArrayList<Equipo> equipo;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Inicio" + ".fxml"));
        scene = new Scene(fxmlLoader.load());
        
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(ev->{
            ev.consume(); 
       });
    }

    

    public static void main(String[] args) {
        cargarDatos();
        
        try {
            if(!ficheroJugadores.exists()) ficheroJugadores.createNewFile();
        } catch (IOException e) {
            FuncionesGraficas.warning("ERROR", e.getMessage());
        }
        
        
        if(jugadores == null) jugadores = new ArrayList<Jugador>();
        
        
        
        InicioController.datosEntrada(jugadores);
        launch();
    }

    
    public static void abrirNuevaPantalla(String nombreFXML) throws IOException{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(nombreFXML + ".fxml"));
        scene = new Scene(fxmlLoader.load());
        
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(ev->{
            ev.consume(); 
       });
    }
    
    
    public static void cargarDatos(){
        try {
            jugadores = (ArrayList<Jugador>) Ficheros.leerTabla(ficheroJugadores);
        } catch (IOException e) {
            FuncionesGraficas.warning("ERROR", e.getMessage());
        } catch (ClassNotFoundException c){
            FuncionesGraficas.warning("ERROR", c.getMessage());
        }
        
    }
}