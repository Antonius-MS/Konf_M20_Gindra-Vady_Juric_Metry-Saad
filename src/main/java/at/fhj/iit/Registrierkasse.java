package at.fhj.iit;
import java.util.ArrayList;
/**
 * Manages the sellable drinks and saves the purchase data into a list
 *
 * @author Gerwald Gindra-Vady
 * @author Valentina Juric
 * @author Antonius Metry Saad
 */
public class Registrierkasse {
    /**
     * First seller in the shop
     */
    private String seller1 = "Max Mustermann";
    /**
     * Second seller in the shop
     */
    private String seller2 = "Katrin Musterfrau";
    /**
     * List of detailed purchase data
     */
    public static ArrayList<ImportantSellInformation> importantSellInformationList;
    /**
     * List of drinks that are on sale
     */
    public static ArrayList<Sellable> drinksToSellList;

    /**
     * Creates new Registrierkasse
     */
    public Registrierkasse() {
        importantSellInformationList = new ArrayList<ImportantSellInformation>();
        drinksToSellList = new ArrayList<Sellable>();
    }

    /**
     * Buys the drink
     *
     * @param name name of the purchased drink
     * @param date date of purchase
     * @return response of purchase
     */
    public String buyDrink(String name, String date) {
        String currentSeller = "";
        for (Sellable drink : drinksToSellList) {
            if (drink.getName().equals(name)) {
                if (drink.getPrice() < 0) {
                    return "We don't sell this product yet!";
                } else {
                    if (date.contains("Monday") || date.contains("Friday") || date.contains("Saturday"))
                        currentSeller = seller1;
                    else
                        currentSeller = seller2;

                    importantSellInformationList.add(new ImportantSellInformation(drink.getName(), drink.getPrice(), drink.getAlcoholPercent(), date, currentSeller));
                    return "The " + drink.getName() + " costed " + drink.getPrice() + "€ and was sold by " + currentSeller + ". Thank you for your purchase!";
                }
            }
        }
        return "We don't have a product called " + name + "!";
    }
}