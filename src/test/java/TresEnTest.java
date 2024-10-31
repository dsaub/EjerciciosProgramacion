import me.elordenador.megajar.tema3.tresenraya.Bot;
import me.elordenador.megajar.tema3.tresenraya.Tablero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TresEnTest {
    @Test
    @DisplayName("Can create table")
    public void can_create_table() {
        Tablero tablero = new Tablero();
        tablero.generateTable();
    }

    @Test
    public void can_play_with_bot() {
        Tablero tablero = new Tablero();
        tablero.generateTable();
        Bot bot = new Bot(tablero, "O");
        tablero = bot.play();
        assertEquals("O", tablero.getCell(1,1).getState());
    }
}
