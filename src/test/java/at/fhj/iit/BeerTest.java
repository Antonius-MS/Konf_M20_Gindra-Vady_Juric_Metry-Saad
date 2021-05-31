package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import at.fhj.iit.Beer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <h1>BeerTest</h1>
 * <h2>Tests the Beer class</h2>
 * carries out tests on all methods from Beer class
 * <p>
 * Last-Change: 31.05.2021
 * @author Valentina Juric
 */
@DisplayName("Testing Beer Class")
public class BeerTest {
    private Beer heineken;
    private Beer goesser;

    /**
     * Creates two new beers
     * @results inits two beers that are different for each test
     */
    @BeforeEach
    void setup() {
        // run before each test
        heineken = new Beer("Heineken", new Liquid("Cold Water", 0.33, 5), false);
        goesser = new Beer("Goesser", new Liquid("Cold Water", 0.33, 5), false);
    }

    @Test
    @DisplayName("Testing constructor for Heineken Beer")
    public void testConstructorHeineken(){
        // test the constructor of beer
        assertEquals("Heineken", heineken.getName());
        assertEquals("Cold Water", heineken.liquid.getName()); //TODO
        assertEquals(0.33, heineken.getVolume());
        assertEquals(5, heineken.getAlcoholPercent());
        assertEquals(false, heineken.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing constructor for Gösser")
    public void testConstructorGoesser(){
        // test the constructor of beer
        assertEquals("Goesser", goesser.getName());
        assertEquals("Cold Water", goesser.liquid.getName());
        assertEquals(0.33, goesser.getVolume());
        assertEquals(5, goesser.getAlcoholPercent());
        assertEquals(false, goesser.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter for Heineken Beer")
    public void testIsAlcoholicGetterHeineken(){
        // call isAlcoholic() getter
        assertEquals(true, heineken.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter for Gösser Beer")
    public void testIsAlcoholicGetterGoesser() {
        // call isAlcoholic() getter
        assertEquals(true, goesser.isAlcoholic());
    }

    @Test
    @DisplayName("Testing getAlcoholPercent for Heineken")
    public void testAlcoholPercentHeineken(){
        // test getAlcoholPercent() getter
        assertEquals(5, heineken.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing getAlcoholPercent for Gösser")
    public void testAlcoholPercentGoesser(){
        // test getAlcoholPercent() getter
        assertEquals(5, goesser.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing volume getter for Heineken")
    public void testVolumeGetterHeineken(){
        // test getVolume() getter
        assertEquals(0.33, heineken.getVolume());
    }

    @Test
    @DisplayName("Testing volume getter for Gösser")
    public void testVolumeGetterGoesser(){
        // test getVolume() getter
        assertEquals(0.33, goesser.getVolume());
    }

    @Test
    @DisplayName("Testing getBottleClosed getter for Heineken")
    public void testGetBottleHeineken(){
        // test getBottleIsClosed() getter
        assertEquals(false, heineken.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing getBottleClosed getter for Gösser")
    public void testGetBottleClosedGoesser(){
        // test getBottleIsClosed() getter
        assertEquals(false, goesser.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing setBottleIsClosed getter for Heineken")
    public void testSetBottleHeineken(){
        // test setBottleIsClosed() setter
        heineken.setBottleIsClosed(false);
        assertEquals(false, heineken.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing setBottleIsClosed getter for Gösser")
    public void testSetBottleClosedGoesser(){
        // test setBottleIsClosed() setter
        goesser.setBottleIsClosed(true);
        assertEquals(true, goesser.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing getName for Heineken")
    public void testGetNameHeineken(){
        // test getName() getter
        assertEquals("Heineken", heineken.getName());
    }

    @Test
    @DisplayName("Testing getName for Gösser")
    public void testGetNameGoesser(){
        // test getName() getter
        assertEquals("Goesser", goesser.getName());
    }

    @Test
    @DisplayName("Testing openBottle for Heineken")
    public void testOpenBottleHeineken(){
        // call the openBottle() method
        heineken.openBottle(true);
        assertEquals(false, heineken.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing openBottle for Gösser")
    public void testOpenBottleGoesser(){
        // call the openBottle() method
        heineken.openBottle(false);
        assertEquals(false, goesser.getBottleIsClosed());
    }

    @Test
    @DisplayName("Test NullPointerException")
    public void testUnvalidInput(){
        // test NullPointerException
        heineken = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            heineken.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }
}