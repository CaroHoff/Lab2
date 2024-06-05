module com.example.databasedemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.databasedemo to javafx.fxml;
    exports com.example.databasedemo;
}