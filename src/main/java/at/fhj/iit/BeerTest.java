package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing Beer Class")
public class testBeer {
    private Beer heineken;
    private Beer goesser;

    /**
     * Creates two new beers
     * @results inits three beers that are different for each test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        heineken = new Beer("Heineken", true);
        goesser = new Beer("Goesser", false);
    }

    /**
     * Get attributes of Heineken
     * @result Valid values for the attributes name, volume, sugarSpoon, coffeSpoon will be returned
     */
    @Test
    @DisplayName("Testing constructor for Heineken Beer")
    public void testConstructorHeineken(){
        assertEquals("Heineken", heineken.getName());
        assertEquals(true, heineken.getBottleIsClosed());
    }

    /**
     * tests the constructor for Gösser Beer
     */
    @Test
    @DisplayName("Testing constructor for Gösser")
    public void testConstructorGoesser(){
        assertEquals("Goesser", goesser.getName());
        assertEquals(false, goesser.getBottleIsClosed());
    }

    /**
     * tests isAlcoholic getter for Heineken Beer
     */
    @Test
    @DisplayName("Testing isAlcoholic getter for Heineken Beer")
    public void testIsAlcoholicGetterHeineken(){
        assertEquals(true, heineken.isAlcoholic());
    }

    /**
     * tests isAlcoholic getter for Gösser Beer
     */
    @Test
    @DisplayName("Testing isAlcoholic getter for Gösser Beer")
    public void testIsAlcoholicGetterGoesser(){
        assertEquals(true, goesser.isAlcoholic());
    }

    /**
     * tests getAlcoholPercent for Heineken
     */
    @Test
    @DisplayName("Testing getAlcoholPercent for Heineken")
    public void testAlcoholPercentHeineken(){
        assertEquals(5, heineken.getAlcoholPercent());
    }

    /**
     * tests getAlcoholPercent for Gösser
     */
    @Test
    @DisplayName("Testing getAlcoholPercent for Gösser")
    public void testAlcoholPercentGoesser(){
        assertEquals(5, goesser.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing volume getter for Heineken")
    public void testVolumeGetterHeineken(){
        assertEquals(0.3, heineken.getVolume());
    }

    @Test
    @DisplayName("Testing volume getter for Gösser")
    public void testVolumeGetterGoesser(){
        assertEquals(0.3, goesser.getVolume());
    }

    @Test
    @DisplayName("Testing getBottleClosed getter for Heineken")
    public void testGetBottleHeineken(){
        assertEquals(true, heineken.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing getBottleClosed getter for Gösser")
    public void testGetBottleClosedGoesser(){
        assertEquals(false, goesser.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing setBottleClosed getter for Heineken")
    public void testSetBottleHeineken(){
        heineken.setBottleIsClosed(false);
        assertEquals(false, heineken.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing setBottleClosed getter for Gösser")
    public void testSetBottleClosedGoesser(){
        goesser.setBottleIsClosed(true);
        assertEquals(true, goesser.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing getName for Heineken")
    public void testGetNameHeineken(){
        assertEquals("Heineken", heineken.getName());
    }

    @Test
    @DisplayName("Testing getName for Gösser")
    public void testGetNameGoesser(){
        assertEquals("Goesser", goesser.getName());
    }

    @Test
    @DisplayName("Testing openBottle for Heineken")
    public void testOpenBottleHeineken(){
        heineken.openBottle(true);
        assertEquals(false, heineken.getBottleIsClosed());
    }

    @Test
    @DisplayName("Testing openBottle for Gösser")
    public void testOpenBottleGoesser(){
        heineken.openBottle(false);
        assertEquals(false, goesser.getBottleIsClosed());
    }

    @Test
    @DisplayName("Test NullPointerException")
    public void testUnvalidInput(){
        heineken = null;
        Throwable throwable =  Assertions.assertThrows(Throwable.class, () -> {
            heineken.getName();
        });
        assertEquals(NullPointerException.class, throwable.getClass());
    }
}