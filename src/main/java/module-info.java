module com.example.rounderjavafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rounderjavafx2 to javafx.fxml;
    exports com.example.rounderjavafx2;
    exports com.example.rounderjavafx2.controller;
    opens com.example.rounderjavafx2.controller to javafx.fxml;
}