import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {

    Cactus cactus = new Cactus("Igge", 0.2);
    @Test
    public final void waterPlant() {
        assertEquals(0.02, cactus.waterPlant());
    }
}