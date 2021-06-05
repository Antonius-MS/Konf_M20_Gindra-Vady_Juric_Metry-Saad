package at.fhj.iit;

/**
 * Represents a coffee that has a liquid inside and can be made with coffee spoons, sugar spoons and milk
 *
 * @author Antonius Metry Saad
 */
public class Coffee extends Drink implements Sellable {
    /**
     * price of the coffee
     */
    private double price = -1.0;

    /**
     * coffee spoons in the coffee
     */
    private int coffeeSpoon = 0;

    /**
     * sugar spoons in the coffee
     */
    private int sugarSpoon = 0;

    /**
     * milk in the coffee
     */
    private boolean withMilk = false;

    /**
     * liquid inside of the coffee
     */
    protected Liquid liquid;

    /**
     * Creates a Coffee object with given name, liquid, coffee spoons, sugar spoons and milk
     *
     * @param name name of the coffee
     * @param liquid liquid inside of the coffee
     * @param coffeeSpoon amount of coffee spoons
     * @param sugarSpoon amount of sugar spoons
     * @param withMilk coffee contains milk
     */
    Coffee(String name, Liquid liquid, int coffeeSpoon, int sugarSpoon, boolean withMilk) {
        super(name);
        this.liquid = liquid;
        this.coffeeSpoon = coffeeSpoon;
        this.sugarSpoon = sugarSpoon;
        this.withMilk = withMilk;
    }

    /**
     * Calculates volume of the coffee
     *
     * @return the volume of coffee in liter
     */
    @Override
    public double getVolume() {
        return liquid.getVolume();
    }

    /**
     * Calculates alcohol percentage of coffee
     *
     * @return alcohol percentage of a coffee
     */
    @Override
    public double getAlcoholPercent() {
        return liquid.getAlcoholPercent();
    }

    /**
     * Checks if coffee is alholic
     *
     * @return if coffee is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        if(liquid.getAlcoholPercent() > 0)
            return true;
        else
            return false;

    }

    /**
     * Adds sugar spoons to the coffee
     *
     * @param amount amount of sugar spoons that should be added
     */
    public void addSugarSpoon(int amount) {
        sugarSpoon = sugarSpoon + amount;
    }

    /**
     * Informs about which coffee has been ordered
     *
     * @return information about name, coffee spoons, sugar spoons and milk of the coffee
     */
    public String toString() {
        String milkInformation = withMilk == false ? "without milk" : "with milk";
        return "You ordered a coffee called " + name + " with " + coffeeSpoon + " coffee spoons" + ", " + sugarSpoon + " sugar spoons and " + milkInformation;
    }

    /**
     * Sets the price of this coffee
     *
     * @param price of the coffee
     */
    @Override
    public void setPrice(int price) {
        this.price = liquid.getVolume() * price;
    }

    /**
     * Gets the price of this coffee
     *
     * @return price for this coffee
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Sell this coffee
     */
    @Override
    public void sell() {
        Registrierkasse.drinksToSellList.add(this);
    }

    /**
     * Gets name of this coffee
     *
     * @return the name of the coffee
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the amount of coffee spoons
     *
     * @return the amount of coffee spoons in the coffee
     */
    public int getCoffeeSpoon() {
        return coffeeSpoon;
    }

    /**
     * Gets the amount of sugar spoons
     *
     * @return the amount of sugar spoons in the coffee
     */
    public int getSugarSpoon() {
        return sugarSpoon;
    }

    /**
     * Checks if coffee is with milk
     *
     * @return if coffee is with milk
     */
    public boolean isWithMilk() {
        return withMilk;
    }
}