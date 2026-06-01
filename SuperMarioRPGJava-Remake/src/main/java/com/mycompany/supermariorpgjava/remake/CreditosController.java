/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.supermariorpgjava.remake;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class CreditosController implements Initializable {

    Image imgF;
    Image imgFl;
    AudioClip sfxElegir;
    String creditos;
    
    @FXML
    private ImageView imgFondo;
    @FXML
    private WebView webCredits;
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
        imgF = new Image(getClass().getResource("/img/fondoCreditos.png").toExternalForm());
        imgFl = new Image(getClass().getResource("/img/flecha.png").toExternalForm());
        sfxElegir = new AudioClip(getClass().getResource("/sfx/elegir.mp3").toExternalForm());
        
        imgFondo.setImage(imgF);
        imgFlecha.setId(null);
        sfxElegir.setVolume(1.0);
        
        
        creditos = "<html>"
        + "<head><meta charset='UTF-8'/></head>"
        + "<body style='"
        +     "background: linear-gradient(180deg, #03000F 0%, #0A0520 100%);"
        +     "color: #D4C8A8;"
        +     "font-family: Georgia, serif;"
        +     "font-size: 12px;"
        +     "text-align: center;"
        +     "width: 100%;"
        +     "padding: 20px 60px;"
        +     "box-sizing: border-box;"
        +     "margin: 0;"
        + "'>"

        // ── ENCABEZADO ──
        + "<p style='font-size: 16px; color: #FFD700; letter-spacing: 8px; margin: 0 0 6px;'>&#10022; &#9733; &#10022;</p>"
        + "<h1 style='font-family: Georgia, serif; font-size: 18px; font-weight: bold; color: #FFD700; letter-spacing: 3px; margin: 0 0 4px;'>CRÉDITOS Y AVISO LEGAL</h1>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 4px; margin: 0 0 14px;'>INFORMACIÓN LEGAL DEL PROYECTO</p>"
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 0 40px 18px;'>"

        // ── BLOQUE AVISO LEGAL ──
        + "<div style='"
        +     "background: rgba(255,50,50,0.07);"
        +     "border: 1px solid rgba(255,100,100,0.3);"
        +     "padding: 14px 20px;"
        +     "margin-bottom: 18px;"
        +     "text-align: left;"
        + "'>"
        +   "<p style='font-size: 10px; font-weight: bold; color: #FF6B6B; letter-spacing: 3px; margin: 0 0 8px;'>"
        +       "<span style='background: #FF6B6B; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; padding: 2px 6px;'>!</span>"
        +       " AVISO LEGAL"
        +   "</p>"
        +   "<p style='margin: 0 0 8px; line-height: 1.8; font-size: 12px;'>"
        +       "Este es un proyecto <b style='color: #F5EED4;'>no oficial</b> desarrollado por fanáticos "
        +       "<b style='color: #F5EED4;'>(fangame)</b> con fines estrictamente "
        +       "<b style='color: #FFD700;'>educativos, de aprendizaje técnico y de entretenimiento</b>, "
        +       "<b style='color: #FF6B6B;'>sin fines de lucro</b>. "
        +       "Este software no está afiliado, patrocinado, asociado ni respaldado de ninguna manera "
        +       "por <b style='color: #F5EED4;'>Nintendo Co., Ltd.</b> ni por "
        +       "<b style='color: #F5EED4;'>Square Enix Holdings Co., Ltd.</b>"
        +   "</p>"
        +   "<p style='margin: 0; line-height: 1.8; font-size: 12px;'>"
        +       "Todos los personajes, nombres, marcas registradas y elementos del universo de juego "
        +       "pertenecen exclusivamente a sus <b style='color: #F5EED4;'>respectivos titulares de derechos</b>. "
        +       "El uso de dichos materiales se realiza bajo el amparo del "
        +       "<i>uso legítimo y de apreciación cultural</i> hacia la obra original."
        +   "</p>"
        + "</div>"

        // ── BLOQUE CRÉDITOS ORIGINALES ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 6px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 14px 0 0; width: 42px;'>"
        +       "<span style='background: #FFD700; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; padding: 3px 5px; letter-spacing: 1px;'>SNES</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 2px; letter-spacing: 1px;'>Créditos del Juego Original</p>"
        +       "<p style='font-size: 9px; color: #B8960C; letter-spacing: 3px; margin: 0 0 8px;'>NINTENDO &#38; SQUARESOFT &#8212; 1996</p>"
        +       "<p style='margin: 0 0 8px; font-size: 12px; line-height: 1.8;'>"
        +           "Este proyecto rinde un profundo homenaje a la obra maestra que unió históricamente "
        +           "a dos gigantes de la industria. Nuestro más sincero agradecimiento al equipo original de "
        +           "<b style='color: #F5EED4;'>Nintendo</b> y "
        +           "<b style='color: #F5EED4;'>Squaresoft</b> (actualmente Square Enix):"
        +       "</p>"
        +       "<table style='border-collapse: collapse; font-size: 11px; width: 100%;'>"
        +         "<tr style='border-bottom: 1px solid rgba(255,215,0,0.08);'>"
        +           "<td style='padding: 4px 12px 4px 0; color: #B8960C; white-space: nowrap;'>Productores</td>"
        +           "<td style='padding: 4px 0; color: #F5EED4;'>Shigeru Miyamoto &#38; Hironobu Sakaguchi</td>"
        +         "</tr>"
        +         "<tr style='border-bottom: 1px solid rgba(255,215,0,0.08);'>"
        +           "<td style='padding: 4px 12px 4px 0; color: #B8960C; white-space: nowrap;'>Directores</td>"
        +           "<td style='padding: 4px 0; color: #F5EED4;'>Chihiro Fujioka &#38; Yoshihiko Maekawa</td>"
        +         "</tr>"
        +         "<tr>"
        +           "<td style='padding: 4px 12px 4px 0; color: #B8960C; white-space: nowrap;'>Compositora</td>"
        +           "<td style='padding: 4px 0; color: #FF9EFF; font-style: italic;'>Yoko Shimomura</td>"
        +         "</tr>"
        +       "</table>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 14px 40px;'>"

        // ── BLOQUE BANDA SONORA SWITCH ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 6px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 14px 0 0; width: 42px;'>"
        +       "<span style='background: #FF9EFF; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; padding: 3px 5px; letter-spacing: 1px;'>BGM</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 2px; letter-spacing: 1px;'>Banda Sonora del Remake</p>"
        +       "<p style='font-size: 9px; color: #B8960C; letter-spacing: 3px; margin: 0 0 8px;'>NINTENDO SWITCH &#8212; 2023</p>"
        +       "<p style='margin: 0; font-size: 12px; line-height: 1.8;'>"
        +           "Esta recreación utiliza los arreglos del remake de "
        +           "<b style='color: #F5EED4;'>Super Mario RPG para Nintendo Switch (2023)</b>, "
        +           "reorquestados por la compositora original "
        +           "<b style='color: #FF9EFF;'>Yoko Shimomura</b>. "
        +           "Todos los derechos pertenecen a "
        +           "<b style='color: #F5EED4;'>Nintendo</b> y "
        +           "<b style='color: #F5EED4;'>ArtePiazza</b>. "
        +           "Su uso es <i>puramente ambiental y con fines de fidelidad artística</i>."
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 14px 40px;'>"

        // ── BLOQUE DESARROLLO ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 6px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 14px 0 0; width: 42px;'>"
        +       "<span style='background: #7BC8FF; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; padding: 3px 5px; letter-spacing: 1px;'>DEV</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 2px; letter-spacing: 1px;'>Desarrollo del Remake en JavaFX</p>"
        +       "<p style='font-size: 9px; color: #B8960C; letter-spacing: 3px; margin: 0 0 8px;'>PROYECTO INDEPENDIENTE</p>"
        +       "<table style='border-collapse: collapse; font-size: 11px; width: 100%;'>"
        +         "<tr style='border-bottom: 1px solid rgba(255,215,0,0.08);'>"
        +           "<td style='padding: 4px 12px 4px 0; color: #B8960C; white-space: nowrap;'>Programación y Arquitectura</td>"
        +           "<td style='padding: 4px 0; color: #7BC8FF; font-weight: bold;'>XxPablete2007xX</td>"
        +         "</tr>"
        +         "<tr style='border-bottom: 1px solid rgba(255,215,0,0.08);'>"
        +           "<td style='padding: 4px 12px 4px 0; color: #B8960C; white-space: nowrap;'>Diseño de Interfaces y UI</td>"
        +           "<td style='padding: 4px 0; color: #7BC8FF; font-weight: bold;'>XxPablete2007xX</td>"
        +         "</tr>"
        +         "<tr>"
        +           "<td style='padding: 4px 12px 4px 0; color: #B8960C; white-space: nowrap;'>Lógica y Mecánicas de Juego</td>"
        +           "<td style='padding: 4px 0; color: #7BC8FF; font-weight: bold;'>XxPablete2007xX</td>"
        +         "</tr>"
        +       "</table>"
        +       "<p style='margin: 10px 0 0; font-size: 11px; color: #888; font-style: italic; line-height: 1.7;'>"
        +           "Agradecimiento especial a las comunidades de software libre y desarrollo de videojuegos "
        +           "por las herramientas y documentación que permitieron la creación de este proyecto."
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        // ── ORNAMENTO FINAL ──
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 14px 40px 12px;'>"
        + "<p style='font-size: 16px; color: #FFD700; margin: 0 0 6px; letter-spacing: 8px;'>&#10022; &#9733; &#10022;</p>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 3px; margin: 0;'>HECHO CON AMOR A LA FRANQUICIA</p>"

        + "</body></html>";
        
        
        webCredits.getEngine().loadContent(creditos);
    }    

    @FXML
    private void desaparecerFlecha(MouseEvent event) {
        imgFlecha.setImage(null);
    }

    @FXML
    private void aparecerFlecha(MouseEvent event) {
        sfxElegir.play();
        imgFlecha.setImage(imgFl);
    }

    @FXML
    private void volver(ActionEvent event) {
        Stage stage = (Stage) this.btnVolver.getScene().getWindow();
        stage.close();
    }
    
}
