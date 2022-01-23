module com.firesword.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens com.firesword to javafx.fxml;
    opens com.firesword.controller to javafx.fxml;

    exports com.firesword;
}
