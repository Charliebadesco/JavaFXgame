module groupprojet {
    requires javafx.controls;
    requires javafx.fxml;

    opens groupprojet to javafx.fxml;
    exports groupprojet;
}
