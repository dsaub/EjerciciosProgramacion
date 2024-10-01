import me.elordenador.megajar.utils.ScrUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class MegaTest {
    @Test
    @DisplayName("I can clear screen")
    public void can_clear_screen() {
        int finished = 0;
        try {
            ScrUtils.clear();
            finished = 1;
        } catch (Exception e) {

        }
        Assertions.assertEquals(1, finished);
    }

}
