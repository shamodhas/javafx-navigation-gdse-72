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
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LayoutOneFormController {

    @FXML
    private AnchorPane pageOne;

    @FXML
    void btnNextOnAction(ActionEvent event) throws IOException {
        pageOne.getChildren().clear();
        AnchorPane load = FXMLLoader
                .load(getClass().getResource("/view/LayoutTwoForm.fxml"));
        pageOne.getChildren().add(load);
    }

    @FXML
    public TextField txtInput;

    @FXML
    public Label lblText;

    @FXML
    public void printOnAction(ActionEvent actionEvent) {
        String inputText = txtInput.getText();

        lblText.setText(inputText);

        System.out.println(inputText.equals("hello"));
    }
}
