package me.elordenador.megajar.tema3.tresenraya.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
public class AboutScene extends Application {

    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/me/elordenador/megajar/tema3/tresenraya/about.fxml"));
        Scene scene = new Scene(root, 400, 200);
        window.setScene(scene);
        window.show();

    }
}
