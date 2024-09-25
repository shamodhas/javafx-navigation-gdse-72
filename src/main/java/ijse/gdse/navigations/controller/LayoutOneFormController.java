package ijse.gdse.navigations.controller;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/25/2024 12:14 PM
 * Project: Navigations
 * --------------------------------------------
 **/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class LayoutOneFormController {

    @FXML
    private AnchorPane pageOne;

    @FXML
    void btnNextOnAction(ActionEvent event) {
        System.out.println("clicked ...!");
    }

}
