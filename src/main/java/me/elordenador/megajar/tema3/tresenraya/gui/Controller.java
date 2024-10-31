package me.elordenador.megajar.tema3.tresenraya.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import me.elordenador.megajar.tema3.tresenraya.Bot;
import me.elordenador.megajar.tema3.tresenraya.Tablero;
import me.elordenador.megajar.tema3.tresenraya.TresEnInterfaz;
import me.elordenador.megajar.tema3.tresenraya.pAudioPlayer;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Controller {
    private boolean isPlaying = true;
    private TresEnInterfaz tresEnInterfaz;
    private AboutScene aScene;
    private Tablero tablero;
    private Bot bot;
    private boolean salida;
    public Controller() {
        aScene = new AboutScene();
        tablero = new Tablero();
        bot = new Bot(tablero, "O");
        salida = false;
        tresEnInterfaz = TresEnInterfaz.instance;
    }
    @FXML
    private Button cell_0_0, cell_1_0, cell_2_0, cell_0_1, cell_1_1, cell_2_1, cell_0_2, cell_1_2, cell_2_2;

    @FXML
    private MenuItem quit, about, mute_btn;

    /**
     * This function will exit the software when Quit pressed
     */
    @FXML
    private void onQuitMenuPress() {
        System.exit(0);
    }

    @FXML
    private void onAboutMenuPress() throws Exception {
        Stage stage = (Stage) cell_0_0.getScene().getWindow();
        aScene.start(stage);
    }

   public void onCellPress(ActionEvent event) {
        if (salida) return;
        Button button = (Button) event.getSource();
        String[] splitted = button.getId().split("_");
        int x = Integer.parseInt(splitted[1]);
        int y = Integer.parseInt(splitted[2]);
        System.out.println("[LOG] Cell Pressed | X: "+x+", Y: "+y);
        if (tablero.try_to_take(x,y, "X")) {
            button.setText("X");
            int vacios = 0;
            for (int x1 = 0; x1 <= 2; x1++) {
                for (int y1 = 0; y1<= 2; y1++) {

                    if (!tablero.getCell(x1,y1).isTaken()) {
                        vacios++;
                    }
                }
            }
            if (vacios == 0) {
                salida = true;
            } else {
                update(bot.play());
            }


            if (!(tablero.getWinner().equals(" "))) {
                cell_0_0.setText(tablero.getWinner());
                cell_1_0.setText(tablero.getWinner());
                cell_2_0.setText(tablero.getWinner());
                cell_0_1.setText(tablero.getWinner());
                cell_1_1.setText(tablero.getWinner());
                cell_2_1.setText(tablero.getWinner());
                cell_0_2.setText(tablero.getWinner());
                cell_1_2.setText(tablero.getWinner());
                cell_2_2.setText(tablero.getWinner());
                cell_1_1.setText(tablero.getWinner());
            }


            System.out.println("[LOG] Numero de vacios: "+vacios);
            if (vacios == 0) {
                System.out.println("Hay tablas");
                salida = true;
            }
        }
   }

   private void update(Tablero tablero) {
        this.tablero = tablero;
        cell_0_0.setText(tablero.getCell(0,0).getState());
        cell_1_0.setText(tablero.getCell(1,0).getState());
        cell_2_0.setText(tablero.getCell(2,0).getState());
        cell_0_1.setText(tablero.getCell(0,1).getState());
        cell_1_1.setText(tablero.getCell(1,1).getState());
        cell_2_1.setText(tablero.getCell(2,1).getState());
        cell_0_2.setText(tablero.getCell(0,2).getState());
        cell_1_2.setText(tablero.getCell(1,2).getState());
        cell_2_2.setText(tablero.getCell(2,2).getState());
   }

    public void mutebtnpressed(ActionEvent actionEvent) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        pAudioPlayer player = tresEnInterfaz.getPlayer();
        if (isPlaying) {
            player.close();
            isPlaying = false;
        } else {
            player.playBackground();
            isPlaying = true;
        }
    }
}
