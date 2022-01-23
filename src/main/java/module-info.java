module com.firesword.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.firesword to javafx.fxml;
    opens com.firesword.controller to javafx.fxml;
    exports com.firesword;
}