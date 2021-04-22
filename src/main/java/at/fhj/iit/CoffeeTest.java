package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing Liquid implementation")
public class CoffeeTest {
    private Liquid lN, lA;
    private Coffee latte;
    private Coffee cappuccino;
    private Coffee longBlack;

    /**
     * inits three coffees that are completely different for each test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        longBlack = new Coffee("Schwarzer Kaffee", 150, 3, 0, false);
        latte = new Coffee("Kaffee Latte", 300, 2, 2, true);
        cappuccino = new Coffee("Cappuccino", 200, 1, 1, true);
    }

    @Test
    @DisplayName("Testing constructor of long black coffee")
    public void testConstructorLongBlack(){
        assertEquals("Schwarzer Kaffee", longBlack.getName());
        assertEquals(150, longBlack.getVolume());
        assertEquals(3, longBlack.getCoffeeSpoon());
        assertEquals(0, longBlack.getSugarSpoon());
        assertEquals(false, longBlack.isWithMilk());
    }

    @Test
    @DisplayName("Testing constructor of coffee latte")
    public void testConstructorLatte(){
        assertEquals("Kaffee Latte", latte.getName());
        assertEquals(300, latte.getVolume());
        assertEquals(2, latte.getCoffeeSpoon());
        assertEquals(2, latte.getSugarSpoon());
        assertEquals(true, latte.isWithMilk());
    }

    @Test
    @DisplayName("Testing constructor of cappuccino")
    public void testConstructorCapuccino(){
        assertEquals("Cappuccino", cappuccino.getName());
        assertEquals(200, cappuccino.getVolume());
        assertEquals(1, cappuccino.getCoffeeSpoon());
        assertEquals(1, cappuccino.getSugarSpoon());
        assertEquals(true, cappuccino.isWithMilk());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of long black coffee")
    public void testIsAlcoholicGetterLongBlack(){
        assertEquals(false, longBlack.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of coffee latte")
    public void testIsAlcoholicGetterLatte(){
        assertEquals(false, latte.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of cappuccino")
    public void testIsAlcoholicGetterCappuccino(){
        assertEquals(false, cappuccino.isAlcoholic());
    }

    @Test
    @DisplayName("Testing alcoholPercent getter of long black coffee")
    public void testAlcoholPercentLongBlack(){
        assertEquals(0, longBlack.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing alcoholPercent getter of coffee latte")
    public void testAlcoholPercentLatte(){
        assertEquals(0, latte.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing alcoholPercent getter of cappuccino")
    public void testAlcoholPercentCappuccino(){
        assertEquals(0, cappuccino.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing volume getter of long black coffee")
    public void testVolumeGetterLongBlack(){
        assertEquals(150, longBlack.getVolume());
    }

    @Test
    @DisplayName("Testing volume getter of coffee latte")
    public void testVolumeGetterLatte(){
        assertEquals(300, latte.getVolume());
    }

    @Test
    @DisplayName("Testing volume getter of cappuccino")
    public void testVolumeGetterCappuccino(){
        assertEquals(200, cappuccino.getVolume());
    }

    @Test
    @DisplayName("Testing withMilk getter of long black coffee")
    public void testIsWithMilkGetterLongBlack(){
        assertEquals(false, longBlack.isWithMilk());
    }

    @Test
    @DisplayName("Testing withMilk getter of coffee latte")
    public void testIsWithMilkGetterLatte(){
        assertEquals(true, latte.isWithMilk());
    }

    @Test
    @DisplayName("Testing withMilk getter of cappuccino")
    public void testIsWithMilkGetterCappuccino(){
        assertEquals(true, cappuccino.isWithMilk());
    }

    @Test
    @DisplayName("Testing name getter of long black coffee")
    public void testNameGetterLongBlack(){
        assertEquals("Schwarzer Kaffee", longBlack.getName());
    }

    @Test
    @DisplayName("Testing name getter of coffee latte")
    public void testNameGetterLatte(){
        assertEquals("Kaffee Latte", latte.getName());
    }

    @Test
    @DisplayName("Testing name getter of cappuccino")
    public void testNameGetterCappuccino(){
        assertEquals("Cappuccino", cappuccino.getName());
    }

    @Test
    @DisplayName("Testing coffee spoons getter of long black coffee")
    public void testCoffeeSpoonsGetterLongBlack(){
        assertEquals(3, longBlack.getCoffeeSpoon());
    }

    @Test
    @DisplayName("Testing coffee spoons getter of coffee latte")
    public void testCoffeeSpoonsGetterLatte(){
        assertEquals(2, latte.getCoffeeSpoon());
    }

    @Test
    @DisplayName("Testing coffee spoons getter of cappuccino")
    public void testCoffeeSpoonsGetterCappuccino(){
        assertEquals(1, cappuccino.getCoffeeSpoon());
    }

    @Test
    @DisplayName("Testing sugar spoons getter of long black coffee")
    public void testSugarSpoonsGetterLongBlack(){
        assertEquals(0, longBlack.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing sugar spoons getter of coffee latte")
    public void testSugarSpoonsGetterLatte(){
        assertEquals(2, latte.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing sugar spoons getter of cappuccino")
    public void testSugarSpoonsGetterCappuccino(){
        assertEquals(1, cappuccino.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing addSugarSpoon of long black coffee")
    public void testAddSugarSpoonLongBlack(){
        longBlack.addSugarSpoon(1);
        assertEquals(1, longBlack.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing addSugarSpoon of coffee latte")
    public void testAddSugarSpoonLatte(){
        latte.addSugarSpoon(3);
        assertEquals(5, latte.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing addSugarSpoon of cappuccino")
    public void testAddSugarSpoonCappuccino(){
        cappuccino.addSugarSpoon(0);
        assertEquals(1, cappuccino.getSugarSpoon());
    }

    @Test
    @DisplayName("Testing toString of long black coffee")
    public void testToStringLongBlack(){
        assertEquals("You ordered a coffee called Schwarzer Kaffee with 3 coffee spoons, 0 sugar spoons and without milk", longBlack.toString());
    }

    @Test
    @DisplayName("Testing toString of coffee latte")
    public void testToStringLatte(){
        assertEquals("You ordered a coffee called Kaffee Latte with 2 coffee spoons, 2 sugar spoons and with milk", latte.toString());
    }

    @Test
    @DisplayName("Testing toString of cappuccino")
    public void testToStringCappuccino(){
        assertEquals("You ordered a coffee called Cappuccino with 1 coffee spoons, 1 sugar spoons and with milk", cappuccino.toString());
    }

    @Test
    @DisplayName("Testing NullPointerException for long black coffee")
    public void testNullPointerExceptionLongBlack(){
        longBlack = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            longBlack.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }

    @Test
    @DisplayName("Testing NullPointerException for coffee latte")
    public void testNullPointerExceptionLatte(){
        latte = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            latte.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }

    @Test
    @DisplayName("Testing NullPointerException for cappuccino")
    public void testNullPointerExceptionCappuccino(){
        cappuccino = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            cappuccino.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }



}