
package com.mycompany.supermariorpgjava.remake;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class InstruccionesController implements Initializable {

    int c;
    Image imgF;
    Image imgFl;
    AudioClip sfxElegir;
    String seccion1, seccion2, seccion3, seccion4;
        
    @FXML
    private Label seccion;
    @FXML
    private Label pagina;
    @FXML
    private WebView cuerpoInfo;
    @FXML
    private Button btnAnterior;
    @FXML
    private Button btnSiguiente;
    @FXML
    private ImageView imgFondo;
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
        c = 1;
        imgFl = new Image(getClass().getResource("/img/flecha.png").toExternalForm());
        sfxElegir = new AudioClip(getClass().getResource("/sfx/elegir.mp3").toExternalForm());
        sfxElegir.setVolume(1.0);
        imgFlecha.setImage(null);
        seccion1 = "<html>"
+ "<head><meta charset='UTF-8'/></head>"
+ "<body style='"
+     "background: linear-gradient(180deg, #03000F 0%, #0A0520 100%);"
+     "color: #D4C8A8;"
+     "font-family: Georgia, serif;"
+     "font-size: 13px;"
+     "line-height: 1.9;"
+     "text-align: center;"
+     "width: 100%;"
+     "padding: 28px 60px;"
+     "box-sizing: border-box;" 
+     "margin: 0;"
+ "'>"
 
// ── ESTRELLA DECORATIVA ──
+ "<p style='font-size: 20px; color: #FFD700; margin: 0 0 4px; letter-spacing: 8px;'>✦ ★ ✦</p>"
 
// ── TÍTULO PRINCIPAL ──
+ "<h1 style='"
+     "font-family: Georgia, serif;"
+     "font-size: 22px;"
+     "font-weight: bold;"
+     "color: #FFD700;"
+     "text-shadow: 0 0 12px rgba(255,215,0,0.5);"
+     "letter-spacing: 3px;"
+     "margin: 0 0 4px;"
+ "'>SUPER MARIO RPG</h1>"
 
+ "<p style='"
+     "font-size: 10px;"
+     "color: #B8960C;"
+     "letter-spacing: 4px;"
+     "margin: 0 0 16px;"
+ "'>LEGEND OF THE SEVEN STARS</p>"
 
// ── SEPARADOR ──
+ "<hr style='"
+     "border: none;"
+     "border-top: 1px solid rgba(255,215,0,0.3);"
+     "margin: 0 40px 20px;"
+ "'>"
 
// ── BLOQUE PRÓLOGO ──
+ "<p style='"
+     "font-size: 10px;"
+     "color: #B8960C;"
+     "letter-spacing: 3px;"
+     "margin: 0 0 10px;"
+ "'>— PRÓLOGO —</p>"
 
+ "<p style='margin: 0 0 18px; color: #F5EED4; font-style: italic; font-size: 13px;'>"
+     "Un día normal en el <b style='color: #FFF0A0;'>Reino Champiñón</b>…<br>"
+     "Todo comienza como la clásica aventura a la que estamos acostumbrados:<br>"
+     "la <b style='color: #FFD700;'>Princesa Peach</b> ha sido secuestrada por el"
+     " <b style='color: #FF6B6B;'>Rey Bowser</b>, y nuestro héroe,"
+     " <b style='color: #FFD700;'>Mario</b>, acude al rescate en el imponente<br>"
+     "Castillo del Rey de los Koopas.<br><br>"
+     "Sin embargo, justo cuando la victoria parece asegurada,<br>"
+     "un evento <b style='color: #FF6B6B;'>catastrófico</b> sacude los cimientos del mundo."
+ "</p>"
 
// ── SEPARADOR SECUNDARIO ──
+ "<hr style='"
+     "border: none;"
+     "border-top: 1px solid rgba(255,215,0,0.15);"
+     "margin: 0 60px 18px;"
+ "'>"
 
// ── SECCIÓN 1 ──
+ "<p style='"
+     "font-size: 10px;"
+     "color: #B8960C;"
+     "letter-spacing: 3px;"
+     "margin: 0 0 8px;"
+ "'>— CAPÍTULO I —</p>"
 
+ "<p style='"
+     "font-size: 14px;"
+     "font-weight: bold;"
+     "color: #FFD700;"
+     "margin: 0 0 10px;"
+     "letter-spacing: 1px;"
+ "'>La caída de Exor y la Vía Estelar</p>"
 
+ "<p style='margin: 0 0 20px; font-size: 13px;'>"
+     "Una gigantesca espada viviente llamada <b style='color: #FFD700;'>Exor</b>"
+     " cae desde el cielo, atravesando el castillo de"
+     " <b style='color: #FF6B6B;'>Bowser</b>"
+     " y enviando a todos a volar en distintas direcciones.<br><br>"
+     "Este brutal impacto no solo destruye el castillo, sino que hace añicos"
+     " la mítica <b style='color: #7BC8FF;'>Vía Estelar (Star Road)</b>,"
+     " esparciendo sus fragmentos por todo el mundo.<br><br>"
+     "Sin la Vía Estelar, los deseos de la gente<br>"
+     "ya no pueden <i>hacerse realidad</i>."
+ "</p>"
 
// ── SEPARADOR SECUNDARIO ──
+ "<hr style='"
+     "border: none;"
+     "border-top: 1px solid rgba(255,215,0,0.15);"
+     "margin: 0 60px 18px;"
+ "'>"
 
// ── SECCIÓN 2 ──
+ "<p style='"
+     "font-size: 10px;"
+     "color: #B8960C;"
+     "letter-spacing: 3px;"
+     "margin: 0 0 8px;"
+ "'>— CAPÍTULO II —</p>"
 
+ "<p style='"
+     "font-size: 14px;"
+     "font-weight: bold;"
+     "color: #FFD700;"
+     "margin: 0 0 10px;"
+     "letter-spacing: 1px;"
+ "'>El inicio de una gran epopeya</p>"
 
+ "<p style='margin: 0 0 20px; font-size: 13px;'>"
+     "Pronto se revela que <b style='color: #FFD700;'>Exor</b>"
+     " es la vanguardia de la temible"
+     " <b style='color: #FF6B6B;'>Banda de Fraguo (Smithy Gang)</b>.<br><br>"
+     "En esta entrega, acompañarás a <b style='color: #FFD700;'>Mario</b>"
+     " y a sus nuevos aliados en el comienzo de esta gran aventura,<br>"
+     "recorriendo los reinos para enfrentarse a estos villanos mecánicos<br>"
+     "y recuperar las dos primeras"
+     " <b style='color: #FFF0A0;'>Estrellas</b> —<br>"
+     "el primer gran paso para devolverle al mundo<br>"
+     "el poder de <i>soñar</i>."
+ "</p>"
 
// ── ORNAMENTO FINAL ──
+ "<hr style='"
+     "border: none;"
+     "border-top: 1px solid rgba(255,215,0,0.3);"
+     "margin: 0 40px 14px;"
+ "'>"
 
+ "<p style='font-size: 20px; color: #FFD700; margin: 0 0 8px; letter-spacing: 8px;'>✦ ★ ✦</p>"
 
+ "<p style='"
+     "font-size: 9px;"
+     "color: #B8960C;"
+     "letter-spacing: 3px;"
+     "margin: 0;"
+     "opacity: 0.7;"
+ "'>QUE LOS DESEOS VUELVAN A HACERSE REALIDAD</p>"
 
+ "</body></html>";
        
        
        seccion2 = "<html>"
        + "<head><meta charset='UTF-8'/></head>"
        + "<body style='"
        +     "background: linear-gradient(180deg, #03000F 0%, #0A0520 100%);"
        +     "color: #D4C8A8;"
        +     "font-family: Georgia, serif;"
        +     "font-size: 13px;"
        +     "line-height: 1.9;"
        +     "text-align: center;"
        +     "width: 100%;"
        +     "padding: 28px 60px;"
        +     "box-sizing: border-box;"
        +     "margin: 0;"
        + "'>"

        // ── ENCABEZADO ──
        + "<p style='font-size: 18px; color: #FFD700; letter-spacing: 8px; margin: 0 0 6px;'>✦ ★ ✦</p>"
        + "<h1 style='font-family: Georgia, serif; font-size: 20px; font-weight: bold; color: #FFD700; letter-spacing: 3px; margin: 0 0 4px;'>MECÁNICAS DE JUEGO</h1>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 4px; margin: 0 0 16px;'>SISTEMAS PRINCIPALES</p>"
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 0 40px 24px;'>"

        // ── BLOQUE 1: REFLEJOS NUMÉRICOS ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 6px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #98FF98; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 5px;'>CMD</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 3px; letter-spacing: 1px;'>"
        +           "Comandos de Acción"
        +       "</p>"
        +       "<p style='font-size: 9px; color: #98FF98; letter-spacing: 3px; margin: 0 0 8px;'>" + "&#9889; REFLEJOS" + " NUMÉRICOS — ¡NUEVA MECÁNICA!</p>"
        +       "<p style='margin: 0 0 10px; font-size: 13px; color: #D4C8A8;'>"
        +           "El combate pondrá a prueba tu <b style='color: #F5EED4;'>agilidad mental y tus dedos</b>. "
        +           "Al realizar un ataque, aparecerá un "
        +           "<b style='color: #FFD700;'>número aleatorio</b> en la pantalla. "
        +           "¡Escríbelo en tu teclado lo antes posible!"
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        // ── TABLA DE TIEMPOS ──
        + "<div style='margin: 0 0 20px 52px; text-align: left;'>"
        +   "<table style='border-collapse: collapse; font-size: 11px; width: 100%;'>"
        +     "<tr style='border-bottom: 1px solid rgba(255,215,0,0.1);'>"
        +       "<td style='padding: 5px 12px 5px 0; color: #98FF98;'>&#9660; Rápido</td>"
        +       "<td style='padding: 5px 0;'>Escribes el número a tiempo</td>"
        +       "<td style='padding: 5px 0 5px 12px; color: #98FF98; font-weight: bold;'>→ Daño máximo</td>"
        +     "</tr>"
        +     "<tr style='border-bottom: 1px solid rgba(255,215,0,0.1);'>"
        +       "<td style='padding: 5px 12px 5px 0; color: #FFD700;'>&#128336; Lento</td>"
        +       "<td style='padding: 5px 0;'>Te pasas un poco del tiempo</td>"
        +       "<td style='padding: 5px 0 5px 12px; color: #FFD700; font-weight: bold;'>→ Daño moderado</td>"
        +     "</tr>"
        +     "<tr>"
        +       "<td style='padding: 5px 12px 5px 0; color: #FF6B6B;'>&#128128; Sin tiempo</td>"
        +       "<td style='padding: 5px 0;'>Se agota el contador</td>"
        +       "<td style='padding: 5px 0 5px 12px; color: #FF6B6B; font-weight: bold;'>→ Daño mínimo</td>"
        +     "</tr>"
        +   "</table>"
        +   "<p style='margin: 10px 0 0; font-size: 12px; color: #D4C8A8;'>"
        +       "¡Lo mismo aplica para <b style='color: #7BC8FF;'>defenderte</b>! "
        +       "Teclea el número con rapidez cuando el enemigo ataque "
        +       "para <b style='color: #7BC8FF;'>mitigar el daño recibido</b>."
        +   "</p>"
        + "</div>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 0 40px 22px;'>"

        // ── BLOQUE 2: MAGIA Y FP ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 22px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #FF9EFF; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 5px;'>MAG</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 3px; letter-spacing: 1px;'>"
        +           "Magia y Puntos Flor"
        +       "</p>"
        +       "<p style='font-size: 9px; color: #FF9EFF; letter-spacing: 3px; margin: 0 0 8px;'>&#127800; FP — RECURSO COMPARTIDO</p>"
        +       "<p style='margin: 0; font-size: 13px; color: #D4C8A8;'>"
        +           "Además de los ataques físicos, puedes desatar poderosos "
        +           "<b style='color: #FF9EFF;'>ataques especiales y magia</b> "
        +           "usando <b style='color: #FF9EFF;'>Puntos Flor (FP)</b>.<br><br>"
        +           "Tu reserva de FP se <b style='color: #F5EED4;'>comparte entre todos los miembros del equipo</b>. "
        +           "Gestiona este medidor con sabiduría para aprovechar las habilidades únicas de "
        +           "<b style='color: #FF6B6B;'>Mario</b>, "
        +           "<b style='color: #7BC8FF;'>Mallow</b> y "
        +           "<b style='color: #FFF0A0;'>Geno</b>."
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 0 40px 22px;'>"

        // ── BLOQUE 3: EXPLORACIÓN POR INTERFAZ ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 24px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #7BC8FF; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 5px;'>GUI</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 3px; letter-spacing: 1px;'>"
        +           "Exploración por Interfaz"
        +       "</p>"
        +       "<p style='font-size: 9px; color: #98FF98; letter-spacing: 3px; margin: 0 0 8px;'>&#128435; BOTONES EN PANTALLA</p>"
        +       "<p style='margin: 0 0 10px; font-size: 13px; color: #D4C8A8;'>"
        +           "Olvídate del movimiento tradicional. La exploración se ha adaptado a un formato "
        +           "<b style='color: #F5EED4;'>visual y directo</b> a través de la interfaz. "
        +           "Pulsa los <b style='color: #98FF98;'>botones interactivos</b> que aparecen en pantalla para:"
        +       "</p>"
        +       "<table style='border-collapse: collapse; font-size: 12px; margin-left: 4px;'>"
        +         "<tr><td style='padding: 3px 10px 3px 0; color: #FFD700;'>&#9670;</td><td style='padding: 3px 0; color: #D4C8A8;'>Investigar el entorno</td></tr>"
        +         "<tr><td style='padding: 3px 10px 3px 0; color: #FFD700;'>&#9654;</td><td style='padding: 3px 0; color: #D4C8A8;'>Hablar con los personajes</td></tr>"
        +         "<tr><td style='padding: 3px 10px 3px 0; color: #FFD700;'>&#9632;</td><td style='padding: 3px 0; color: #D4C8A8;'>Abrir cofres del tesoro</td></tr>"
        +         "<tr><td style='padding: 3px 10px 3px 0; color: #FFD700;'>⚡</td><td style='padding: 3px 0; color: #D4C8A8;'>Activar eventos y avanzar en la historia</td></tr>"
        +       "</table>"
        +       "<p style='margin: 10px 0 0; font-size: 12px; color: #98FF98; font-style: italic;'>¡Todo al alcance de un clic!</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        // ── ORNAMENTO FINAL ──
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 0 40px 14px;'>"
        + "<p style='font-size: 18px; color: #FFD700; margin: 0 0 8px; letter-spacing: 8px;'>✦ ★ ✦</p>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 3px; margin: 0;'>EL REINO CHAMPIÑÓN TE NECESITA</p>"

        + "</body></html>";
        
        
        
        seccion3 = "<html>"
        + "<head><meta charset='UTF-8'/></head>"
        + "<body style='"
        +     "background: linear-gradient(180deg, #03000F 0%, #0A0520 100%);"
        +     "color: #D4C8A8;"
        +     "font-family: Georgia, serif;"
        +     "font-size: 13px;"
        +     "line-height: 1.9;"
        +     "text-align: center;"
        +     "width: 100%;"
        +     "padding: 28px 60px;"
        +     "box-sizing: border-box;"
        +     "margin: 0;"
        + "'>"

        // ── ENCABEZADO ──
        + "<p style='font-size: 18px; color: #FFD700; letter-spacing: 8px; margin: 0 0 6px;'>✦ ★ ✦</p>"
        + "<h1 style='font-family: Georgia, serif; font-size: 20px; font-weight: bold; color: #FFD700; letter-spacing: 3px; margin: 0 0 4px;'>SOBRE ESTE REMAKE</h1>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 4px; margin: 0 0 16px;'>INFORMACIÓN DEL PROYECTO</p>"
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 0 40px 24px;'>"

        // ── BLOQUE CURIOSIDAD ──
        + "<div style='"
        +     "background: rgba(255,215,0,0.06);"
        +     "border: 1px solid rgba(255,215,0,0.25);"
        +     "padding: 16px 22px;"
        +     "margin-bottom: 22px;"
        +     "text-align: left;"
        + "'>"
        +   "<p style='font-size: 11px; color: #FFD700; letter-spacing: 3px; margin: 0 0 8px;'>"+ "<span style='background: #FFD700; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; padding: 3px 6px;'>!</span>"+ " ¿SABÍAS QUE...?</p>"
        +   "<p style='margin: 0; font-size: 13px; color: #F5EED4;'>"
        +       "¡Este juego es un <b style='color: #FFD700;'>remake de un remake</b>! "
        +       "Esta aventura es la evolución directa de un proyecto anterior programado utilizando "
        +       "las clásicas librerías gráficas de <b style='color: #7BC8FF;'>Swing</b>, "
        +       "que abarcaba la historia hasta la obtención de la "
        +       "<b style='color: #FFD700;'>primera Estrella</b>."
        +   "</p>"
        + "</div>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 0 40px 22px;'>"

        // ── BLOQUE MOTOR ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 22px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #7BC8FF; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 5px;'>SYS</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 6px; letter-spacing: 1px;'>"
        +           "Motor reconstruido"
        +           "<span style='font-size: 10px; font-weight: normal; color: #7BC8FF; letter-spacing: 2px; margin-left: 10px;'>JAVAFX + SCENEBUILDER</span>"
        +       "</p>"
        +       "<p style='margin: 0; font-size: 13px; color: #D4C8A8;'>"
        +           "Para esta nueva encarnación, el motor del juego ha sido "
        +           "<b style='color: #F5EED4;'>reconstruido y modernizado por completo</b> "
        +           "utilizando <b style='color: #7BC8FF;'>JavaFX</b> y "
        +           "<b style='color: #7BC8FF;'>SceneBuilder</b>.<br><br>"
        +           "Este gran salto técnico no solo ha permitido recrear con "
        +           "<b style='color: #F5EED4;'>mayor fidelidad y fluidez</b> el proyecto original, "
        +           "sino que expande la aventura para incluir el emocionante arco de la "
        +           "<b style='color: #FFD700;'>segunda Estrella</b>."
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 0 40px 22px;'>"

        // ── BLOQUE MÚSICA ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 24px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #FF9EFF; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 5px;'>BGM</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 13px; font-weight: bold; color: #FFD700; margin: 0 0 6px; letter-spacing: 1px;'>"
        +           "Banda sonora oficial"
        +           "<span style='font-size: 10px; font-weight: normal; color: #FF9EFF; letter-spacing: 2px; margin-left: 10px;'>NINTENDO SWITCH REMAKE</span>"
        +       "</p>"
        +       "<p style='margin: 0; font-size: 13px; color: #D4C8A8;'>"
        +           "Para acompañar este apartado visual renovado, la banda sonora utiliza la "
        +           "<b style='color: #FF9EFF;'>espectacular música oficial</b> del reciente remake de "
        +           "<b style='color: #FFD700;'>Super Mario RPG para Nintendo Switch</b>.<br><br>"
        +           "<i>¡Sube el volumen y disfruta de la magia!</i>"
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        // ── ORNAMENTO FINAL ──
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 0 40px 14px;'>"
        + "<p style='font-size: 18px; color: #FFD700; margin: 0 0 8px; letter-spacing: 8px;'>✦ ★ ✦</p>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 3px; margin: 0;'>UN PROYECTO HECHO CON AMOR A LA FRANQUICIA</p>"

        + "</body></html>";
        
        
        
        seccion4 = "<html>"
        + "<head><meta charset='UTF-8'/></head>"
        + "<body style='"
        +     "background: linear-gradient(180deg, #03000F 0%, #0A0520 100%);"
        +     "color: #D4C8A8;"
        +     "font-family: Georgia, serif;"
        +     "font-size: 13px;"
        +     "line-height: 1.9;"
        +     "text-align: center;"
        +     "width: 100%;"
        +     "padding: 28px 60px;"
        +     "box-sizing: border-box;"
        +     "margin: 0;"
        + "'>"

        // ── ENCABEZADO ──
        + "<p style='font-size: 18px; color: #FFD700; letter-spacing: 8px; margin: 0 0 6px;'>✦ ★ ✦</p>"
        + "<h1 style='font-family: Georgia, serif; font-size: 20px; font-weight: bold; color: #FFD700; letter-spacing: 3px; margin: 0 0 4px;'>PERFILES DE PERSONAJES</h1>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 4px; margin: 0 0 16px;'>TUS ALIADOS EN LA AVENTURA</p>"
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 0 40px 24px;'>"

        // ── MARIO ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 6px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #FF6B6B; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 7px;'>M</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 14px; font-weight: bold; color: #FFD700; margin: 0 0 3px; letter-spacing: 1px;'>MARIO</p>"
        +       "<p style='font-size: 9px; color: #FF6B6B; letter-spacing: 3px; margin: 0 0 8px;'>⚔️ ATACANTE EQUILIBRADO — DAÑO PRINCIPAL</p>"
        +       "<p style='margin: 0; font-size: 13px; color: #D4C8A8;'>"
        +           "El legendario y silencioso héroe del Reino Champiñón, siempre dispuesto a "
        +           "<b style='color: #F5EED4;'>saltar a la acción</b>. "
        +           "En combate destaca por su <b style='color: #FF6B6B;'>alto daño físico</b> "
        +           "y sus poderosos y clásicos "
        +           "<b style='color: #FF9966;'>ataques mágicos de fuego</b>."
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        // ── BARRA DE STATS MARIO ──
        + "<div style='text-align: left; margin: 10px 0 18px 52px; font-size: 11px; color: #888;'>"
        +   "<table style='border-collapse: collapse;'>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>FIS</td>"
        +       "<td><span style='color: #FF6B6B;'>██████████</span><span style='color: #333;'>██</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Alto</td>"
        +     "</tr>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>MAG</td>"
        +       "<td><span style='color: #FF9966;'>███████</span><span style='color: #333;'>█████</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Medio</td>"
        +     "</tr>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>DEF</td>"
        +       "<td><span style='color: #7BC8FF;'>████████</span><span style='color: #333;'>████</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Alto</td>"
        +     "</tr>"
        +   "</table>"
        + "</div>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 0 40px 18px;'>"

        // ── MALLOW ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 6px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #7BC8FF; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 5px;'>MW</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 14px; font-weight: bold; color: #7BC8FF; margin: 0 0 3px; letter-spacing: 1px;'>MALLOW</p>"
        +       "<p style='font-size: 9px; color: #7BC8FF; letter-spacing: 3px; margin: 0 0 8px;'>✨ MAGO ELEMENTAL — DAÑO MÁGICO / SANADOR</p>"
        +       "<p style='margin: 0; font-size: 13px; color: #D4C8A8;'>"
        +           "Un tierno llorón que curiosamente cree ser un <i>renacuajo</i>, "
        +           "criado por el sabio <b style='color: #F5EED4;'>Frogfucius</b>. "
        +           "Ideal para explotar debilidades enemigas con "
        +           "<b style='color: #7BC8FF;'>devastadores ataques de rayos</b> "
        +           "y ofrecer <b style='color: #98FF98;'>curación vital</b> para el equipo."
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        // ── BARRA DE STATS MALLOW ──
        + "<div style='text-align: left; margin: 10px 0 18px 52px; font-size: 11px; color: #888;'>"
        +   "<table style='border-collapse: collapse;'>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>FIS</td>"
        +       "<td><span style='color: #FF6B6B;'>████</span><span style='color: #333;'>████████</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Bajo</td>"
        +     "</tr>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>MAG</td>"
        +       "<td><span style='color: #7BC8FF;'>███████████</span><span style='color: #333;'>█</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Muy Alto</td>"
        +     "</tr>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>CUR</td>"
        +       "<td><span style='color: #98FF98;'>█████████</span><span style='color: #333;'>███</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Alto</td>"
        +     "</tr>"
        +   "</table>"
        + "</div>"

        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.12); margin: 0 40px 18px;'>"

        // ── GENO ──
        + "<table style='width: 100%; border-collapse: collapse; margin-bottom: 6px; text-align: left;'>"
        +   "<tr>"
        +     "<td style='vertical-align: top; padding: 0 16px 0 0; width: 36px;'>"
        +       "<span style='background: #FFF0A0; color: #000; font-family: monospace; font-size: 9px; font-weight: bold; letter-spacing: 1px; padding: 3px 6px;'>G</span>"
        +     "</td>"
        +     "<td style='vertical-align: top;'>"
        +       "<p style='font-size: 14px; font-weight: bold; color: #FFF0A0; margin: 0 0 3px; letter-spacing: 1px;'>GENO</p>"
        +       "<p style='font-size: 9px; color: #FFF0A0; letter-spacing: 3px; margin: 0 0 8px;'>&#9733; CAÑÓN DE CRISTAL — DAÑO ÚNICO / APOYO</p>"
        +       "<p style='margin: 0; font-size: 13px; color: #D4C8A8;'>"
        +           "Un <b style='color: #F5EED4;'>guerrero celestial</b> que ha poseído un muñeco de madera "
        +           "para restaurar la <b style='color: #FFF0A0;'>Vía Estelar</b>. "
        +           "Caracterizado por su <b style='color: #FFF0A0;'>altísima velocidad</b> y ataques mágicos devastadores "
        +           "que requieren una excelente precisión en los "
        +           "<b style='color: #FF9EFF;'>Comandos de Acción</b>."
        +       "</p>"
        +     "</td>"
        +   "</tr>"
        + "</table>"

        // ── BARRA DE STATS GENO ──
        + "<div style='text-align: left; margin: 10px 0 18px 52px; font-size: 11px; color: #888;'>"
        +   "<table style='border-collapse: collapse;'>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>MAG</td>"
        +       "<td><span style='color: #FFF0A0;'>████████████</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Máximo</td>"
        +     "</tr>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>VEL</td>"
        +       "<td><span style='color: #FFF0A0;'>████████████</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Máximo</td>"
        +     "</tr>"
        +     "<tr>"
        +       "<td style='padding: 2px 10px 2px 0; color: #B8960C; letter-spacing: 1px;'>DEF</td>"
        +       "<td><span style='color: #FF6B6B;'>███</span><span style='color: #333;'>█████████</span></td>"
        +       "<td style='padding-left: 8px; color: #888; font-size: 10px;'>Muy Bajo</td>"
        +     "</tr>"
        +   "</table>"
        + "</div>"

        // ── ORNAMENTO FINAL ──
        + "<hr style='border: none; border-top: 1px solid rgba(255,215,0,0.3); margin: 0 40px 14px;'>"
        + "<p style='font-size: 18px; color: #FFD700; margin: 0 0 8px; letter-spacing: 8px;'>✦ ★ ✦</p>"
        + "<p style='font-size: 9px; color: #B8960C; letter-spacing: 3px; margin: 0;'>FORMA TU EQUIPO Y SALVA LA VÍA ESTELAR</p>"

        + "</body></html>";
        
        
        
        seccion.setText("SINOPSIS DE LA HISTORIA");
        pagina.setText("1 / 4");
        cuerpoInfo.getEngine().loadContent(seccion1);
        
        imgF = new Image(getClass().getResource("/img/fondoInstrucciones.png").toExternalForm());
        imgFondo.setImage(imgF);
    }    
    
    @FXML
    private void volverPagina(ActionEvent event) {
        switch (c) {
            case 1:
                
                break;
            case 2:
                seccion.setText("SINOPSIS DE LA HISTORIA");
                pagina.setText("1 / 4");
                cuerpoInfo.getEngine().loadContent(seccion1);
                c--;
                break;
            case 3:
                seccion.setText("MECÁNICAS DE JUEGO");
                pagina.setText("2 / 4");
                cuerpoInfo.getEngine().loadContent(seccion2);
                c--;
                break;
            case 4:
                seccion.setText("INFORMACIÓN DEL PROYECTO");
                pagina.setText("3 / 4");
                cuerpoInfo.getEngine().loadContent(seccion3);
                c--;
                break;
        }
    }

    @FXML
    private void pasarPagina(ActionEvent event) {
        switch (c) {
            case 1:
                seccion.setText("MECÁNICAS DE JUEGO");
                pagina.setText("2 / 4");
                cuerpoInfo.getEngine().loadContent(seccion2);
                c++;
                break;
            case 2:
                seccion.setText("INFORMACIÓN DEL PROYECTO");
                pagina.setText("3 / 4");
                cuerpoInfo.getEngine().loadContent(seccion3);
                c++;
                break;
            case 3:
                seccion.setText("PERSONAJES");
                pagina.setText("4 / 4");
                cuerpoInfo.getEngine().loadContent(seccion4);
                c++;
                break;
            case 4:
                
                break;
        }
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
