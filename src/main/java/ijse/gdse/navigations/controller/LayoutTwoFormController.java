package ijse.gdse.navigations.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/25/2024 2:21 PM
 * Project: Navigations
 * --------------------------------------------
 **/

public class LayoutTwoFormController {
    @FXML
    public AnchorPane pageTwo;

    @FXML
    public void btnPrevOnAction(ActionEvent actionEvent) throws IOException {
        pageTwo.getChildren().clear();
        pageTwo.getChildren().add(FXMLLoader
                .load(getClass()
                        .getResource("/view/LayoutOneForm.fxml")));
    }


}
