package at.fhj.iit;

/**
 * Helper class for saving purchase data
 *
 * @author Antonius Metry Saad
 */
public class ImportantSellInformation {
    private String drinkName = "";
    private double price = 0.0;
    private double alcoholPercentage = 0.0;
    private String date = "";
    private String sellerName = "";

    /**
     * Creates a new ImportantSellInformation Object
     *
     * @param drinkName name of the drink that was sold
     * @param price price that was paid for the drink
     * @param alcoholPercentage alcohol percentage inside of the sold drink
     * @param date date of the sale
     * @param sellerName name of the seller
     */
    public ImportantSellInformation(String drinkName, double price, double alcoholPercentage, String date, String sellerName) {
        this.drinkName = drinkName;
        this.price = price;
        this.alcoholPercentage = alcoholPercentage;
        this.date = date;
        this.sellerName = sellerName;
    }

    /**
     * Gets the name of the drink
     *
     * @return drink name
     */
    public String getDrinkName(){return drinkName; }

    /**
     * Gets the name of the seller
     *
     * @return seller name
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Gets the date
     *
     * @return date of purchase
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets the price
     *
     * @return price of drink
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the alcohol percentage of the drink
     *
     * @return alcohol percentage
     */
    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }
}
