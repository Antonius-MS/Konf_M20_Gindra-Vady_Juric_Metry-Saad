package at.fhj.iit;
/**
 * Interface for drinks that can be sold
 *
 * @author Valentina Juric
 */
public interface Sellable {
    /**
     * Sets the price of the drink
     *
     * @param price price of the drink
     */
    void setPrice(int price);
    /**
     * Gets the price of the drink
     *
     * @return price of the drink
     */
    double getPrice();
    /**
     * Gets the name of the drink
     *
     * @return drink name
     */
    String getName();
    /**
     * Gets the alcohol percentage of the drink
     *
     * @return alcohol percentage
     */
    double getAlcoholPercent();
    /**
     * Sells the drink
     */
    void sell();
}