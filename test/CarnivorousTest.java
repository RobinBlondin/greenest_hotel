import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {
    Carnivorous carnivorous = new Carnivorous("Meatloaf", 0.7);
    @Test
    public final void waterPlant() {
        assertEquals(0.24, carnivorous.waterPlant());
    }
}