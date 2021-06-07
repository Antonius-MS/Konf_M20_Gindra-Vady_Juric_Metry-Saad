package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Creates a simple drink and tests if expected output is the same as actual output
 *
 * @author Antonius Metry Saad
 */
@DisplayName("Testing SimpleDrink implementation")
class SimpleDrinkTest {

    private SimpleDrink drink;

    @BeforeEach
    void setUp() {
        drink = new SimpleDrink("Rotwein", new Liquid("Wine", 0.33, 5));
    }

    @Test
    @DisplayName("Testing constructor of SimpleDrink")
    void testSimpleDrinkConstructor(){
        assertEquals(drink.name, "Rotwein");
        assertEquals(drink.getAlcoholPercent(), 5);
        assertEquals(drink.getVolume(), 0.33);
    }

    @Test
    @DisplayName("Testing volume getter of SimpleDrink")
    void testVolumeGetter() {
        assertEquals(drink.getVolume(), 0.33);
    }

    @Test
    @DisplayName("Testing alcohol percent getter of SimpleDrink")
    void getAlcoholPercent() {
        assertEquals(drink.getAlcoholPercent(), 5);
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of SimpleDrink")
    void isAlcoholic() {
        assertEquals(drink.isAlcoholic(), true);
    }

    @Test
    @DisplayName("Testing toString of SimpleDrink")
    void testToString() {
        assertEquals(drink.toString(), "Simple Drink called " + "Rotwein" + " with " + "5.0" + " percent alcohol by volume");
    }
}
