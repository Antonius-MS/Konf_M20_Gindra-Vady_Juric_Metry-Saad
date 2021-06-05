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

    @Test
    @DisplayName("Testing report for non alcoholic drink sales")
    void testReportNonAlcoholicDrinksSales() {
        blackCoffee.setPrice(6); // 3€ for 1 black coffee that is 0.5L
        blackCoffee.sell();
        heineken.setPrice(10); // 2€ for 1 heineken that is 0.2L
        heineken.sell();
        aW.setPrice(3); // 1.2€ for 1 aW that is 0.4L
        aW.sell();
        registrierkasse.buyDrink("Schwarzer Kaffee", "Friday 04.06.2021");
        registrierkasse.buyDrink("Schwarzer Kaffee", "Saturday 05.06.2021");
        registrierkasse.buyDrink("Heineken", "Sunday 06.06.2021");
        registrierkasse.buyDrink("Heineken", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Tuesday 01.06.2021");
        assertEquals(8.4, registrierkasse.reportNonAlcoholicDrinksSales());
    }
    @Test
    @DisplayName("Testing report for low alcoholic drink sales")
    void testReportLowAlcoholicDrinks() {
        blackCoffee.setPrice(6); // 3€ for 1 black coffee
        blackCoffee.sell();
        heineken.setPrice(10); // 2€ for 1 heineken that is 0.2L
        heineken.sell();
        aW.setPrice(5); // 1.2€ for 1 aW that is 0.4L
        aW.sell();
        registrierkasse.buyDrink("Schwarzer Kaffee", "Friday 04.06.2021");
        registrierkasse.buyDrink("Schwarzer Kaffee", "Saturday 05.06.2021");
        registrierkasse.buyDrink("Heineken", "Sunday 06.06.2021");
        registrierkasse.buyDrink("Heineken", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Tuesday 01.06.2021");
        assertEquals(4, registrierkasse.reportLowAlcoholicDrinks());
    }
    @Test
    @DisplayName("Testing report for high alcoholic drink sales")
    void testReportHighAlcoholicDrinks() {
        blackCoffee.setPrice(6); // 3€ for 1 black coffee that is 0.5L
        blackCoffee.sell();
        heineken.setPrice(10); // 2€ for 1 heineken that is 0.2L
        heineken.sell();
        aW.setPrice(3); // 1.2€ for 1 aW that is 0.4L
        aW.sell();
        registrierkasse.buyDrink("Schwarzer Kaffee", "Friday 04.06.2021");
        registrierkasse.buyDrink("Schwarzer Kaffee", "Saturday 05.06.2021");
        registrierkasse.buyDrink("Heineken", "Sunday 06.06.2021");
        registrierkasse.buyDrink("Heineken", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Tuesday 01.06.2021");
        assertEquals(0.0, registrierkasse.reportHighAlcoholicDrinks());
    }
    @Test
    @DisplayName("Testing report for drink sales on date")
    void testReportDrinksOnDate() {
        blackCoffee.setPrice(6); // 3€ for 1 black coffee that is 0.5L
        blackCoffee.sell();
        heineken.setPrice(10); // 2€ for 1 heineken that is 0.2L
        heineken.sell();
        aW.setPrice(3); // 1.2€ for 1 aW that is 0.4L
        aW.sell();
        registrierkasse.buyDrink("Schwarzer Kaffee", "Friday 04.06.2021");
        registrierkasse.buyDrink("Schwarzer Kaffee", "Saturday 05.06.2021");
        registrierkasse.buyDrink("Heineken", "Sunday 06.06.2021");
        registrierkasse.buyDrink("Heineken", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Tuesday 01.06.2021");
        assertEquals(6.2, registrierkasse.reportDrinksOnDate("Saturday 05.06.2021"));
    }
    @Test
    @DisplayName("Testing report for drink sales from seller")
    void testReportDrinksFromPerson() {
        // Monday, Friday and Saturday Max Mustermann sells the drinks
        // All other days Katrin Musterfrau sells the drinks
        blackCoffee.setPrice(6); // 3€ for 1 black coffee that is 0.5L
        blackCoffee.sell();
        heineken.setPrice(10); // 2€ for 1 heineken that is 0.2L
        heineken.sell();
        aW.setPrice(3); // 1.2€ for 1 aW that is 0.4L
        aW.sell();
        registrierkasse.buyDrink("Schwarzer Kaffee", "Friday 04.06.2021");
        registrierkasse.buyDrink("Schwarzer Kaffee", "Saturday 05.06.2021");
        registrierkasse.buyDrink("Heineken", "Sunday 06.06.2021");
        registrierkasse.buyDrink("Heineken", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Tuesday 01.06.2021");
        assertEquals(3.2, registrierkasse.reportDrinksFromPerson("Katrin Musterfrau"));
    }
    @Test
    @DisplayName("Testing report for drink sales on date and from seller")
    void testReportDrinksFromPersonAndOnDate() {
        // Monday, Friday and Saturday Max Mustermann sells the drinks
        // All other days Katrin Musterfrau sells the drinks
        blackCoffee.setPrice(6); // 3€ for 1 black coffee that is 0.5L
        blackCoffee.sell();
        heineken.setPrice(10); // 2€ for 1 heineken that is 0.2L
        heineken.sell();
        aW.setPrice(3); // 1.2€ for 1 aW that is 0.4L
        aW.sell();
        registrierkasse.buyDrink("Schwarzer Kaffee", "Friday 04.06.2021");
        registrierkasse.buyDrink("Schwarzer Kaffee", "Saturday 05.06.2021");
        registrierkasse.buyDrink("Heineken", "Sunday 06.06.2021");
        registrierkasse.buyDrink("Heineken", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Saturday 05.06.2021");
        registrierkasse.buyDrink("aW", "Tuesday 01.06.2021");
        assertEquals(3.0, registrierkasse.reportDrinksFromPersonAndOnDate("Max Mustermann", "Friday 04.06.2021"));
    }

}