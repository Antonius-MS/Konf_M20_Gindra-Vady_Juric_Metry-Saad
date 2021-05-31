package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import at.fhj.iit.Coffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <h1>CoffeeTest</h1>
 * <h2>Tests the methods in the Coffee Class</h2>
 * Creates three different coffees and tests if expected output is the same as actual output
 * <p>
 * Last-Change: 23.04.2021
 * @author Antonius Metry Saad
 */
@DisplayName("Testing Liquid implementation")
public class CoffeeTest {
    private Coffee latte;
    private Coffee cappuccino;
    private Coffee longBlack;

    /**
     * inits three coffees that are completely different for each test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        // Create three new Coffees
        longBlack = new Coffee("Schwarzer Kaffee", 150, 3, 0, false);
        latte = new Coffee("Kaffee Latte", 300, 2, 2, true);
        cappuccino = new Coffee("Cappuccino", 200, 1, 1, true);
    }

    @Test
    @DisplayName("Testing constructor of long black coffee")
    public void testConstructorLongBlack(){
        // Call getter of name, volume, coffeeSpoon and isWithMilk and compare to expected value
        assertEquals("Schwarzer Kaffee", longBlack.getName());
        assertEquals(150, longBlack.getVolume());
        assertEquals(3, longBlack.getCoffeeSpoon());
        assertEquals(0, longBlack.getSugarSpoon());
        assertEquals(false, longBlack.isWithMilk());
    }

    @Test
    @DisplayName("Testing constructor of coffee latte")
    public void testConstructorLatte(){
        // Call getter of name, volume, coffeeSpoon and isWithMilk and compare to expected value
        assertEquals("Kaffee Latte", latte.getName());
        assertEquals(300, latte.getVolume());
        assertEquals(2, latte.getCoffeeSpoon());
        assertEquals(2, latte.getSugarSpoon());
        assertEquals(true, latte.isWithMilk());
    }

    @Test
    @DisplayName("Testing constructor of cappuccino")
    public void testConstructorCapuccino(){
        // Call getter of name, volume, coffeeSpoon and isWithMilk and compare to expected value
        assertEquals("Cappuccino", cappuccino.getName());
        assertEquals(200, cappuccino.getVolume());
        assertEquals(1, cappuccino.getCoffeeSpoon());
        assertEquals(1, cappuccino.getSugarSpoon());
        assertEquals(true, cappuccino.isWithMilk());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of long black coffee")
    public void testIsAlcoholicGetterLongBlack(){
        // Call getter of isAlcoholic and compare to expected value
        assertEquals(false, longBlack.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of coffee latte")
    public void testIsAlcoholicGetterLatte(){
        // Call getter of isAlcoholic and compare to expected value
        assertEquals(false, latte.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of cappuccino")
    public void testIsAlcoholicGetterCappuccino(){
        // Call getter of isAlcoholic and compare to expected value
        assertEquals(false, cappuccino.isAlcoholic());
    }

    @Test
    @DisplayName("Testing alcoholPercent getter of long black coffee")
    public void testAlcoholPercentLongBlack(){
        // Call getter of alcoholPercent and compare to expected value
        assertEquals(0, longBlack.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing alcoholPercent getter of coffee latte")
    public void testAlcoholPercentLatte(){
        // Call getter of alcoholPercent and compare to expected value
        assertEquals(0, latte.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing alcoholPercent getter of cappuccino")
    public void testAlcoholPercentCappuccino(){
        // Call getter of alcoholPercent and compare to expected value
        assertEquals(0, cappuccino.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing volume getter of long black coffee")
    public void testVolumeGetterLongBlack(){
        // Call getter of volume and compare to expected value
        assertEquals(150, longBlack.getVolume());
    }

    @Test
    @DisplayName("Testing volume getter of coffee latte")
    public void testVolumeGetterLatte(){
        // Call getter of volume and compare to expected value
        assertEquals(300, latte.getVolume());
    }

    @Test
    @DisplayName("Testing volume getter of cappuccino")
    public void testVolumeGetterCappuccino(){
        // Call getter of volume and compare to expected value
        assertEquals(200, cappuccino.getVolume());
    }

    @Test
    @DisplayName("Testing withMilk getter of long black coffee")
    public void testIsWithMilkGetterLongBlack(){
        // Call isWithMilk and compare to expected value
        assertEquals(false, longBlack.isWithMilk());
    }

    @Test
    @DisplayName("Testing withMilk getter of coffee latte")
    public void testIsWithMilkGetterLatte(){
        // Call isWithMilk and compare to expected value
        assertEquals(true, latte.isWithMilk());
    }

    @Test
    @DisplayName("Testing withMilk getter of cappuccino")
    public void testIsWithMilkGetterCappuccino(){
        // Call isWithMilk and compare to expected value
        assertEquals(true, cappuccino.isWithMilk());
    }

    @Test
    @DisplayName("Testing name getter of long black coffee")
    public void testNameGetterLongBlack(){
        // Call getter of name and compare to expected value
        assertEquals("Schwarzer Kaffee", longBlack.getName());
    }

    @Test
    @DisplayName("Testing name getter of coffee latte")
    public void testNameGetterLatte(){
        // Call getter of name and compare to expected value
        assertEquals("Kaffee Latte", latte.getName());
    }

    @Test
    @DisplayName("Testing name getter of cappuccino")
    public void testNameGetterCappuccino(){
        // Call getter of name and compare to expected value
        assertEquals("Cappuccino", cappuccino.getName());
    }

    @Test
    @DisplayName("Testing coffee spoons getter of long black coffee")
    public void testCoffeeSpoonsGetterLongBlack(){
        // Call getter of coffeeSpoons and compare to expected value
        assertEquals(3, longBlack.getCoffeeSpoon());
    }

    @Test
    @DisplayName("Testing coffee spoons getter of coffee latte")
    public void testCoffeeSpoonsGetterLatte(){
        // Call getter of coffeeSpoons and compare to expected value
        assertEquals(2, latte.getCoffeeSpoon());
    }

    @Test
    @DisplayName("Testing coffee spoons getter of cappuccino")
    public void testCoffeeSpoonsGetterCappuccino(){
        // Call getter of coffeeSpoons and compare to expected value
        assertEquals(1, cappuccino.getCoffeeSpoon());
    }

    @Test
    @DisplayName("Testing sugar spoons getter of long black coffee")
    public void testSugarSpoonsGetterLongBlack(){
        // Call getter of sugarSpoons and compare to expected value
        assertEquals(0, longBlack.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing sugar spoons getter of coffee latte")
    public void testSugarSpoonsGetterLatte(){
        // Call getter of sugarSpoons and compare to expected value
        assertEquals(2, latte.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing sugar spoons getter of cappuccino")
    public void testSugarSpoonsGetterCappuccino(){
        // Call getter of sugarSpoons and compare to expected value
        assertEquals(1, cappuccino.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing addSugarSpoon of long black coffee")
    public void testAddSugarSpoonLongBlack(){
        // Call addSugarSpoon with an specific amount and compare to expected value
        longBlack.addSugarSpoon(1);
        assertEquals(1, longBlack.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing addSugarSpoon of coffee latte")
    public void testAddSugarSpoonLatte(){
        // Call addSugarSpoon with an specific amount and compare to expected value
        latte.addSugarSpoon(3);
        assertEquals(5, latte.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing addSugarSpoon of cappuccino")
    public void testAddSugarSpoonCappuccino(){
        // Call addSugarSpoon with an specific amount and compare to expected value
        cappuccino.addSugarSpoon(0);
        assertEquals(1, cappuccino.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing toString of long black coffee")
    public void testToStringLongBlack(){
        // Call toString and compare to expected value
        assertEquals("You ordered a coffee called Schwarzer Kaffee with 3 coffee spoons, 0 sugar spoons and without milk", longBlack.toString());
    }

    @Test
    @DisplayName("Testing toString of coffee latte")
    public void testToStringLatte(){
        // Call toString and compare to expected value
        assertEquals("You ordered a coffee called Kaffee Latte with 2 coffee spoons, 2 sugar spoons and with milk", latte.toString());
    }

    @Test
    @DisplayName("Testing toString of cappuccino")
    public void testToStringCappuccino(){
        // Call toString and compare to expected value
        assertEquals("You ordered a coffee called Cappuccino with 1 coffee spoons, 1 sugar spoons and with milk", cappuccino.toString());
    }

    @Test
    @DisplayName("Testing NullPointerException for long black coffee")
    public void testNullPointerExceptionLongBlack(){
        // Create null object and call getter of name and compare to expected value
        longBlack = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            longBlack.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }

    @Test
    @DisplayName("Testing NullPointerException for coffee latte")
    public void testNullPointerExceptionLatte(){
        // Create null object and call getter of name and compare to expected value
        latte = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            latte.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }

    @Test
    @DisplayName("Testing NullPointerException for cappuccino")
    public void testNullPointerExceptionCappuccino(){
        // Create null object and call getter of name and compare to expected value
        cappuccino = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            cappuccino.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }


}