module ijse.gdse.navigations {
    requires javafx.controls;
    requires javafx.fxml;


    opens ijse.gdse.navigations.controller to javafx.fxml;
    exports ijse.gdse.navigations;
}