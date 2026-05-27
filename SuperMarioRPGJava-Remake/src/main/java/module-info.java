module com.mycompany.supermariorpgjava.remake {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.supermariorpgjava.remake to javafx.fxml;
    exports com.mycompany.supermariorpgjava.remake;
}
