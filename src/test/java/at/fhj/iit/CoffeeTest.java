

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
    private Coffee coldCoffee;
    private Coffee longBlack;

    /**
     * inits three coffees that are completely different for each test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        // Create three new Coffees
        longBlack = new Coffee("Schwarzer Kaffee", new Liquid("Hot Water", 0.5, 0), 3, 0, false);
        coldCoffee = new Coffee("Kalter Kaffee", new Liquid("Cold Water", 0.3, 0), 2, 1, true);
    }

    @Test
    @DisplayName("Testing constructor of long black coffee")
    public void testConstructorLongBlack(){
        // Call getter of name, volume, coffeeSpoon and isWithMilk and compare to expected value
        assertEquals("Schwarzer Kaffee", longBlack.getName());
        assertEquals(0.5, longBlack.getVolume());
        assertEquals(3, longBlack.getCoffeeSpoon());
        assertEquals(0, longBlack.getSugarSpoon());
        assertEquals(false, longBlack.isWithMilk());
    }

    @Test
    @DisplayName("Testing constructor of cold coffee")
    public void testConstructorColdCoffee(){
        // Call getter of name, volume, coffeeSpoon and isWithMilk and compare to expected value
        assertEquals("Kalter Kaffee", coldCoffee.getName());
        assertEquals(0.3, coldCoffee.getVolume());
        assertEquals(2, coldCoffee.getCoffeeSpoon());
        assertEquals(1, coldCoffee.getSugarSpoon());
        assertEquals(true, coldCoffee.isWithMilk());
    }



    @Test
    @DisplayName("Testing isAlcoholic getter of long black coffee")
    public void testIsAlcoholicGetterLongBlack(){
        // Call getter of isAlcoholic and compare to expected value
        assertEquals(false, longBlack.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of cold coffee")
    public void testIsAlcoholicGetterColdCoffee(){
        // Call getter of isAlcoholic and compare to expected value
        assertEquals(false, coldCoffee.isAlcoholic());
    }


    @Test
    @DisplayName("Testing alcoholPercent getter of long black coffee")
    public void testAlcoholPercentLongBlack(){
        // Call getter of alcoholPercent and compare to expected value
        assertEquals(0, longBlack.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing alcoholPercent getter of cold coffee")
    public void testAlcoholPercentColdCoffee(){
        // Call getter of alcoholPercent and compare to expected value
        assertEquals(0, coldCoffee.getAlcoholPercent());
    }


    @Test
    @DisplayName("Testing volume getter of long black coffee")
    public void testVolumeGetterLongBlack(){
        // Call getter of volume and compare to expected value
        assertEquals(0.5, longBlack.getVolume());
    }

    @Test
    @DisplayName("Testing volume getter of cold coffee")
    public void testVolumeGetterColdCoffee(){
        // Call getter of volume and compare to expected value
        assertEquals(0.3, coldCoffee.getVolume());
    }

    @Test
    @DisplayName("Testing withMilk getter of long black coffee")
    public void testIsWithMilkGetterLongBlack(){
        // Call isWithMilk and compare to expected value
        assertEquals(false, longBlack.isWithMilk());
    }

    @Test
    @DisplayName("Testing withMilk getter of cold coffee")
    public void testIsWithMilkGetterColdCoffee(){
        // Call isWithMilk and compare to expected value
        assertEquals(true, coldCoffee.isWithMilk());
    }




    @Test
    @DisplayName("Testing name getter of long black coffee")
    public void testNameGetterLongBlack(){
        // Call getter of name and compare to expected value
        assertEquals("Schwarzer Kaffee", longBlack.getName());
    }



    @Test
    @DisplayName("Testing name getter of cold coffee coffee")
    public void testNameGetterColdCoffee(){
        // Call getter of name and compare to expected value
        assertEquals("Kalter Kaffee", coldCoffee.getName());
    }




    @Test
    @DisplayName("Testing coffee spoons getter of long black coffee")
    public void testCoffeeSpoonsGetterLongBlack(){
        // Call getter of coffeeSpoons and compare to expected value
        assertEquals(3, longBlack.getCoffeeSpoon());
    }

    @Test
    @DisplayName("Testing coffee spoons getter of cold coffee")
    public void testCoffeeSpoonsGetterColdCoffee(){
        // Call getter of coffeeSpoons and compare to expected value
        assertEquals(2, coldCoffee.getCoffeeSpoon());
    }


    @Test
    @DisplayName("Testing sugar spoons getter of long black coffee")
    public void testSugarSpoonsGetterLongBlack(){
        // Call getter of sugarSpoons and compare to expected value
        assertEquals(0, longBlack.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing sugar spoons getter of cold coffee")
    public void testSugarSpoonsGetterColdCoffee(){
        // Call getter of sugarSpoons and compare to expected value
        assertEquals(1, coldCoffee.getSugarSpoon());
    }




    @Test
    @DisplayName("Testing addSugarSpoon of long black coffee")
    public void testAddSugarSpoonLongBlack(){
        // Call addSugarSpoon with an specific amount and compare to expected value
        longBlack.addSugarSpoon(1);
        assertEquals(1, longBlack.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing addSugarSpoon of cold coffee")
    public void testAddSugarSpoonColdCoffee(){
        // Call addSugarSpoon with an specific amount and compare to expected value
        coldCoffee.addSugarSpoon(1);
        assertEquals(2, coldCoffee.getSugarSpoon());
    }



    @Test
    @DisplayName("Testing toString of long black coffee")
    public void testToStringLongBlack(){
        // Call toString and compare to expected value
        assertEquals("You ordered a coffee called Schwarzer Kaffee with 3 coffee spoons, 0 sugar spoons and without milk", longBlack.toString());
    }

    @Test
    @DisplayName("Testing toString of cold coffee")
    public void testToStringColdCoffee(){
        // Call toString and compare to expected value
        assertEquals("You ordered a coffee called Kalter Kaffee with 2 coffee spoons, 1 sugar spoons and with milk", coldCoffee.toString());
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
    @DisplayName("Testing NullPointerException for cold coffee")
    public void testNullPointerExceptionColdCoffee(){
        // Create null object and call getter of name and compare to expected value
        coldCoffee = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            coldCoffee.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }




}