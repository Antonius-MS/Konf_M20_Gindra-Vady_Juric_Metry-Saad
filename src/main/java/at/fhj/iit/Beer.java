package at.fhj.iit;
/**
 * <h1>Beer</h1>
 * <h2>Represents a beer</h2>
 * A beer can either be open or close
 * <p>
 * Last-Change: 31.05.2021
 * @author Valentina Juric
 */
public class Beer extends Drink {

    /**
     * bottle closed or not
     */
    private boolean bottleIsClosed;

    /**
     * represents a liquid
     */
    protected Liquid liquid;

    /**
     * Creates new beer with given name, liquid inside and
     * whether bottle is open or not
     *
     * @param name name of the beer
     * @param liquid liquid inside of beer
     * @param bottleIsClosed whether bottle is closed or not
     */
    public Beer (String name, Liquid liquid, boolean bottleIsClosed) {
        super(name);
        this.liquid = liquid;
        this.bottleIsClosed = bottleIsClosed;
    }

    /**
     * Getter for name
     *
     * @return name of beer
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for bottleIsClosed
     *
     * @return if bottle is closed or not
     */
    public boolean getBottleIsClosed() {
        return this.bottleIsClosed;
    }

    /**
     * Setter for bottleIsClosed
     *
     * @param bottleIsClosed new value
     */
    public void setBottleIsClosed(boolean bottleIsClosed) {
        this.bottleIsClosed = bottleIsClosed;
    }

    /**
     * Opens the bottle if its not already and prints text
     *
     * @param bottleClosed whether it is closed or already open
     */
    public void openBottle(boolean bottleClosed) {
        if (bottleClosed) {
            System.out.println("Opening bottle of your " + name + " beer...");
            setBottleIsClosed(false);
            System.out.println("The bottle is now open!");
        } else {
            System.out.println("Bottle is already open!");
        }
    }

    /**
     * Returns volume of the beer
     *
     * @return the volume of beer in liter
     */
    @Override
    public double getVolume() {
        return liquid.getVolume();
    }

    /**
     * Returns alcohol percentage of beer
     *
     * @return alcohol percentage of a beer
     */
    @Override
    public double getAlcoholPercent() {
        return liquid.getAlcoholPercent();
    }

    /**
     * Returns if beer is alcoholic
     *
     * @return if beer is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        if(liquid.getAlcoholPercent() > 0)
            return true;
        else
            return false;
    }
}