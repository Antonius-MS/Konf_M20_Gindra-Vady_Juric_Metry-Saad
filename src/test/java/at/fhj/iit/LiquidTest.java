package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Creates a liquid and tests if expected output is the same as actual output
 *
 * @author Antonius Metry Saad
 */
@DisplayName("Testing Liquid implementation")
class LiquidTest {
    private Liquid liquid;

    @BeforeEach
    void setUp() {
        liquid = new Liquid("Water", 1, 0);
    }

    @Test
    @DisplayName("Testing constructor of liquid")
    void testConstructor(){
        assertEquals("Water", liquid.getName());
        assertEquals(1, liquid.getVolume());
        assertEquals(0, liquid.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing name getter of liquid")
    void testNameGetter() {
        assertEquals("Water", liquid.getName());
    }

    @Test
    @DisplayName("Testing name setter of liquid")
    void testNameSetter() {
        liquid.setName("Wine");
        assertEquals("Wine", liquid.getName());
    }

    @Test
    @DisplayName("Testing volume getter of liquid")
    void testVolumeGetter() {
        assertEquals(1, liquid.getVolume());
    }

    @Test
    @DisplayName("Testing volume setter of liquid")
    void testVolumeSetter() {
        liquid.setVolume(2);
        assertEquals(2, liquid.getVolume());
    }

    @Test
    @DisplayName("Testing alcohol percentage getter of liquid")
    void testAlcoholPercentGetter() {
        assertEquals(liquid.getAlcoholPercent(), 0);
    }

    @Test
    @DisplayName("Testing alcohol percentage setter of liquid")
    void testAlcoholPercentSetter() {
        liquid.setAlcoholPercent(1);
        assertEquals(liquid.getAlcoholPercent(), 1);
    }


}