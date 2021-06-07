package at.fhj.iit;

/**
 * Represents a RootBeer, that is a liquid and a subclass to Drink
 *
 * @author Gerwald Gindra-Vady
 */
public class RootBeer extends Drink implements Sellable{
    /**
     * price of the root beer
     */
    private double price = -1.0;

    /**
     * knowledge of the beverage root beer
     */
    private boolean iKnowRootBeer;

    /**
     * info about root beer
     */
    private String info = "";

    /**
     * liquid inside of the root beer
     */
    protected Liquid liquid;

    /**
     * Creates a new root beer
     *
     * @param name name of the drink
     * @param liquid liquid used to make this drink
     * @param iKnowRootBeer already known by the consumer
     */
    RootBeer(String name, Liquid liquid, boolean iKnowRootBeer) {
        super(name);
        this.liquid = liquid;
        this.iKnowRootBeer = iKnowRootBeer;
    }

    /**
     * Returns name of liquid root beer
     *
     * @return the name as String
     */
    public String getName() { return name; }

    /**
     * Returns if root beer is known
     *
     * @return if known or not
     */
    public boolean getIKnowRootBeer() { return this.iKnowRootBeer; }

    /**
     * Returns volume of liquid root beer
     *
     * @return the volume in litres
     */
    @Override
    public double getVolume() { return liquid.getVolume(); }

    /**
     * Returns alcohol volume percent of liquid root beer
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent () { return liquid.getAlcoholPercent(); }

    /**
     * Returns if root beer is alcoholic
     *
     * @return if root beer is alcoholic
     */
    @Override
    public boolean isAlcoholic () {
        if(liquid.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    /**
     * Returns info of root beer
     *
     * @return info String
     */
    public String getInfo () { return this.info; }

    /**
     * Prints information about root beer
     */
    public void printInfo () {
        String beverageKnown = iKnowRootBeer == true ? "known" : "unknown";
        info =  "Please enjoy this " + beverageKnown + " Root Beer called " + name + " with " + liquid.getAlcoholPercent() + " percent alcohol by volume";
        System.out.println(info);
    }

    /**
     * Sets the price of this root beer
     *
     * @param price of the root beer
     */
    @Override
    public void setPrice(int price) {
        this.price = liquid.getVolume() * price;
    }


    /**
     * Gets the price of this root beer
     *
     * @return price for this root beer
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Sell this root beer
     */
    @Override
    public void sell() {
        Registrierkasse.drinksToSellList.add(this);
    }

}
