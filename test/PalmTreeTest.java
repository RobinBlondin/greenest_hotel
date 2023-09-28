import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTreeTest {

    Vegetation palm = new PalmTree("Laura", 5);

    @Test
    public final void waterPlant() {
        assertEquals(2.5, palm.waterPlant());
    }
}