module com.javafx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.javafx to javafx.fxml;
    exports com.javafx;
    exports com.day01;
    opens com.javafx to javafx.fxml;
}