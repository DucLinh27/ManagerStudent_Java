module com.example.managerstudent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.managerstudent to javafx.fxml;
    exports com.example.managerstudent;
}