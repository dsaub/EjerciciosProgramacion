package me.elordenador.megajar.tema3.tresenraya.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import me.elordenador.megajar.tema3.tresenraya.TresEnInterfaz;

public class AboutController {
    @FXML
    private Button closeBtn;

    @FXML
    private void closeAbout() {
        Stage stage = (Stage) closeBtn.getScene().getWindow();

    }
}
