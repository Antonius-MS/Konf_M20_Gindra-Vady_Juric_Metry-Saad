package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Carries out tests on all methods from ImportantSellInformationTest class
 *
 * @author Antonius Metry Saad
 */
@DisplayName("Testing ImportantSellInformationTest implementation")
public class ImportantSellInformationTest {
    private ImportantSellInformation importantSellInformation;

    @BeforeEach
    void setUp() {
        importantSellInformation = new ImportantSellInformation("Heineken", 1.0, 5, "Friday 04.06.2021", "Max Mustermann");
    }

    @Test
    @DisplayName("Testing getter of sold heineken beer")
    void testGetDrinkName() {
        assertEquals("Heineken", importantSellInformation.getDrinkName());
    }

    @Test
    @DisplayName("Testing getter of the seller of sold heineken beer")
    void testGetSellerName() {
        assertEquals("Max Mustermann", importantSellInformation.getSellerName());
    }

    @Test
    @DisplayName("Testing getter of date of sold heineken beer")
    void testGetDate() {
        assertEquals("Friday 04.06.2021", importantSellInformation.getDate());
    }

    @Test
    @DisplayName("Testing getter of price of sold heineken beer")
    void testGetPrice() {
        assertEquals(1.0, importantSellInformation.getPrice());
    }

    @Test
    @DisplayName("Testing getter of alcohol percentage of sold heineken beer")
    void testGetAlcoholPercentage() {
        assertEquals(5.0, importantSellInformation.getAlcoholPercentage());
    }

}