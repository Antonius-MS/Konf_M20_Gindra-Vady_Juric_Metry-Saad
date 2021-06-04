package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import at.fhj.iit.RootBeer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Creates different RootBeers and tests if expected output is the same as actual output
 *
 * @author Gerwald Gindra-Vady
 */
@DisplayName("Testing RootBeer Implementation")
public class RootBeerTest {
    private RootBeer aW;
    private RootBeer bargs;
    private RootBeer mug;

    /**
     * inits three different RootBeers
     */
    @BeforeEach
    void setup() {
        aW = new RootBeer("AW", new Liquid("Lemonade", 0.5, 0), true);
        bargs = new RootBeer("Bargs", new Liquid("Lemonade", 0.25, 0),true);
        mug = new RootBeer("MUG", new Liquid("Limonade", 0.3, 0),false);
    }

    @Test
    @DisplayName("Testing constructor of aW")
    public void testConstructorAW(){
        assertEquals("AW", aW.getName());
        assertEquals(0.5, aW.getVolume());
        assertEquals(0, aW.getAlcoholPercent());
        assertEquals(true, aW.getIKnowRootBeer());
    }

    @Test
    @DisplayName("Testing constructor of bargs")
    public void testConstructorBargs(){
        assertEquals("Bargs", bargs.getName());
        assertEquals(0.25, bargs.getVolume());
        assertEquals(0, bargs.getAlcoholPercent());
        assertEquals(true, bargs.getIKnowRootBeer());
    }

    @Test
    @DisplayName("Testing constructor of MUG")
    public void testConstructorMug() {
        assertEquals("MUG", mug.getName());
        assertEquals(0.3, mug.getVolume());
        assertEquals(0, mug.getAlcoholPercent());
        assertEquals(false, mug.getIKnowRootBeer());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of aW")
    public void testIsAlcoholicGetterAW() {
        assertEquals(false, aW.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of bargs")
    public void testIsAlcoholicGetterBargs() {
        assertEquals(false, bargs.isAlcoholic());
    }

    @Test
    @DisplayName("Testing isAlcoholic getter of mug")
    public void testIsAlcoholicGetterMug() {
        assertEquals(false, mug.isAlcoholic());
    }

    @Test
    @DisplayName("Testing AlcoholPercent getter of aW")
    public void testAlcoholPercentGetterAW() {
        assertEquals(0, aW.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing AlcoholPercent getter of bargs")
    public void testAlcoholPercentGetterBargs() {
        assertEquals(0, bargs.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing AlcoholPercent getter of mug")
    public void testAlcoholPercentGetterMug() {
        assertEquals(0, mug.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing Volume getter of aW")
    public void testVolumeGetterAW() {
        assertEquals(0.5, aW.getVolume());
    }

    @Test
    @DisplayName("Testing Volume getter of bargs")
    public void testVolumeGetterBargs() {
        assertEquals(0.25, bargs.getVolume());
    }

    @Test
    @DisplayName("Testing Volume getter of mug")
    public void testVolumeGetterMug() {
        assertEquals(0.3, mug.getVolume());
    }

    @Test
    @DisplayName("Testing name getter of aW")
    public void testNameGetterAW(){
        assertEquals("AW", aW.getName());
    }

    @Test
    @DisplayName("Testing name getter of bargs")
    public void testNameGetterBargs(){
        assertEquals("Bargs", bargs.getName());
    }

    @Test
    @DisplayName("Testing name getter of mug")
    public void testNameGetterMug() {
        assertEquals("MUG", mug.getName());
    }

    @Test
    @DisplayName("RootBeer is known getter of aW")
    public void testIKnowRootBeerGetterAW() {
        assertEquals(true, aW.getIKnowRootBeer());
    }

    @Test
    @DisplayName("RootBeer is known getter of aW")
    public void testIKnowRootBeerGetterBargs() {
        assertEquals(true, bargs.getIKnowRootBeer());
    }

    @Test
    @DisplayName("RootBeer is known getter of aW")
    public void testIKnowRootBeerGetterMug() {
        assertEquals(false, mug.getIKnowRootBeer());
    }

    @Test
    @DisplayName("Testing Info getter of aW")
    public void testInfoGetterAW() {
        assertEquals("", aW.getInfo());
    }

    @Test
    @DisplayName("Testing Info getter of bargs")
    public void testInfoGetterBargs() {
        assertEquals("", bargs.getInfo());
    }

    @Test
    @DisplayName("Testing Info getter of mug")
    public void testInfoGetterMug() {
        assertEquals("", mug.getInfo());
    }

    @Test
    @DisplayName("Testing printInfo of aW")
    public void testPrintInfoAW() {
        aW.printInfo();
        assertEquals("Please enjoy this known Root Beer called " + aW.getName() + " with " + aW.getAlcoholPercent() + " percent alcohol by volume", aW.getInfo());
    }

    @Test
    @DisplayName("Testing printInfo of bargs")
    public void testPrintInfoBargs() {
        bargs.printInfo();
        assertEquals("Please enjoy this known Root Beer called " + bargs.getName() + " with " + bargs.getAlcoholPercent() + " percent alcohol by volume", bargs.getInfo());
    }   @Test
    @DisplayName("Testing printInfo of Mug")
    public void testPrintInfoMug() {
        mug.printInfo();
        assertEquals("Please enjoy this unknown Root Beer called " + mug.getName() + " with " + mug.getAlcoholPercent() + " percent alcohol by volume", mug.getInfo());
    }
}
