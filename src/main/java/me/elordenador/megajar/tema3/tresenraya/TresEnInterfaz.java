package me.elordenador.megajar.tema3.tresenraya;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TresEnInterfaz extends Application {


    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/me/elordenador/megajar/tema3/tresenraya/main.fxml"));

        Scene scene = new Scene(root, 300, 275);

        stage.setTitle("Tres en Raya");
        stage.setScene(scene);
        stage.show();
    }
}
