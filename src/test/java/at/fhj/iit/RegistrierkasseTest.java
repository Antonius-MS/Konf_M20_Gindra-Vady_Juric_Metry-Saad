package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Carries out tests on all methods from RegistrierkasseTest class
 *
 * @author Valentina Juric
 */
@DisplayName("Testing RegistrierkasseTest Implementation")
public class RegistrierkasseTest {
    private Registrierkasse registrierkasse;
    private Coffee blackCoffee;
    private Beer heineken;
    private RootBeer aW;

    @BeforeEach
    void setUp() {
        Registrierkasse.drinksToSellList = new ArrayList<>();
        registrierkasse = new Registrierkasse();
        blackCoffee = new Coffee("Schwarzer Kaffee", new Liquid("Hot Water", 0.5, 0), 3, 0, false);
        heineken = new Beer("Heineken", new Liquid("Cold Water", 0.2, 5), true);
        aW = new RootBeer("aW", new Liquid("Lemonade", 0.4, 0), false);
    }

    @Test
    @DisplayName("Testing valid purchase of drink from Registrierkasse")
    void testValidBuyBlackCoffee() {
        blackCoffee.setPrice(10);
        blackCoffee.sell();
        String result = registrierkasse.buyDrink("Schwarzer Kaffee", "Friday 04.06.2021");
        assertEquals("The Schwarzer Kaffee costed 5.0€ and was sold by Max Mustermann. Thank you for your purchase!", result);
    }

    @Test
    @DisplayName("Testing invalid purchase of drink from Registrierkasse")
    void testInvalidBuyHeineken() {
        heineken.sell();
        String result = registrierkasse.buyDrink("Heineken", "Friday 04.06.2021");
        assertEquals("We don't sell this product yet!", result);
    }

    @Test
    @DisplayName("Testing not existing drink purchase of drink from Registrierkasse")
    void testNotExistingBuyHeineken() {
        String result = registrierkasse.buyDrink("Puntigamer", "Friday 04.06.2021");
        assertEquals("We don't have a product called Puntigamer!", result);
    }
}