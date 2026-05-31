module com.mycompany.supermariorpgjava.remake {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires MiLibreria;
    requires Jaco;
    requires javafx.media;
    requires javafx.web;
    
    opens com.mycompany.supermariorpgjava.remake to javafx.fxml;
    exports com.mycompany.supermariorpgjava.remake;
    requires javafx.mediaEmpty;
}
