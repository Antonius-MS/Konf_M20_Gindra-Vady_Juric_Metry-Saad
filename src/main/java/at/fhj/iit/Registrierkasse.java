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
    public static ArrayList<Sellable>  drinksToSellList;

    /**
     * Creates new Registrierkasse
     */
    public Registrierkasse(){
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

        for(Sellable drink : drinksToSellList) {
            if(drink.getName().equals(name)) {
                if(drink.getPrice() < 0) {
                    return "We don't sell this product yet!";
                }
                else {

                    if(date.contains("Monday") || date.contains("Friday") || date.contains("Saturday"))
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

    /**
     * Creates report of non alcoholic drinks sales
     *
     * @return sales of non alcoholic drinks
     */
    public double reportNonAlcoholicDrinksSales(){
        double sales = 0.0;

        for(ImportantSellInformation soldDrink : importantSellInformationList) {
            if(soldDrink.getAlcoholPercentage() == 0)
                sales += soldDrink.getPrice();
        }

        return sales;
    }

    /**
     * Creates report of low alcoholic drinks sales
     *
     * @return sales of low alcoholic drinks
     */
    public double reportLowAlcoholicDrinks() {
        double sales = 0.0;

        for(ImportantSellInformation soldDrink : importantSellInformationList) {
            if(soldDrink.getAlcoholPercentage() > 0 && soldDrink.getAlcoholPercentage() <= 16 )
                sales += soldDrink.getPrice();
        }

        return sales;
    }

    /**
     * Creates report of high alcoholic drinks sales
     *
     * @return sales of high alcoholic drinks
     */
    public double reportHighAlcoholicDrinks() {
        double sales = 0.0;

        for(ImportantSellInformation soldDrink : importantSellInformationList) {
            if(soldDrink.getAlcoholPercentage() > 16 )
                sales += soldDrink.getPrice();
        }

        return sales;
    }

    /**
     * Creates report of drinks on date
     *
     * @param date date of purchase
     * @return sales of drinks on date
     */
    public double reportDrinksOnDate(String date) {
        double sales = 0.0;

        for(ImportantSellInformation soldDrink : importantSellInformationList) {
            if(soldDrink.getDate().equals(date) )
                sales += soldDrink.getPrice();
        }

        return sales;
    }

    /**
     * Creates report of drinks from seller
     *
     * @param name name of the seller
     * @return sales of drinks from seller
     */
    public double reportDrinksFromPerson(String name) {
        double sales = 0.0;

        for(ImportantSellInformation soldDrink : importantSellInformationList) {
            if(soldDrink.getSellerName().equals(name))
                sales += soldDrink.getPrice();
        }

        return sales;
    }

    /**
     * Creates report of drinks on date and from seller
     *
     * @param name name of the seller
     * @param date date of the purchase
     * @return sales of drinks on date
     */
    public double reportDrinksFromPersonAndOnDate(String name, String date) {
        double sales = 0.0;

        for(ImportantSellInformation soldDrink : importantSellInformationList) {
            if(soldDrink.getSellerName().equals(name) && soldDrink.getDate().equals(date))
                sales += soldDrink.getPrice();
        }

        return sales;
    }

}






