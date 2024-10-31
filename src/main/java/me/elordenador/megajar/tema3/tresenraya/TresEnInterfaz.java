package me.elordenador.megajar.tema3.tresenraya;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TresEnInterfaz extends Application {
    private pAudioPlayer player;
    public static TresEnInterfaz instance;

    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        instance = this;
        player = new pAudioPlayer();
        Parent root = FXMLLoader.load(getClass().getResource("/me/elordenador/megajar/tema3/tresenraya/main.fxml"));

        Scene scene = new Scene(root, 300, 275);

        stage.setTitle("Tres en Raya");
        stage.setScene(scene);
        stage.show();
        player.playBackground();
    }

    public pAudioPlayer getPlayer() {
        return player;
    }
}
